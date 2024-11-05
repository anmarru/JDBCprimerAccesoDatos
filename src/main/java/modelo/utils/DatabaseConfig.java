package modelo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConfig {
    public static final String URL= "jdbc:mysql://localhost:3306/concesionario";
    public static final String USER="root";
    public static final String PASS="admin";
    public static final String CREATE_TABLE_CLIENTE= "CREATE TABLE IF NOT EXISTS cliente (" +
            "dni VARCHAR(255) PRIMARY KEY, "+
            "nombre VARCHAR(255) NOT NULL, "+
            "apellidos VARCHAR(255) NOT NULL,"+
            "telefono VARCHAR(255) NULL UNIQUE"+
            ");";

    private static final String DROP_TABLE_CLIENTE= "DROP TABLE cliente";

    public static void createTables() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            stmt.execute(CREATE_TABLE_CLIENTE);
            System.out.println("Se ha creado la tabla clientes");
        }
    }

    public static void dropAndCreateTables() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            stmt.execute(DROP_TABLE_CLIENTE);
            System.out.println("Se ha borrado la tabla clientes");
            //createTables();
        }
    }


}

