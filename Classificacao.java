import java.time.Duration;

public class Classificacao {
    private String dono;
    private int pontos;
    private Duration tempo;

    public Classificacao(String dono, int pontos, Duration tempo) {
        this.dono = dono;
        this.pontos = pontos;
        this.tempo = tempo;
    }
    
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public Duration getTempo() {
        return tempo;
    }
    public void setTempo(Duration tempo) {
        this.tempo = tempo;
    }

    
}
