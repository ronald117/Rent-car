package proyecto;

public class Sucursal {
    
 private String idSucursal;
 private String localizacion; 
 private int horario;
 private int telefono;   

    public Sucursal(String idSucursal, String localizacion, int horario, int telefono) {
        this.idSucursal = idSucursal;
        this.localizacion = localizacion;
        this.horario = horario;
        this.telefono = telefono;
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "idSucursal= " + idSucursal + ", localizacion= " + localizacion + ", horario= " + horario + ", telefono= " + telefono + '}';
    }
    
    
    
}//Fin de public class Sucursal
