import com.parkingsystem.DAO.ConductorDAO;
import com.parkingsystem.DAO.TicketDAO;
import com.parkingsystem.DAO.VehiculoDAO;
import com.parkingsystem.DAO.Zona_EstacionamientoDAO;
import com.parkingsystem.configuration.Cconnection;
import com.parkingsystem.model.Conductor;
import com.parkingsystem.model.Ticket_Estacionamiento;
import com.parkingsystem.model.Vehiculo;
import com.parkingsystem.model.Zona_Estacionamiento;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class crud {
    
    public static void main(String[] args){
        
//            VehiculoDAO vehiculoDao = new VehiculoDAO();
//            
//            ArrayList<Vehiculo> list = vehiculoDao.listarVehiculos("", null);
        
            TicketDAO ticketDao = new TicketDAO();
            Ticket_Estacionamiento ticket = new Ticket_Estacionamiento();
            
            ticket.setFecha_entrada("29/10/2024");
            ticket.setHora_entrada("00:19");
            ticket.setEstado_ticket("Ocupado");
            ticket.setId_veh(1);
            ticket.setId_zona_est(1);
            ticketDao.agregarTicket(ticket);
//        ConductorDAO model = new ConductorDAO();
//        
//        Conductor conductor = new Conductor();
//        
//        conductor.setId_conductor(1);
//        conductor.setNombre_cond("Isaac");
//        conductor.setApellido_cond("Newton");
//        conductor.setTelefono_cond(923538579);
//        conductor.setDni_cond(72715829);
//        
//        if(model.agregarConductor(conductor)){
//            System.out.println("Guardado");
//        }else {
//            System.out.println("No guardado");
//        }
    }
    
}
