package proyecto;

public class Auto {
    
 private String idAuto;
 private int puertas; 
 private String marca;
 private String combustible;
 private String transmision;
 private String capacidad;

    public Auto(String idauto, int puertas, String marca, String combustible, String transmision, String capacidad) {
        this.idAuto = idauto;
        this.puertas = puertas;
        this.marca = marca;
        this.combustible = combustible;
        this.transmision = transmision;
        this.capacidad = capacidad;
    }


    public String getIdauto() {
        return idAuto;
    }

    public void setIdauto(String idauto) {
        this.idAuto = idauto;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    
    @Override
    public String toString() {
        return "Auto{" + "idauto= " + idAuto + ", puertas= " + puertas + ", marca= " + marca + ", combustible= " + combustible + ", transmision= " + transmision + ", capacidad= " + capacidad + '}';
    }

    
    

















}//Fin de public class Auto

