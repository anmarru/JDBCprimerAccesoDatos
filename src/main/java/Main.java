import controlador.ControladorCliente;
import controlador.dao.implement.JdbcClienteDao;
import modelo.Cliente;
import modelo.Coche;
import modelo.utils.DatabaseConfig;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladorCliente controlador= new ControladorCliente();


        //se crea y se borra la tabla clientes
        Cliente cliente1= new Cliente("54569875Q","Andrea", "Martinez ruiz","655236685");
        Cliente cliente2= new Cliente("96568547P","Carlos", "Perez Cardenas","699632568");
        Cliente cliente3= new Cliente("85453687W","Nico", "Ruiz Tabares","699854563");

        Coche coche1= new Coche("4569SDF", "mercedes", "claseA",Date.valueOf("1999-2-25"),cliente1.getDni());
        Coche coche2= new Coche("85698DH", "Seat", "Ibiza",Date.valueOf("1993-5-10"),cliente2.getDni());
        Coche coche3= new Coche("788541GF", "opel", "corsa",Date.valueOf("1990-2-5"),cliente3.getDni());

       /* try {
            controlador.crearTablas();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

        try {
            controlador.guardarCliente(cliente1);
            controlador.guardarCliente(cliente2);
            controlador.guardarCliente(cliente3);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       /* try {

           // controlador.actualizarCliente(cliente1);
           // cliente1.setNombre("Andrea Stephania");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

    }
}
