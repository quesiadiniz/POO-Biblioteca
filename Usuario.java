import java.util.ArrayList;

public class Usuario {
    
    String nome;
    int matricula;
    int emprestimosAtivos;
    Livro[] emprestimo = new Livro[3];
    ArrayList<Livro> historico = new ArrayList<Livro>();
    double totalMultas;

    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public int qtdEmprestimo(){
        int ativos =0;

        for (int i=0; i<emprestimo.length; i++){
            if (emprestimo[i] != null) ativos++;
        }
        emprestimosAtivos = ativos;

        return emprestimosAtivos;
    }

    public void addLivroEmprestimo(Livro livro){
        if (emprestimosAtivos==3){
            throw new IllegalArgumentException("Usuário já possui 3 empréstimos ativos.");
        }
        else {
            for(int i =0; i<emprestimo.length; i++){
                if(emprestimo[i]==null){
                emprestimo[i]=livro;
                historico.add(livro);
                emprestimosAtivos++;
                System.err.println("Livro - " + livro.titulo + " - emprestado com sucesso!");
                return;
                }
            }
        }
    }
    
    public void devolverLivro(Livro livro){
        for (int i=0; i<emprestimo.length; i++){
            if (emprestimo[i]!=null && emprestimo[i].equals(livro)){
                emprestimo[i] =null;
                emprestimosAtivos--;
                livro.disponibilidade=true;
                System.out.println("Livro \"" + livro.titulo + "\" devolvido com sucesso!");
                return;
            }
        }
    }

    public void listarEmprestimos(){
        System.out.println("Emprestimos Ativos de " + nome + ":");
        for (Livro l : emprestimo){
            if (l!=null){
                System.out.println("- " +  l.titulo);
            }
        }
    }
/* 
    public void adicionarMulta() {
        totalMultas = totalMultas + ;
}*/
    
    
}

