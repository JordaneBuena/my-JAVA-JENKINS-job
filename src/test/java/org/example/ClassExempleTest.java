package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassExempleTest {
    @Test
    void classExemple(){
        final int NOMBRE =5;
        ClassExemple classExemple = new ClassExemple(NOMBRE);
        assertEquals(NOMBRE, classExemple.getNumber()); //TRUE si les 2 sont pareils, false si les 2 sont différents

}
}