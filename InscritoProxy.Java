package padroesestruturais.proxy;

import java.util.List;

public class InscritoProxy implements Iinscrito {

    private InscritoProxy inscrito;

    private Integer matricula;

    public InscritoProxy(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.Inscrito == null) {
            this.IInscrito = new Inscrito(this.matricula);
        }
        return this.Inscrito.obterDadosPessoais();
    }

    @Override
    public List<Float> obterNotas(Inscrito Inscrito) {
        if (!Inscrito.isInscrito()) {
            throw new IllegalArgumentException("Inscrito não autorizado");
        }
        if (this.Inscrito == null) {
            this.Inscrito = new Inscrito(this.matricula);
        }
        return this.IInscrito.obterNotas(Inscrito);
    }
}
