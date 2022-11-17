package Controlador;

import java.util.ArrayList;
import java.util.Objects;

import Modelo.Camisa;
import Modelo.Catalogo;
import Modelo.Cliente;

/**
 *
 * @Author Gabriel José Guzmán Leiva
 */

public class Tienda {

    public static ArrayList <Cliente> poolClientes = new ArrayList<Cliente>();
    public static ArrayList <Camisa> poolCamisa = new ArrayList<Camisa>();
    public static ArrayList <Catalogo> poolCatalogos = new ArrayList<Catalogo>();


    public static ArrayList<Cliente> crearCliente(String cedula, String nombre, String primerApellido, String segundoApellido, String direccionExacta, String correoElectronico ){

        poolClientes.add(new Cliente(cedula,nombre, primerApellido, segundoApellido, direccionExacta, correoElectronico));;

        return poolClientes;
    }

    public static ArrayList<Camisa> crearCamisa(String color, char tallaCamisa, String descripcion, String imagen, double precio){

        poolCamisa.add(new Camisa(generarIdRandom(),color, tallaCamisa, descripcion, imagen, precio));

        return poolCamisa;
    }

    public static ArrayList<Catalogo> crearCatalogo(String fechaCreacion, String nombreCatalogo, String mes, int anio){

        poolCatalogos.add(new Catalogo(fechaCreacion, nombreCatalogo, mes, anio));

        return poolCatalogos;
    }

    public static int generarIdRandom(){

        return (int) (Math.random() * poolCamisa.size() + 1) + poolCamisa.size();
    }

    public static void agregarCamisaCatalogo(int idCamisa, String nombreCatalogo){

        int camisaCatalogo = encontrarCamisa(idCamisa);

        if (camisaCatalogo != 0) {

            for (int i = 0; i < poolCatalogos.size(); i++) {

                if (poolCatalogos.get(i).getNombreCatalogo().equals(nombreCatalogo)) {

                    poolCatalogos.get(i).getCatalogoCamisa().add(camisaCatalogo);

                }

            }

        }

    }

    public static int encontrarCamisa (int idCamisa){

        int camisaEncontrar = 0;

        for (Camisa camisa:poolCamisa) {

            if (camisa.getItemID() == idCamisa) {

                camisaEncontrar = camisa.getItemID();

            }
        }

        return camisaEncontrar;
    }
}//Fin programa
