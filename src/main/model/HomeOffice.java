package model;

import prototype.PrototypeAmbiente;

public class HomeOffice
        extends Ambiente {

    public HomeOffice(
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

        return new HomeOffice(
                nome,
                estilo
        );
    }
}