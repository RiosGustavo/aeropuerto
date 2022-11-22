/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.herencia.aeropuerto;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class POOHERENCIAAEROPUERTO {

    //// LOS PONEMOS ACA PARA QUE SE GLOBAL Y AFECTE  A TODO EL PROYECTO
    ///
    static Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    final static int num = 4; /// con esta decimiso cuantos aeropuetos habra  
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];

    public static void main(String[] args) {
        insertarDatosAeropuerto(aeropuertos);
        menu();

    }

    public static void insertarDatosAeropuerto(Aeropuerto aero[]) {

        //// CREAMOS UN AEROPUERTO
        aero[0] = new AeropuertoPublico(80000000, "jorge chavez", "lima", "peru");

        /// CREAMOS UNA COMPAÑIA
        aero[0].insertarCompañia(new Compañia("aeroperu"));
        aero[0].insertarCompañia(new Compañia("latam"));

        //// CREAMOS UN VUELO
        aero[0].getCompañias("aeroperu").insertaVuelo(new Vuelo("IB34", "LIMA", "mANIZALES", 150, 200));
        aero[0].getCompañias("aeroperu").insertaVuelo(new Vuelo("IB99", "MIAMI", "YUCATAN", 950, 130));
        aero[0].getCompañias("latam").insertaVuelo(new Vuelo("rt99", "MIAMI", "londres", 1950, 330));

        /// creamos lista pasajeros
        aero[0].getCompañias("aeroperu").getVuelo("IB34").insertarPasajero(new Pasajero("gustavo", "cc75075", "colombiano"));
        aero[0].getCompañias("aeroperu").getVuelo("IB34").insertarPasajero(new Pasajero("francy", "cc30299", "colombiana"));

        aero[0].getCompañias("latam").getVuelo("rt99").insertarPasajero(new Pasajero("ston", "cc345299", "altruano"));
        aero[0].getCompañias("latam").getVuelo("rt99").insertarPasajero(new Pasajero("rton", "cc3sfs299", "aleman"));

        aero[1] = new AeropuertoPrivado("aerocafe", "palestina", "colombia");
        aero[1].insertarCompañia(new Compañia("ACES"));

        String empresas[] = {"mivuelo", "viaje seguro"};
        /// se hace un down casting por que aeropuerto privado es el que tiene las 
/// empresas y aeropuerto no las tiene
        ((AeropuertoPrivado) aero[1]).insertarEmpresas(empresas);
        
        ((AeropuertoPrivado) aero[1]).getListaEmpresas();
        aero[1].getCompañias("ACES").insertaVuelo(new Vuelo("rt8", "MANIZALES", "BARCELONA", 1990, 200));

        aero[1].getCompañias("ACES").getVuelo("rt8").insertarPasajero(new Pasajero("jorbe", "df34", "paisa"));

        aero[1].insertarCompañia(new Compañia("SATENA"));
        aero[1].getCompañias("SATENA").insertaVuelo(new Vuelo("rt9", "MANIZALES", "ROMA", 1980, 300));
        //// FALTA AGREGAR LOS OTROS DOS AEROPUERTOS
        /// aero[2]
        aero[2] = new AeropuertoPublico(1000000, "DORADO", "BOGOTA", "COLOMBIA");

        /// CREAMOS UNA COMPAÑIA
        aero[2].insertarCompañia(new Compañia("avianca"));
        aero[2].insertarCompañia(new Compañia("latam"));

        //// CREAMOS UN VUELO
        aero[2].getCompañias("avianca").insertaVuelo(new Vuelo("IA34", "LIMA", "mANIZALES", 150, 200));
        aero[2].getCompañias("avianca").insertaVuelo(new Vuelo("IA99", "MIAMI", "YUCATAN", 950, 130));
        aero[2].getCompañias("latam").insertaVuelo(new Vuelo("rt899", "MIAMI", "londres", 1950, 330));

        /// creamos lista pasajeros
        aero[2].getCompañias("avianca").getVuelo("IA34").insertarPasajero(new Pasajero("gustavo", "cc75075", "colombiano"));
        aero[2].getCompañias("avianca").getVuelo("IA34").insertarPasajero(new Pasajero("francy", "cc30299", "colombiana"));

        aero[2].getCompañias("latam").getVuelo("rt899").insertarPasajero(new Pasajero("ston", "cc345299", "altruano"));
        aero[2].getCompañias("latam").getVuelo("rt899").insertarPasajero(new Pasajero("rton", "cc3sfs299", "aleman"));
        /// aero[3]

        aero[3] = new AeropuertoPrivado("santagueda", "caldas", "paisa");
        String emp[] = {"marte", "ave"};
        /// se hace un down casting por que aeropuerto privado es el que tiene las 
/// empresas y aeropuerto no las tiene
        ((AeropuertoPrivado) aero[3]).insertarEmpresas(emp);
        aero[3].insertarCompañia(new Compañia("ACES"));
        aero[3].insertarCompañia(new Compañia("VIVACOLOMBIA"));
        aero[3].getCompañias("VIVACOLOMBIA").insertaVuelo(new Vuelo("rt9", "MANIZALES", "ROMA", 1980, 300));
        aero[3].getCompañias("ACES").insertaVuelo(new Vuelo("rt8", "MANIZALES", "BARCELONA", 1990, 200));
    }

    public static void menu() {
        int option;
        /// con esto creamos objetos
        Aeropuerto aeropuerto;
        Compañia compañia;
        do {

            System.out.println("""
                           \t MENU
                            1. Ver los Aeropuertos Creados (Publicos o Privados)
                            2. Ver empresas-privado o subvencion-publico
                            3. Lista de compañias de un aeropuerto
                            4. Lista de vuelo por compañia
                            5. Listar posibles vuelos de origen a destino 
                            6. SALIR"""
            );
            System.out.print("Opcion  ");
            option = leer.nextInt();

            switch (option) {

                case 1:
                    mostrarAeropuerto(aeropuertos);

                    break;

                case 2:
                    motrarSubvencion(aeropuertos);

                    break;

                case 3:
                    System.out.println("De cual aeropuerto "
                            + "desea conocer las compañias");
                    String nombreAeropuerto = leer.next();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        mostrarCompañias(aeropuerto);
                    }
                    break;

                case 4:
                    System.out.println("Digite nombre aeropuerto");
                    nombreAeropuerto = leer.next();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("el aeropuerto no exite");
                    } else {
                        System.out.println("Digite el nombre de la compañia");
                        String nombreCompañia = leer.next();
                        compañia = aeropuerto.getCompañias(nombreCompañia);
                        mostrarVuelos(compañia);
                    }
                    break;

                case 5:
                    System.out.println("Digite ciudad de origen");
                    String origen = leer.next();
                    System.out.println("Digiete ciuda de Destino");
                    String destino = leer.next();
                    mostrarVueloOrigenDestido( origen,  destino,  aeropuertos);
                    break;

                case 6:

                    break;
                default:
                    System.out.println("Error al ingresar la opcion de menu");
                    System.out.println("             ");
            }

        } while (option != 6);
    }

    public static void mostrarAeropuerto(Aeropuerto aeropuertos[]) {
        for (int i = 0; i < aeropuertos.length; i++) {

            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropurto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad. " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
                System.out.println("***********************");
            } else {
                System.out.println("Aeropurto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad. " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
                System.out.println("***********************");
            }
        }
    }

    public static void motrarSubvencion(Aeropuerto aeropuertos[]) {
        String empresas[];
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto privado " + aeropuertos[i].getNombre());
                /// a se utiliza un down casting
                empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
                /// con este for se muetran las empresas de ese aeropuerto privado
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            } else {
                System.out.println("Aeropuerto Publico " + aeropuertos[i].getNombre());
                /// a se utiliza un down casting
                /// como el arreglo es de aeropuerto pero como lo que necesitamos 
                /// esta en aeropuerto publico con el down casting lo traermos al 
                /// arreglo aeropuerto
                System.out.println("Subvencion dada: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
            }
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
        boolean encontrado = false;
        int i = 0;
        Aeropuerto aero = null;
        /// BUSQUEDA SECUENCIAL
        while ((!encontrado) && (i < aeropuertos.length)) {
            /// con esto le decimos que si algun nombre
            /// ingrsado por el usuairio es igual a alguno de los guardados
            // en la lista de aeropuertos
            if (nombre.equalsIgnoreCase(aeropuertos[i].getNombre())) {
                encontrado = true;
                aero = aeropuertos[i];

            }
            i++;
        }

        return aero;

    }

    public static void mostrarCompañias(Aeropuerto aeropuerto) {
        /// para solo mostar las compañias del aeropuerto
        System.out.println("Las compañias del aeropuerto " + aeropuerto.getNombre());
        for (int i = 0; i < aeropuerto.getNumCompañia(); i++) {
            System.out.println(aeropuerto.getCompañias(i).getNombre());
        }
    }

    public static void mostrarVuelos(Compañia compañia) {
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañia " + compañia.getNombre());
        for (int i = 0; i < compañia.getNumVuelo(); i++) {
            /// con este for recorremos la compañia
            /// mostrando los vuelos que tiene
            /// con el sout mostramos la informacion de cada vuelo
            vuelo = compañia.getVuelo(i);
            System.out.println("Ciudad Origen " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad Destino " + vuelo.getCiudadDestino());
            System.out.println("Precio Vuelo " + vuelo.getPrecio());
            System.out.println("Identificador vuelo " + vuelo.getIdentificador());
            System.out.println("*******************");
        }
    }

    public static Vuelo[] buscarvuelosorigendestiono(String origen, String destino, Aeropuerto aeropuertos[]) {
        /// creamos un objeto de la clase Vuelo
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];
        /// con ese for recorremos los aerpouertos
        for (int i = 0; i < aeropuertos.length; i++) {
            //// con este for recorremos las compañias
            for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) {
                /// con este for recorremos los vuelos
                for (int k = 0; k < aeropuertos[i].getCompañias(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompañias(j).getVuelo(k);
                    if (origen.equalsIgnoreCase(vuelo.getCiudadOrigen()) && destino.equalsIgnoreCase(vuelo.getCiudadDestino())) {
                        contador++;
                    }
                }
            }
        }

        listaVuelos = new Vuelo[contador];
        int q = 0;

        for (int i = 0; i < aeropuertos.length; i++) {
            //// con este for recorremos las compañias
            for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) {
                /// con este for recorremos los vuelos
                for (int k = 0; k < aeropuertos[i].getCompañias(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompañias(j).getVuelo(k);
                    if (origen.equalsIgnoreCase(vuelo.getCiudadOrigen()) && destino.equalsIgnoreCase(vuelo.getCiudadDestino())) {
                        listaVuelos[q] = vuelo;
                        q++;
                    }

                }
            }
        }

        return listaVuelos;

    }

    public static void mostrarVueloOrigenDestido(String origen, String destino, Aeropuerto aeropuertos[]) {
        Vuelo vuelos[];

        vuelos = buscarvuelosorigendestiono(origen, destino, aeropuertos);
       
        if(vuelos.length ==0){
            System.out.println("no exiten vuelos en ese trayecto");
        }else{
               System.out.println("vuelos encontrados");
               for (int i = 0; i < vuelos.length; i++) {
                   System.out.println("Codigo del vuelo"+vuelos[i].getIdentificador());
                   System.out.println("Ciudad Origen"+vuelos[i].getCiudadOrigen());
                   System.out.println("Ciudad Destino"+vuelos[i].getCiudadDestino());
                   System.out.println("Precio"+vuelos[i].getPrecio());
                   System.out.println("++++++++++++++++++++++++++++++");
            }
        }
        
    }

}
