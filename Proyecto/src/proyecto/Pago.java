package proyecto;
public class Pago {
    
 private String idPago;
 private String PagoCliente; 
 private int precio;

    public Pago(String idPago, String PagoCliente, int precio) {
        this.idPago = idPago;
        this.PagoCliente = PagoCliente;
        this.precio = precio;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getPagoCliente() {
        return PagoCliente;
    }

    public void setPagoCliente(String PagoCliente) {
        this.PagoCliente = PagoCliente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago= " + idPago + ", PagoCliente= " + PagoCliente + ", precio= " + precio + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//Fin de Pago
