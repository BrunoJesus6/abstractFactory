package org.example.fabricaAbstrata.fabricaAbstrataLanche;

import org.example.acompanhamento.Acompanhamento;
import org.example.lanche.Lanche;

public interface FabricaLanche {
    Lanche criarLanche();
    Acompanhamento criarAcompanhamento();
}