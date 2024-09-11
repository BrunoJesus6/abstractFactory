package org.example.pedido;

import org.example.fabricaAbstrata.FabricaHamburguer;
import org.example.fabricaAbstrata.FabricaLanche;
import org.example.fabricaAbstrata.FabricaSanduiche;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testFabricaHamburguer() {
        FabricaLanche fabrica = new FabricaHamburguer();
        Pedido pedido = new Pedido(fabrica);

        String resultadoLanche = pedido.prepararLanche();
        String resultadoAcompanhamento = pedido.servirAcompanhamento();

        assertEquals("Hamburguer preparado", resultadoLanche);
        assertEquals("Batata Frita servida", resultadoAcompanhamento);
    }

    @Test
    public void testFabricaSanduiche() {
        FabricaLanche fabrica = new FabricaSanduiche();
        Pedido pedido = new Pedido(fabrica);

        String resultadoLanche = pedido.prepararLanche();
        String resultadoAcompanhamento = pedido.servirAcompanhamento();

        assertEquals("Sanduíche preparado", resultadoLanche);
        assertEquals("Salada servida", resultadoAcompanhamento);
    }
}