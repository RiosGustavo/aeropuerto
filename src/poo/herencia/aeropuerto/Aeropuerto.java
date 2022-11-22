/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.herencia.aeropuerto;

/**
 *
 * @author User
 */
public class Aeropuerto {

    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCompañias[] = new Compañia[10];
/// con este creamos un iterador para buscar
/// mas adelante la compañia
    private int numCompañia = 0;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompañias = c;
        numCompañia = c.length;
    }

    /// con este metodo insertamos la compañia
    public void insertarCompañia(Compañia compañia) {
        listaCompañias[numCompañia] = compañia;
        numCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañias() {
        return listaCompañias;
    }

    public int getNumCompañia() {
        return numCompañia;
    }

    public Compañia getCompañias(int i) {

        return listaCompañias[i];

    }

    public Compañia getCompañias(String nombre) {
        boolean encontrada = false;
        int i = 0;
        Compañia c = null;

        while (!encontrada && i < listaCompañias.length) {
            if (nombre.equalsIgnoreCase(listaCompañias[i].getNombre())) {
                encontrada = true;
                c = listaCompañias[i];
            }
            i++;
        }

        return c;

    }

}
