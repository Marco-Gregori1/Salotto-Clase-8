package ar.edu.utn.frbb.tup.clase7;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Empresa empresa = new Empresa();
        Empleado e = new Empleado();

        System.out.println( "Hello World!" );
        Cliente Cliente1 = new Cliente("23264564379","Edenor","Av. Primero de Mayo 1200","Santa Fe");
        System.out.println( Cliente1.toString());
    }
    
}
