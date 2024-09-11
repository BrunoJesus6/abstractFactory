package org.example.fabricaAbstrata;

import org.example.acompanhamento.Acompanhamento;
import org.example.lanche.Lanche;

public interface FabricaLanche {
    Lanche criarLanche();
    Acompanhamento criarAcompanhamento();
}