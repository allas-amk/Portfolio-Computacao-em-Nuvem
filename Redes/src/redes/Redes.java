
package redes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;

/**
 *
 * @author Allas
 */
public class Redes {
    
    // CloudLista
    private static List<Cloudlet> cloudletList;
    
    // Lista Vm
    private static List<Vm> vmlist;
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        Log.printLine("Iniciando o CloudSim...");
        
        try {
            int numero_usuario = 1; // número de usuários dentro da simulação
            Calendar calendario = Calendar.getInstance(); // usamos para marcar o início da simulação
            boolean sinalizador_de_rastreamento = false; // é um arquivo que usamos para gerar relatorios
            
            // Inicializando o CloudSim
            CloudSim.init(numero_usuario, calendario, sinalizador_de_rastreamento);
            
            // Criando o DataCenter
            Datacenter datacenter0 = createDatacenter("Datacenter_0");
            
        }
        catch(Exception e) {}
        
    }

    private static Datacenter createDatacenter(String datacenter_0) {
        
        // Criando o Host dentro de uma lista 
        List<Host> hostList = new ArrayList<Host>();
        
        // Criando o núcleo, que é a classe do CloudSim, que significa os processadores
        List<Pe> peList = new ArrayList<Pe>();
        
        int mips = 1000;
        
        peList.add(new Pe(0, new PeProvisionerSimple(mips)));
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
