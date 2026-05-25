package service;

import model.Ambiente;

import java.util.ArrayList;
import java.util.List;

public class AmbienteService {

    private List<Ambiente> ambientes;

    public AmbienteService() {

        ambientes = new ArrayList<>();
    }

    public void adicionarAmbiente(
            Ambiente ambiente
    ) {

        ambientes.add(ambiente);
    }

    public List<Ambiente> getAmbientes() {
        return ambientes;
    }
}