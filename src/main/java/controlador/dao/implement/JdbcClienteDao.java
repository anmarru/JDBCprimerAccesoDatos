package controlador.dao.implement;

import controlador.dao.ClienteDao;
import modelo.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;
import static modelo.utils.DatabaseConfig.*;

public class JdbcClienteDao implements ClienteDao {

    //mi conexion
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(URL, USER, PASS);
    }



    //se llama a insertar cliente de la clase databaseconfig
    @Override
    public void save(Cliente cliente) throws SQLException {
        try (Connection conn= getConnection();
        PreparedStatement statementCliente= conn.prepareStatement(INSERT_CLIENTE);
        ){
            statementCliente.setString(1,cliente.getDni());
            statementCliente.setString(2,cliente.getNombre());
            statementCliente.setString(3,cliente.getApellidos());
            statementCliente.setString(4, cliente.getTelefono());

            statementCliente.execute();
        }
    }


    @Override
    public void delete(Cliente cliente) throws SQLException {
        try (Connection conn= getConnection();
             PreparedStatement statementCliente= conn.prepareStatement(DELETE_CLIENTE);
        ){
            statementCliente.setString(1,cliente.getDni());
        }
    }

    @Override
    public void update(Cliente cliente) throws SQLException {
        try(Connection conn= getConnection();
        PreparedStatement statementCliente= conn.prepareStatement(UPDATE_CLIENTE);
        ){
            statementCliente.setString(1,cliente.getNombre());
            statementCliente.setString(2,cliente.getApellidos());
            statementCliente.setString(3,cliente.getTelefono());
            statementCliente.setString(4,cliente.getDni());
        }
    }

    /*@Override
    public Cliente findByMtricula (String dni) {
        try( Connection conn= getConnection();
                PreparedStatement statementCliente= conn.prepareStatement(findByDni())
                ){

        }
        return null;
    }*/
}
