import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Factura {
    String descripcion;
    int importe;
    int cantidad;
    LocalDate fechaFactura;
    int codigoFactura;


    public Factura(String descripcion, int importe, int cantidad, LocalDate fechaFactura, int codigoFactura) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.cantidad = cantidad;
        this.fechaFactura = fechaFactura;
        this.codigoFactura = codigoFactura;
    }

    public Factura() {
    }

    int getImporte(){
        return importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                ", cantidad=" + cantidad +
                ", fechaFactura=" + fechaFactura +
                ", codigoFactura=" + codigoFactura +
                '}';
    }


}
