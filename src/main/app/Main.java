package app;

import model.HomeOffice;
import model.QuartoGamer;
import prototype.PrototypeAmbiente;

public class Main {

    public static void main(String[] args) {

        QuartoGamer quartoOriginal =
                new QuartoGamer(
                        "Quarto Setup RGB",
                        "Gamer"
                );

        PrototypeAmbiente cloneQuarto =
                quartoOriginal.clonar();

        quartoOriginal.exibir();

        ((QuartoGamer) cloneQuarto)
                .exibir();

        HomeOffice escritorio =
                new HomeOffice(
                        "Escritório Executivo",
                        "Minimalista"
                );

        escritorio.exibir();
    }
}