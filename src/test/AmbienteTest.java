import model.QuartoGamer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmbienteTest {

    @Test
    public void deveCriarAmbiente() {

        QuartoGamer ambiente =
                new QuartoGamer(
                        "Setup Gamer",
                        "RGB"
                );

        Assertions.assertEquals(
                "Setup Gamer",
                ambiente.getNome()
        );
    }
}