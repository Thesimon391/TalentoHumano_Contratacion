package domain;

import java.time.LocalDate;

public class GestionEmpleado {
    private int idGestionEmpleado;
    private String registroEmpleado;
    private String listaContrato;
    private LocalDate finalizacionContrato;

    public GestionEmpleado(int idGestionEmpleado, String registroEmpleado, String listaContrato, LocalDate finalizacionContrato) {
        this.idGestionEmpleado = idGestionEmpleado;
        this.registroEmpleado = registroEmpleado;
        this.listaContrato = listaContrato;
        this.finalizacionContrato = finalizacionContrato;
    }

    public int getIdGestionEmpleado() {
        return idGestionEmpleado;
    }

    public void setIdGestionEmpleado(int idGestionEmpleado) {
        this.idGestionEmpleado = idGestionEmpleado;
    }

    public String getRegistroEmpleado() {
        return registroEmpleado;
    }

    public void setRegistroEmpleado(String registroEmpleado) {
        this.registroEmpleado = registroEmpleado;
    }

    public String getListaContrato() {
        return listaContrato;
    }

    public void setListaContrato(String listaContrato) {
        this.listaContrato = listaContrato;
    }

    public LocalDate getFinalizacionContrato() {
        return finalizacionContrato;
    }

    public void setFinalizacionContrato(LocalDate finalizacionContrato) {
        this.finalizacionContrato = finalizacionContrato;
    }

    @Override
    public String toString() {
        return "GestionEmpleado{" +
                "idGestionEmpleado=" + idGestionEmpleado +
                ", registroEmpleado='" + registroEmpleado + '\'' +
                ", listaContrato='" + listaContrato + '\'' +
                ", finalizacionContrato=" + finalizacionContrato +
                '}';
    }
}
