package ejercicioscajanegra.ejercicio1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionMetodosEstaticosTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("precio alumno: 100 alumnos")
    void calcularPrecioAlumno1() {
        assertEquals(65, ExcursionMetodosEstaticos.calcularPrecioAlumno(100));
    }
    @Test
    @DisplayName("precio alumno: 50 alumnos")
    void calcularPrecioAlumno2() {
        assertEquals(70, ExcursionMetodosEstaticos.calcularPrecioAlumno(50));
    }
    @Test
    @DisplayName("precio alumno: 30 alumnos")
    void calcularPrecioAlumno3() {
        assertEquals(95, ExcursionMetodosEstaticos.calcularPrecioAlumno(30));
    }
    @Test
    @DisplayName("precio alumno: 29 alumnos")
    void calcularPrecioAlumno4() {
        assertEquals((4000/29), ExcursionMetodosEstaticos.calcularPrecioAlumno(29));
    }

    @Test
    @DisplayName("coste total: 100 alumnos")
    void clacularCosteExcursion1() {
        assertEquals(6500, ExcursionMetodosEstaticos.clacularCosteExcursion(100));
    }
    @Test
    @DisplayName("coste total: 50 alumnos")
    void clacularCosteExcursion2() {
        assertEquals(3500, ExcursionMetodosEstaticos.clacularCosteExcursion(50));
    }
    @Test
    @DisplayName("coste total: 30 alumnos")
    void clacularCosteExcursion3() {
        assertEquals(2850, ExcursionMetodosEstaticos.clacularCosteExcursion(30));
    }
    @Test
    @DisplayName("coste total: 29 alumnos")
    void clacularCosteExcursion4() {
        assertEquals(4000, ExcursionMetodosEstaticos.clacularCosteExcursion(29));
    }
}