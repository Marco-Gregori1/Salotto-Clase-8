package ar.edu.utn.frbb.tup.clase7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpresaTest {

    @Test
    void testAgregarEmpleadoOk() {
        empresa = new Empresa();
        int cantidadEmpleadosEsperada = 0;
        int cantidadEmpleadosEfectiva = empresa.getCantidadEmpleados();
        assertEquals(cantidadEmpleadosEsperada, cantidadEmpleadosEfectiva);
        Empleado e = new Empleado();
        empresa.agregarEmpleado(e);
        assertEquals(cantidadEmpleadosEfectiva+1, empresa.getCantidadEmpleados());
    }

    void testAgregarProyecto() {
        proyecto = new Proyecto();
        int cantidadProyectosEsperada = 0;
        int cantidadProyectosEfectiva = empresa.getCantidadProyectos();
        assertEquals(cantidadProyectosEsperada, cantidadProyectosEfectiva);
        Proyecto p = new Proyecto();
        empresa.agregarProyecto(p);
        assertEquals(cantidadProyectosEfectiva+1, empresa.getCantidadProyectos());
    }


}
