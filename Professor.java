public class Professor extends Usuario {
    private String idProfessor;
    
    public Professor(String nome, String email, String idProfessor) {
        super(nome, email);
        this.idProfessor = idProfessor;
    }
    
    public String getIdProfessor() {
        return idProfessor;
    }


    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }



}
