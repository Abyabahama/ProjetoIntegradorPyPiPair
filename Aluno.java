public class Aluno extends Usuario{
    private String ra;

    public Aluno(String nome, String email, String ra) {
        super(nome, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    

}
