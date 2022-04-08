package padroesestruturais.proxy;

import java.util.List;

public interface IInscrito {
    List<String> obterDadosPessoais();
    List<Float> obterNotas(inscrito inscrito);
}
