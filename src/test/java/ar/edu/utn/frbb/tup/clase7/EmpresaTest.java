package ar.edu.utn.frbb.tup.clase7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpresaTest {

    Empresa empresa;

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
}
