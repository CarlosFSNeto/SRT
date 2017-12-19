package srt;

public class Processo {
    
    private String nome;
    private int tempoExecucao;
    
    public Processo(String _nome, int _tempoExecucao) {
        this.nome=_nome;
        this.tempoExecucao = _tempoExecucao;
    }
    
    public int getTempoExecucao() {
        return this.tempoExecucao;
    }
    
    public void setTempoExecucao(int t) {
        this.tempoExecucao = t;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
}
