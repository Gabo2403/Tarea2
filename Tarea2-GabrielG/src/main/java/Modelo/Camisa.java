package Modelo;

import java.util.Objects;

public class Camisa {

/**
 *
 * @Author Gabriel José Guzmán Leiva
 *
 */

private int itemID;
    private String color;
    private char tallaCamisa;
    private String descripcion;
    private String imagen;
    private double precio;

    public Camisa(int itemID, String color, char tallaCamisa, String descripcion, String imagen, double precio) {
        this.itemID = itemID;
        this.color = color;
        this.tallaCamisa = tallaCamisa;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
    }

    public int getItemID() {
        return itemID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camisa camisa = (Camisa) o;
        return itemID == camisa.itemID && tallaCamisa == camisa.tallaCamisa && Double.compare(camisa.precio, precio) == 0 && Objects.equals(color, camisa.color) && Objects.equals(descripcion, camisa.descripcion) && Objects.equals(imagen, camisa.imagen);
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "itemID=" + itemID +
                ", Color='" + color + '\'' +
                ", tallaCamisa=" + tallaCamisa +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", precio=" + precio +
                '}';
    }
}//Fin programa
