/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt;

import java.awt.List;
import java.util.TimerTask;
import javax.swing.JLabel;
import java.util.Timer;


/**
 *
 * @author Outline
 */
public class Tarefa extends TimerTask {
    private JLabel lbl;
    private List lPronto, lStatus;
    private java.util.List<Processo> pronto;
    private Timer cronometro;
    
    public Tarefa(Timer _cronometro, JLabel _lbl, java.util.List<Processo> _pronto, List _lPronto, List _lStatus) {
        this.lbl = _lbl;
        this.lPronto = _lPronto;
        this.lStatus = _lStatus;
        this.pronto = _pronto;
        this.cronometro = _cronometro;
    }
    
    @Override
    public void run() {
        if (this.pronto.isEmpty()) {
            this.lStatus.add("Todos os processos foram executados!");
            this.cronometro.cancel();
        }
        else{
            String itemStatus = this.lbl.getText() + "s |-- Executando " + this.pronto.get(0).getNome() + " --| ";
            int t = Integer.parseInt(this.lbl.getText()) + 1;
            this.lbl.setText(String.valueOf(t));
            itemStatus += this.lbl.getText() + " s";
            this.lStatus.add(itemStatus);
            this.pronto.get(0).setTempoExecucao(this.pronto.get(0).getTempoExecucao()-1);

            if (this.pronto.get(0).getTempoExecucao()==0) {
                this.pronto.remove(0);
                this.lPronto.remove(0);
            }
        }
    }
}
