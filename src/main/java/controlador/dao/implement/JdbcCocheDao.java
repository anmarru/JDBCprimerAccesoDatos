package controlador.dao.implement;

import controlador.dao.CocheDao;
import modelo.Coche;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static modelo.utils.DatabaseConfig.*;

public class JdbcCocheDao implements CocheDao {

    //mi conexion
    public Connection getConnection()throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }


    @Override
    public void save(Coche coche) throws SQLException {

    }

    @Override
    public void delete(Coche coche) throws SQLException {

    }

    @Override
    public void update(Coche coche) throws SQLException {

    }

    /*@Override
    public String findByMatricula(String matricula) {
        return "";
    }*/
}
