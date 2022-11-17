package Modelo;

import java.util.Objects;

public class Cliente {
    /**
     *
     * @Author Gabriel José Guzmán Leiva
     *
     */
    private String cedula;
    private String nombreCliente;
    private String primerApellido;
    private String segundoApellido;
    private String direccionExacta;
    private String correoElectronico;

    public Cliente(String cedula, String nombreCliente, String primerApellido, String segundoApellido, String direccionExacta, String correoElectronico) {
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccionExacta = direccionExacta;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombreCliente, cliente.nombreCliente) && Objects.equals(primerApellido, cliente.primerApellido) && Objects.equals(segundoApellido, cliente.segundoApellido) && Objects.equals(direccionExacta, cliente.direccionExacta) && Objects.equals(correoElectronico, cliente.correoElectronico);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CedulaCliente='" + cedula + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", direccionExacta='" + direccionExacta + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}//Fin programa
