package poo.herencia.aeropuerto;

/**
 *
 * @author Gustavo
 */
public class Vuelo {

    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }

    public void insertarPasajero(Pasajero pasajero) {
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public void setNumMaxPasajeros(int numMaxPasajeros) {
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public void setNumActualPasajeros(int numActualPasajeros) {
        this.numActualPasajeros = numActualPasajeros;
    }

    /// con este metodo encontramos un pasajero de la lista
    /// y retornamos el masajero  int i para que lo busque como
    // iterador
    public Pasajero getPasajero(int i) {

        return listaPasajeros[i];

    }

    ///BUSQUEDA SECUENCIAL
    /// para que busque al pasajero por el pasaporte
    public Pasajero getPasajero(String pasaporte) {
        boolean encontrado = false;
        int i = 0;

        Pasajero pas = null;
        /// con el siguiente while hacemos una busqueda secuencial

        while (encontrado == false && i < listaPasajeros.length) {
            /// aca se busca en la lista de pasajeros que el que esta en la
            // posicion i tenga el mismo que esta en getPasaporte
            if (pasaporte == listaPasajeros[i].getPasaporte()) {
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }

        return pas;

    }

}
