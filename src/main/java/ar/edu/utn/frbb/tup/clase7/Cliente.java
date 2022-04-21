package ar.edu.utn.frbb.tup.clase7;

public class Cliente {
    // atributos cliente
    //(cuit, nombre de la empresa cliente, dirección, provincia)
    private String cuit;
    private String nombreCliente;
    private String direccionCliente;
    private String provinciaCliente;

    //constructores

    public Cliente(String cuit, String nombreCliente, String direccionCliente, String provinciaCliente) {
        this.cuit = cuit;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.provinciaCliente = provinciaCliente;
    }


    // getters y setters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getProvinciaCliente() {
        return ProvinciaCliente;
    }

    public void setProvinciaCliente(String ProvinciaCliente) {
        this.ProvinciaCliente = ProvinciaCliente;
    }

    public int getDireccionCliente() {
        return direccionCliente;
    }

    public void direccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }


    // metodos

    @Override
    public String DatosCliente() {
        return "Cliente{" +
                "Nombre Cliente='" + nombreCliente + '\'' +
                ", Cuit=" + cuit +
                ", Provincia ='" + provinciaCliente + '\'' +
                ", Direccion ='" + direccionClienteCliente + '\'' +
                '}';
    }
}