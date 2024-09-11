package org.example.pedido;

import org.example.acompanhamento.Acompanhamento;
import org.example.fabricaAbstrata.FabricaLanche;
import org.example.lanche.Lanche;

public class Pedido {

    private Lanche lanche;
    private Acompanhamento acompanhamento;

    public Pedido(FabricaLanche fabrica) {
        this.lanche = fabrica.criarLanche();
        this.acompanhamento = fabrica.criarAcompanhamento();
    }

    public String prepararLanche() {
        return this.lanche.preparar();
    }

    public String servirAcompanhamento() {
        return this.acompanhamento.servir();
    }
}