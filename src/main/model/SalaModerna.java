package model;

import prototype.PrototypeAmbiente;

public class SalaModerna
        extends Ambiente {

    public SalaModerna(
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

        return new SalaModerna(
                nome,
                estilo
        );
    }
}