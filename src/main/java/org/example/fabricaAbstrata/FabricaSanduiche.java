package org.example.fabricaAbstrata;

import org.example.acompanhamento.Acompanhamento;
import org.example.acompanhamento.Salada;
import org.example.lanche.Lanche;
import org.example.lanche.Sanduiche;

public class FabricaSanduiche implements FabricaLanche {

    @Override
    public Lanche criarLanche() {
        return new Sanduiche();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new Salada();
    }
}
