package proyecto_jade;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauro 
 */
public class Agente_Busqueda extends Agent {

    static conexiones con = new conexiones();
    static Statement st;

    public void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage message_reci = receive();
                String contenido = "";
                if (message_reci != null) {

                    try {
                        st = con.AbrirConexion().createStatement();
                        String sentencia;                        
                        System.out.println("iniciando busqueda");                        
                        sentencia = "SELECT enlace from enlaces WHERE palabra_clave = '" + message_reci.getContent() + "';";                       
                        
                        ResultSet rs = st.executeQuery(sentencia);
                        
                        System.out.println("Los Enlaces Relacionados con -- "+ message_reci.getContent() +" -- son:");

                        while (rs.next()) {
                            //System.out.println(rs.getString(1) + "\n");
                            contenido = contenido + rs.getString(1) + "\n";

                        }
                       

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Agente_Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Agente_Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    block();
                }
                ACLMessage message_env = new ACLMessage(ACLMessage.REQUEST);
                message_env.setContent(contenido);
                message_env.addReceiver(new AID("deteccion", AID.ISLOCALNAME));
                send(message_env);
            }
        });
    }
}
