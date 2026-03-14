package domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.math.RoundingMode;

public class Contrato {
    private int idContrato;
    private String tipoContrato;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean estadoContrato;
    private BigDecimal salario;

    //esta linea de codigo es para redondear a 2 decimales
    public void setSalario(double valor)  {this.salario = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);}

    public Contrato(int idContrato, String tipoContrato, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoContrato, BigDecimal salario) {
        this.idContrato = idContrato;
        this.tipoContrato = tipoContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoContrato = estadoContrato;
        this.salario = salario;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(boolean estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "idContrato=" + idContrato +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", estadoContrato=" + estadoContrato +
                ", salario=" + salario +
                '}';
    }
}
