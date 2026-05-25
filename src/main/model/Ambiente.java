package model;

import prototype.PrototypeAmbiente;

public abstract class Ambiente
        implements PrototypeAmbiente {

    protected String nome;

    protected String estilo;

    public Ambiente(
            String nome,
            String estilo
    ) {

        this.nome = nome;
        this.estilo = estilo;
    }

    public void exibir() {

        System.out.println(
                "Ambiente: " +
                        nome +
                        " | Estilo: " +
                        estilo
        );
    }

    public String getNome() {
        return nome;
    }

    public String getEstilo() {
        return estilo;
    }
}