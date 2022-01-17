package uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.view;

public class FuncaoRelogio extends Funcao {

    private static final long serialVersionUID = 1L;

    public FuncaoRelogio() {
        super("Relogio");
        setMostrador(new MostradorRelogio(200));
        initComponents();
    }

    private void initComponents() {
        add(getMostrador());

    }
}
