package ar.edu.utn.frbb.tup.clase7;

public class Cliente {
    // atributos cliente
    //(cuit, nombre de la empresa cliente, dirección, provincia)
    private String cuit;
    private String nombreCliente;
    private String direccionCliente;
    private String provinciaCliente;

    //constructores

    public Cliente(String cuit, String nombreCliente,String provinciaCliente,String direccionCliente) {
        this.cuit = cuit;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.provinciaCliente = provinciaCliente;
    }
    public Cliente(){

    }

    // getters y setters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuil) {
        this.cuit = cuil;
    }

    public String getProvinciaCliente() {
        return provinciaCliente;
    }

    public void setProvinciaCliente(String ProvinciaCliente) {
        this.provinciaCliente = ProvinciaCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }


    // metodos

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre Cliente='" + nombreCliente + '\'' +
                ", Cuit=" + cuit +
                ", Provincia ='" + provinciaCliente + '\'' +
                ", Direccion ='" + direccionCliente + '\'' +
                '}';
    }
}