package uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.controller;

public class ConcreteCommand extends Command {

    public void execute() {
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    private Receiver lnkReceiver = null;
    private int state;
}
