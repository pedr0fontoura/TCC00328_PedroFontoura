package uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.view;

import java.awt.event.ActionEvent;

import uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.model.Temporizador;
import uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.controller.Command;
import uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.controller.StartCommand;
import uff.ic.lleme.tcc00328.aula.exemplo.thread.temporizador.controller.StopCommand;

public class BotaoStartStop extends BotaoTemp implements Observer {

    private static final long serialVersionUID = 1753196423695635058L;
    private String operacao = null;
    private Command startCommand = null;
    private Command stopCommand = null;

    public BotaoStartStop(Temporizador temporizador) {
        super("Start", temporizador);
        this.operacao = "Start";
        getMySubjectTemporizador().attach(this);
        this.startCommand = new StartCommand(temporizador);
        this.stopCommand = new StopCommand(temporizador);
    }

    public void actionPerformed(ActionEvent e) {
        e.getActionCommand();
        if (operacao.equals("Start"))
            this.startCommand.execute();
        else if (operacao.equals("Stop"))
            this.stopCommand.execute();
    }

    public void update() {
        Thread o = getMySubjectTemporizador().getClockThread();
        if (o == null) {
            this.operacao = "Start";
            this.setLabel(this.operacao);
            repaint();
        } else {
            this.operacao = "Stop";
            this.setLabel(this.operacao);
            repaint();
        }
    }

    public void accept(Visitor visitor) {
        visitor.VisitBotaoStartStop(this);
    }
}
