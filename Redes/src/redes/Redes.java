
package redes;

import java.util.List;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.core.CloudSim;

/**
 *
 * @author Allas
 */
public class Redes {
    
    // CloudLista
    private static List<Cloudlet> cloudletList;
    
    // Lista Vm
    private static List<Vm> vmlist;
    
    public static void main(String[] args) {
        
        
        
        // inicializando CloudSim
        Cloudlet.init();
        
        System.out.println("CloudSim inicializado");
    }
    
}
