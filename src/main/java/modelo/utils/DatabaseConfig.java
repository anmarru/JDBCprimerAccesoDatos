package modelo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConfig {
    public static final String URL = "jdbc:mysql://localhost:3306/concesionario";
    public static final String USER = "root";
    public static final String PASS = "admin";

    public static final String CREATE_TABLE_CLIENTE = "CREATE TABLE IF NOT EXISTS clientes (" +
            "dni VARCHAR(255) PRIMARY KEY, " +
            "nombre VARCHAR(255) NOT NULL, " +
            "apellidos VARCHAR(255) NOT NULL," +
            "telefono VARCHAR(255) NULL UNIQUE" +
            ");";

    public static final String CREATE_TABLE_COCHE = "CREATE TABLE IF NOT EXISTS COCHES (" +
            "matricula VARCHAR(255) PRIMARY KEY," +
            "marca VARCHAR(255) NOT NULL," +
            "modelo VARCHAR(255) NOT NULL," +
            "fecha DATE NULL," +
            "propietario VARCHAR(255)," +
            "FOREIGN KEY(propietario) REFERENCES CLIENTES(dni) ON DELETE NO ACTION ON UPDATE CASCADE);";

    //INSERTAR CAMPOS A LA TABLA
    public static final String INSERT_CLIENTE = "INSERT INTO CLIENTES (dni, nombre, apellidos, telefono) VALUES (?,?,?,?)";
    public static final String INSERT_COCHE = "INSERT INTO COCHES (matricula, marca, modelo, fecha, propietario) VALUES (?, ?, ? ,?, ?)";


    //ELIMINAR CAMPOS
    public static final String DELETE_CLIENTE = "DELETE FROM CLIENTES WHERE dni=?";
    public static final String DELETE_COCHE = "DELETE FROM COCHES WHERR matricula= ?";

    //ACTUALIZAR TABLAS
    public static final String UPDATE_CLIENTE = "UPDATE CLIENTES SET nombre = ?, apellidos = ? , telefono = ? WHERE dni = ? ";
    public static final String UPDATE_COCHE = "UPDATE COCHES SET marca= ?, modelo = ? , fecha= ?, propietario = ?, WHERE matricula = ?  ";

    //ELIMINAR TABLAS
    private static final String DROP_TABLE_CLIENTE = "DROP TABLE cliente";
    private static final String DROP_TABLE_COCHES = "DROP TABLE coches";

    public static void createTables() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            stmt.execute(CREATE_TABLE_CLIENTE);
            System.out.println("Se ha creado la tabla clientes");
            stmt.execute(CREATE_TABLE_COCHE);
            System.out.println("Se ha creado la tabla coches");
        }
    }

    public static void dropAndCreateTables() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement()) {
            stmt.execute(DROP_TABLE_CLIENTE);
            System.out.println("Se ha borrado la tabla clientes");
            stmt.execute(DROP_TABLE_COCHES);
            System.out.println("Se ha borrado la tabla coches");
            createTables();
        }
    }


}

