package proyecto;
public class Reservacion {
    
private String idReservacion;
 private String clienteReserva; 
 private int fecha;
 private String hora; 
 private String idAutoReserva;

    public Reservacion(String idReservacion, String clienteReserva, int fecha, String hora, String idAutoReserva) {
        this.idReservacion = idReservacion;
        this.clienteReserva = clienteReserva;
        this.fecha = fecha;
        this.hora = hora;
        this.idAutoReserva = idAutoReserva;
    }

    public String getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(String idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getClienteReserva() {
        return clienteReserva;
    }

    public void setClienteReserva(String clienteReserva) {
        this.clienteReserva = clienteReserva;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdAutoReserva() {
        return idAutoReserva;
    }

    public void setIdAutoReserva(String idAutoReserva) {
        this.idAutoReserva = idAutoReserva;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "idReservacion= " + idReservacion + ", clienteReserva= " + clienteReserva + ", fecha= " + fecha + ", hora= " + hora + ", idAutoReserva= " + idAutoReserva + '}';
    }
    
    
    
    
    
    
    
    
    
    
}//Fin de reservacion
