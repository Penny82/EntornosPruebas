package ejemploscajanegra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarIdentificadorTest {

    // declaramos el objeto de la clase
    Comprobaridentificador cID = new Comprobaridentificador();

    @Test
    @DisplayName("Cobertura 1, 4, 6, 9, 11 - identificador válido")
    void validarIdentificador1() {
        cID.setIdentificador("Progra-mador-1");
        assertTrue(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 2 - longitud <= 4")
    void validarIdentificador2() {
        cID.setIdentificador("Prog");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 3 - longitud >= 16")
    void validarIdentificador3() {
        cID.setIdentificador("Progra-mador-112");
        assertFalse(cID.validarIdentificador());
    }
// revisar desde aquí,faltan cosas
    @Test
    @DisplayName("Cobertura 5 - identificador:ni letras, ni digitos, ni guión")
    void validarIdentificador5() {
        cID.setIdentificador("$$$###_?");
        assertFalse(cID.validarIdentificador());
    }
    @Test
    @DisplayName("Cobertura 7 - el identificador tenga guión al principio")
    void validarIdentificador7() {
        cID.setIdentificador("-Progra-mador");
        assertFalse(cID.validarIdentificador());
    }
    @Test
    @DisplayName("Cobertura 8 - el identificador tenga guión al final")
    void validarIdentificador8() {
        cID.setIdentificador("Progra-mador-");
        assertFalse(cID.validarIdentificador());
    }
    @Test
    @DisplayName("Cobertura 10 - que no tenga ninguna letra")
    void validarIdentificador10() {
        cID.setIdentificador("12345-6789");
        assertFalse(cID.validarIdentificador());
    }
    @Test
    @DisplayName("Cobertura 12 - el identificador tenga una palabra reservada")
    void validarIdentificador12() {
        cID.setIdentificador("boolean");
        assertFalse(cID.validarIdentificador());
    }
}