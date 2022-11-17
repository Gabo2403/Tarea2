package Modelo;

import java.util.ArrayList;
import java.util.Objects;

public class Catalogo {
    /**
     *
     * @Author Gabriel José Guzmán Leiva
     *
     *
     */

    private String fechaCreacion;
    private String nombreCatalogo;
    private String mes;
    private int anio;
    private ArrayList<Integer> catalogoCamisa;

    public Catalogo(String fechaCreacion, String nombreCatalogo, String mes, int anio, ArrayList<Integer> catalogoCamisa) {
        this.fechaCreacion = fechaCreacion;
        this.nombreCatalogo = nombreCatalogo;
        this.mes = mes;
        this.anio = anio;
        this.catalogoCamisa = catalogoCamisa;

    }

    public Catalogo(String fechaCreacion, String nombreCatalogo, String mes, int anio) {
        this.fechaCreacion = fechaCreacion;
        this.nombreCatalogo = nombreCatalogo;
        this.mes = mes;
        this.anio = anio;
        this.catalogoCamisa = new ArrayList<Integer>();
    }

    public String getNombreCatalogo() {
        return nombreCatalogo;
    }

    public ArrayList<Integer> getCatalogoCamisa() {
        return catalogoCamisa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogo catalogo = (Catalogo) o;
        return anio == catalogo.anio && Objects.equals(fechaCreacion, catalogo.fechaCreacion) && Objects.equals(nombreCatalogo, catalogo.nombreCatalogo) && Objects.equals(mes, catalogo.mes) && Objects.equals(catalogoCamisa, catalogo.catalogoCamisa);
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "fechaCreacion='" + fechaCreacion + '\'' +
                ", nombreCatalogo='" + nombreCatalogo + '\'' +
                ", mes='" + mes + '\'' +
                ", anio=" + anio +
                ", idCamisas=" + catalogoCamisa +
                '}';
    }
}//Fin programa
