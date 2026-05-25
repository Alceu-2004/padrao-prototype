import model.QuartoGamer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prototype.PrototypeAmbiente;

public class PrototypeAmbienteTest {

    @Test
    public void deveClonarAmbiente() {

        QuartoGamer original =
                new QuartoGamer(
                        "Quarto Gamer",
                        "RGB"
                );

        PrototypeAmbiente clone =
                original.clonar();

        Assertions.assertNotSame(
                original,
                clone
        );
    }
}