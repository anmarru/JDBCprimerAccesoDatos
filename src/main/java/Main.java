import modelo.utils.DatabaseConfig;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {


        try{
            DatabaseConfig.createTables();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }

        try{
            DatabaseConfig.dropAndCreateTables();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }


    }
}
