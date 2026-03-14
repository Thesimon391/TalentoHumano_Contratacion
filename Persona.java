package domain;

public class Persona {
    private int idPersona;
    private String nombrePersona;
    private String cedulaPersona;
    private String telefono;
    private String correo;

    public Persona(int idPersona, String nombrePersona, String cedulaPersona, String telefono, String correo) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.cedulaPersona = cedulaPersona;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", cedulaPersona='" + cedulaPersona + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
