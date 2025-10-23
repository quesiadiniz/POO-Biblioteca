import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

    Usuario user;
    Livro emprestado;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;
    LocalDate dataDevolveu;

    //construtor
    public Emprestimo(Usuario user, Livro emprestado, LocalDate dataEmprestimo){
    
        if (emprestado.taDisponivel()== false){
            throw new IllegalArgumentException("Livro nao disponivel para emprestimo.");
        }
        if (user.emprestimosAtivos>=3){
            throw new IllegalArgumentException("Não pode pegar mais que 3 livros!");
        }

        this.user = user;
        this.emprestado = emprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataEmprestimo.plusDays(14);

        this.emprestado.disponibilidade = false;
        this.user.addLivroEmprestimo(emprestado);
    }

    @Override
    public String toString() {
        return "Empréstimo de " + emprestado.titulo + " para " + user.nome +
           " em " + dataEmprestimo + " (devolver até " + dataDevolucao + ")";
    }

    public double multa(LocalDate dataDevolveu){
        this.dataDevolveu = dataDevolveu;

        long atraso = ChronoUnit.DAYS.between(dataDevolucao, dataDevolveu);
        
        if(atraso<=0){
            return 0.0;
        }

        double totalMulta = atraso*1.5;
        return totalMulta;
    }

    
}

