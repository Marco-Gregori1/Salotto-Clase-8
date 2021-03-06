package ar.edu.utn.frbb.tup.clase7;

import java.util.ArrayList;
import java.util.List;


public class Empresa {

    private String nombre;
    private String cuit;
    private List<Empleado> empleadoList = new ArrayList<>();
    private List<Proyectos> proyectosList = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    public int getCantidadEmpleados() {
        return empleadoList.size();
    }

    public void agregarEmpleado(Empleado e){
        System.out.println("Agregando empleado " + e.toString());
        this.empleadoList.add(e);
    }

    public List<Proyecto> getProyectosList() {
        return proyectosList;
    }

    public void setProyectosList(List<Proyecto> proyectosList) {
        this.proyectosList = proyectosList;
    }

    public void getCantidadProyectos(){
        return proyectosList.size();
    }

    public void agregarProyecto(Proyecto p){
        System.out.println("Agregando proyecto " + p.toString());
        this.proyectosList.add(p);
    }

    public void reporteDeEmpleados(){
        StringBuffer empleadosBuffer = new StringBuffer();
        for (Empleado empleado:empleadoList) {
            empleadosBuffer.append(empleado.getNombre());
        }
    }
}
