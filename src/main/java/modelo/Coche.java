package modelo;

import java.sql.Date;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private Date fecha;
    private String propietario;

    public Coche(String matricula, String marca, String modelo,Date fecha, String propietario) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }


}
