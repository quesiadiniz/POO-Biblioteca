import java.time.LocalDate;

public class Emprestimo {

    Usuario user;
    Livro emprestado;
    LocalDate data;

    //construtor
    public Emprestimo(Usuario user, Livro emprestado, LocalDate date){
        this.user = user;
        if (emprestado.disponibilidade == false){
            throw new IllegalArgumentException("Livro não disponível para empréstimo.");
        }

        //if ()
        //this.emprestado = emprestado;
    }

}
