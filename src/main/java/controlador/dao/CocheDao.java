package controlador.dao;

import modelo.Cliente;
import modelo.Coche;

import java.sql.SQLException;

public interface CocheDao {

    void save(Coche coche) throws SQLException;

    void delete(Coche coche) throws SQLException;

    void update(Coche coche) throws SQLException;

   // String findByDni(String dni);

}
