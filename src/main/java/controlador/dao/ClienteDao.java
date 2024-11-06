package controlador.dao;

import modelo.Cliente;

import java.sql.SQLException;

//el clientedao es una interfaz que implemantara jdbcClientedao
public interface  ClienteDao {

     void save(Cliente cliente) throws SQLException;
     void delete(Cliente cliente) throws SQLException;

     void update(Cliente cliente);

     String findByDni(String dni);


}
