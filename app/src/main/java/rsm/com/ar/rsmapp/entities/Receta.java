package rsm.com.ar.rsmapp.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by guido.giosa on 20/8/2017.
 */

public class Receta implements Serializable{

    private String paciente;
    private Date fechaSolicitud;
    private String medicamento;
    private String dosis;
    private String presentación;
    private int cantidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String marca;

    public Receta(String paciente, Date fechaSolicitud, String medicamento, String dosis, String presentación, int cantidad) {
        this.paciente = paciente;
        this.fechaSolicitud = fechaSolicitud;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.presentación = presentación;
        this.cantidad = cantidad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getPresentación() {
        return presentación;
    }

    public void setPresentación(String presentación) {
        this.presentación = presentación;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
