package controlador;

import controlador.dao.ClienteDao;
import controlador.dao.implement.JdbcClienteDao;

public class ControladorCliente {
    private ClienteDao clienteDao;

    public ControladorCliente(){
        this.clienteDao= new JdbcClienteDao();
    }

}
