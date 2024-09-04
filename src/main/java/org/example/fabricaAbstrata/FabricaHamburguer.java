package org.example.fabricaAbstrata.fabricaAbstrataLanche;

import org.example.acompanhamento.Acompanhamento;
import org.example.acompanhamento.BatataFrita;
import org.example.lanche.Hamburguer;
import org.example.lanche.Lanche;

public class FabricaHamburguer implements FabricaLanche {

    @Override
    public Lanche criarLanche() {
        return new Hamburguer();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new BatataFrita();
    }
}