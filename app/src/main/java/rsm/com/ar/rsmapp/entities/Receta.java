package rsm.com.ar.rsmapp.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by guido.giosa on 20/8/2017.
 */

public class Receta implements Serializable{

    public String paciente;
    public Date fechaSolicitud;
    public String medicamento;
    public String dosis;
    public String presentación;
    public int cantidad;

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
