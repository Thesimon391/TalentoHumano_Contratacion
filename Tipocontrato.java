package Domain;

public class Tipocontrato {
    private int idTipoContrato;
    private String nombretipoContrato;
    private String especificacion;

    public Tipocontrato(int idTipoContrato, String nombretipoContrato, String especificacion) {
        this.idTipoContrato = idTipoContrato;
        this.nombretipoContrato = nombretipoContrato;
        this.especificacion = especificacion;
    }

    public int getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(int idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public String getNombretipoContrato() {
        return nombretipoContrato;
    }

    public void setNombretipoContrato(String nombretipoContrato) {
        this.nombretipoContrato = nombretipoContrato;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    @Override
    public String toString() {
        return "Tipocontrato{" +
                "idTipoContrato=" + idTipoContrato +
                ", nombretipoContrato='" + nombretipoContrato + '\'' +
                ", especificacion='" + especificacion + '\'' +
                '}';
    }
}
