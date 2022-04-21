package ar.edu.utn.frbb.tup.clase7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    @Test
    void toStringTest() {
        Empleado e = new Empleado();
        e.setNombre("Lucho");
        e.setCuil("23264564379");
        e.setPuesto("Desarrollador");

        assertEquals("Empleado{nombre='Lucho', cuil=23264564379, puesto='Desarrollador'}",e.toString());

    }
}
