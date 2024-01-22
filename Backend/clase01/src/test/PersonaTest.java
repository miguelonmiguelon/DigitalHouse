package test;

import org.junit.Test;
import persona.Persona;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    @Test

    public void siEsMayorDeEdad(){
        Persona miguel = new Persona(28, LocalDate.now(),LocalDate.of(1995,12,23));
        Persona sara = new Persona(8,LocalDate.now(),LocalDate.of(2015,1,1));

        boolean esMayorDeEdad1 = miguel.esMayorDeEdad();
        boolean esMayorDeEdad2 = sara.esMayorDeEdad();

        assertEquals(true, miguel.esMayorDeEdad());
        assertFalse(esMayorDeEdad2);
    }
}