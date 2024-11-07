package controlador;

import controlador.dao.ClienteDao;
import controlador.dao.implement.JdbcClienteDao;
import modelo.Cliente;
import modelo.utils.DatabaseConfig;

import java.sql.SQLException;

public class ControladorCliente {

    private ClienteDao clienteDao;

    public ControladorCliente(){
        this.clienteDao= new JdbcClienteDao();
    }

    //crear la tablas
    public void crearTablas() throws SQLException {
        DatabaseConfig.createTables();
    }

    //borrar tablas
    public void borrarTablas() throws SQLException {
        DatabaseConfig.dropAndCreateTables();
    }


    public void guardarCliente(Cliente cliente) throws SQLException {
        clienteDao.save(cliente);
    }

    public void actualizarCliente(Cliente cliente) throws SQLException {
        clienteDao.update(cliente);
    }

    public void borrarCliente(Cliente cliente) throws SQLException {
        clienteDao.delete(cliente);
    }
}
