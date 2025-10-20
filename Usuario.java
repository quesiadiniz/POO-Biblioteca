import java.util.ArrayList;

public class Usuario {

    String nome;
    int matricula;
    Livro[] emprestimos = new Livro[3];
    ArrayList<Livro> historicoLivros = new ArrayList<>();

    //construtor
    public Usuario (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    
   // public int getQuantidadeEmprestimos() {
    
}
