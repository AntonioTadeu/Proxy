package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InscritoProxyTest {

    @Test
    void deveRetornarDadosPessoaisIncrito() {
        InscritoProxy Inscrito = new IncritoProxy(1);

        assertEquals(Arrays.asList("Tadeu", "Vassouras"), Inscrito.obterDadosPessoais());
    }

    @Test
    void deveRetonarExcecaoInscritoNaoAutorizadoConsultarNotasInscrito() {
        try {
            Inscrito Inscrito = new Inscrito("Iabella", false);
            InscritoProxy Inscrito = new InscritoProxy(2);

            Inscrito.obterNotas(Inscrito);
            fail();
        }
        catch (IInscritoArgumentException e) {
            assertEquals("Inscrito não autorizado", e.getMessage());
        }
    }
}