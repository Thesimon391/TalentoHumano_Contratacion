package domain;

import java.time.LocalDate;

public class Empleado {
    private int idEmpleado;
    private String cargo;
    private String departamento;
    private LocalDate fechaIngreso;

    public Empleado(int idEmpleado, String cargo, String departamento, LocalDate fechaIngreso) {
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.departamento = departamento;
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", cargo='" + cargo + '\'' +
                ", departamento='" + departamento + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
