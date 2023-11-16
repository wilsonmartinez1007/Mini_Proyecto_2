public class Ciudadano {
    private String nombre;
    private String cedula;
    private String ciudad;
    public Ciudadano(String nombre, String cedula, String ciudad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}

