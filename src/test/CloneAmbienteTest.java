import model.HomeOffice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prototype.PrototypeAmbiente;

public class CloneAmbienteTest {

    @Test
    public void deveClonarHomeOffice() {

        HomeOffice original =
                new HomeOffice(
                        "Office",
                        "Minimalista"
                );

        PrototypeAmbiente clone =
                original.clonar();

        Assertions.assertNotNull(
                clone
        );
    }
}