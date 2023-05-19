public class Questao {
    private int idPergunta;
    private String enunciado;
    private String resposta;
    private int dificuldade;

    public Questao(int idPergunta, String enunciado, String resposta, int dificuldade) {
        this.idPergunta = idPergunta;
        this.enunciado = enunciado;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
    }
    
    public int getIdPergunta() {
        return idPergunta;
    }
    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    public int getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    
}
