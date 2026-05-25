import model.QuartoGamer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.AmbienteService;

public class AmbienteServiceTest {

    private AmbienteService service;

    @BeforeEach
    public void configurar() {

        service = new AmbienteService();
    }

    @Test
    public void deveAdicionarAmbiente() {

        service.adicionarAmbiente(
                new QuartoGamer(
                        "Quarto",
                        "RGB"
                )
        );

        Assertions.assertEquals(
                1,
                service.getAmbientes().size()
        );
    }
}