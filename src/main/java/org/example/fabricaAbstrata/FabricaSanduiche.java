package org.example.fabricaAbstrata.fabricaAbstrataLanche;

import org.example.acompanhamento.Acompanhamento;
import org.example.acompanhamento.Salada;
import org.example.lanche.Lanche;

public class FabricaSanduiche implements FabricaLanche {

    @Override
    public Lanche criarLanche() {
        return new SanduicheLanche();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new Salada();
    }
}
