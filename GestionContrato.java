package domain;

public class GestionContrato {
    private int gestionContrato;
    private String crearContrato;
    private String listaContrato;
    private String finalizarContrato;

    public GestionContrato(int gestionContrato, String crearContrato, String listaContrato, String finalizarContrato) {
        this.gestionContrato = gestionContrato;
        this.crearContrato = crearContrato;
        this.listaContrato = listaContrato;
        this.finalizarContrato = finalizarContrato;
    }

    public int getGestionContrato() {
        return gestionContrato;
    }

    public void setGestionContrato(int gestionContrato) {
        this.gestionContrato = gestionContrato;
    }

    public String getCrearContrato() {
        return crearContrato;
    }

    public void setCrearContrato(String crearContrato) {
        this.crearContrato = crearContrato;
    }

    public String getListaContrato() {
        return listaContrato;
    }

    public void setListaContrato(String listaContrato) {
        this.listaContrato = listaContrato;
    }

    public String getFinalizarContrato() {
        return finalizarContrato;
    }

    public void setFinalizarContrato(String finalizarContrato) {
        this.finalizarContrato = finalizarContrato;
    }

    @Override
    public String toString() {
        return "GestionContrato{" +
                "gestionContrato=" + gestionContrato +
                ", crearContrato='" + crearContrato + '\'' +
                ", listaContrato='" + listaContrato + '\'' +
                ", finalizarContrato='" + finalizarContrato + '\'' +
                '}';
    }
}
