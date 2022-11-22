
package poo.herencia.aeropuerto;

/**
 *
 * @author gustavo
 */
public class Pasajero {
    private String nombre;
    private String Pasaporte;
    private String nacionalidad;

    public Pasajero() {
    }

    public Pasajero(String nombre, String Pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.Pasaporte = Pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public void setPasaporte(String Pasaporte) {
        this.Pasaporte = Pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", Pasaporte=" + Pasaporte + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
