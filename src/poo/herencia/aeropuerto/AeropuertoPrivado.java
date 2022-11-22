/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.aeropuerto;

/**
 *
 * @author User
 */
public class AeropuertoPrivado extends Aeropuerto {
    private String listaEmpresas [] = new String[10];
    private int numEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas =e;
        numEmpresa = e.length;
    }
    //// con este metodo se ingresan las mpresas 
    /// todas de una sola osea a la vez
    public void insertarEmpresas(String e[]){
        
        this.listaEmpresas = e;
        this.numEmpresa = e.length;
    }
    
    /// con este medoto ingresamos la empresas una por una
    
    public void insertarEmpresa(String e){
        listaEmpresas[numEmpresa] = e;
        numEmpresa++;
    }
/// con estos getter motramos o TODAS LAS EMPRESAS
    public String[] getListaEmpresas() {
        return listaEmpresas;
    }
    /// O UNA EN PARTICULAR
    public int getNumEmpresa() {
        return numEmpresa;
    }
    
    
}
