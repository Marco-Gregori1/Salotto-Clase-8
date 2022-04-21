package ar.edu.utn.frbb.tup.clase7;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private int codigo;
    private String nombre;
    private Cliente cliente;
    private int montoVenta;
    private List<Empleado> listaEmpleados = new ArrayList<>();


    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getMontoVenta(){
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta){
        this.montoVenta = montoVenta;
    }

    public List<Empleado> getListaEmpleados(){
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados){
        this.listaEmpleados = listaEmpleados;
    }
}
