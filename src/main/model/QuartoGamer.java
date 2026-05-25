package model;

import prototype.PrototypeAmbiente;

public class QuartoGamer
        extends Ambiente {

    public QuartoGamer(
            String nome,
            String estilo
    ) {

        super(
                nome,
                estilo
        );
    }

    @Override
    public PrototypeAmbiente clonar() {

        return new QuartoGamer(
                nome,
                estilo
        );
    }
}