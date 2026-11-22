import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {

    @Test
    void deveRetornarEstrelasHospede() {
        Hospede hospede = new Hospede();
        hospede.setAvaliacao("Excelente");

        assertEquals("Excelente", hospede.getAvaliacao());
    }

    @Test
    void deveRetornarNotaHospede() {
        Hospede hospede = new Hospede();
        hospede.setAvaliacao("Excelente");

        assertEquals(5.0f, hospede.getNota());
    }
}
