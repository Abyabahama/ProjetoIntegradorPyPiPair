
public class Partida {
    private long inicio;
    private long fim;
    private long tempo;
    private int pontos;
    
    public static Partida instance;

    Partida(){
        instance = this;
        pontos = 0;
        tempo = 0;
    }
    
    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    public long getFim() {
        return fim;
    }

    public void setFim(long fim) {
        this.fim = fim;
    }

    public long getTempo() {
        return tempo;
    }

    public void setTempo(long tempo) {
        this.tempo = tempo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    

    public void somaFacil(){
        pontos =+ 10;
    }

    public void somaMedio(){
        pontos =+ 20;
    }

    public void somaDificil(){
        pontos =+ 30;
    }

    public void iniciar(){
        inicio = System.currentTimeMillis();
    }
    public void terminar(){
        fim = System.currentTimeMillis();
        tempo = ((fim - inicio) / 1000);
    }

}
