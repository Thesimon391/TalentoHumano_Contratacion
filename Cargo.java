package Domain;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cargo {
    private int idCargo;
    private String nombreCargo;
    private String descripcion;
    private BigDecimal salario;

    //esta linea es para reedondear a dos decimales el salario
    public void setSalario(double valor) {this.salario = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);}

    public Cargo(int idCargo, String nombreCargo, String descripcion, BigDecimal salario) {
        this.idCargo = idCargo;
        this.nombreCargo = nombreCargo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "idCargo=" + idCargo +
                ", nombreCargo='" + nombreCargo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", salario=" + salario +
                '}';
    }
}
