package proyecto_jade;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Mauro
 */
public class Proyecto_jade extends Agent {

    //private AID[] selletAgents = {new AID("busqueda", AID.ISLOCALNAME),new AID("deteccion", AID.ISLOCALNAME)};
    public void setup() {
        addBehaviour(new CyclicBehaviour() {
            public void action() {
                
            }
        });

        
    }

}
