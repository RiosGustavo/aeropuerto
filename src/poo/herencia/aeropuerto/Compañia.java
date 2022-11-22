package poo.herencia.aeropuerto;

/**
 *
 * @author Gusavo
 */
public class Compañia {

    private String nombre;
    /// aca ponesmo 10 numero al azar para
    // decir cuantos vuelos va a haber
    private Vuelo listaVuelos[] = new Vuelo[10];
    private int numVuelo = 0;
/// se crean dos constructores

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, Vuelo v[]) {
        this.nombre = nombre;
        listaVuelos = v;
        numVuelo = v.length;

    }
    
    

    /// con este metodo insetamos los vuelos
    public void insertaVuelo(Vuelo vuelo) {
        listaVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    /// metodo para obtenes el vuelo
    public Vuelo getVuelo(int i) {

        return listaVuelos[i];

    }
    ///buscaer eL VUELO POR BUSQUEDA SECUENCIAL
public Vuelo getVuelo(String id ){
    boolean encontrado =false;
    int i =0;
    Vuelo v = null;
    
    /// ! con este simbolo remplazamos el comando
    /// encontrado = false
    while((!encontrado) && i < listaVuelos.length ){
       
        if(id.equalsIgnoreCase(listaVuelos[i].getIdentificador())){
            encontrado = true;
            v = listaVuelos[i];
        }
        i++;
    }
    
            
        return v;
    
}
    
}
