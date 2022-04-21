package ar.edu.utn.frbb.tup.clase7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    void toStringTest() {
        Cliente e = new Cliente();
        e.setNombreCliente("Edenor");
        e.setCuit("23264564379");
        e.setProvinciaCliente("Santa Fe");
        e.setDireccionCliente("Av. Primero de Mayo 1990");

        assertEquals("Cliente{Nombre Cliente='Edenor', Cuit=23264564379, Provincia ='Santa Fe', Direccion ='Av. Primero de Mayo 1990'}",e.toString());

    }
}
