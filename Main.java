import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criar livros (já adicionados automaticamente ao acervo)
        Livro l1 = new Livro("O Hobbit", "J.R.R. Tolkien", 123, true);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 456, true);
        Livro l3 = new Livro("1984", "George Orwell", 789, true);
        Livro l4 = new Livro ("Diario de Anne Frank", "Anne Frank", 678, true); 
        Livro l5 = new Livro ("Harry Potter", "J K Rolling", 1234, true);

        // Listar livros disponíveis
        l2.livrosDisponiveis();

        // Criar usuários
        Usuario u1 = new Usuario("Quesia", 101);
        Usuario u2 = new Usuario("João", 102);

        // Fazer empréstimos
        Emprestimo e1 = new Emprestimo(u1, l1, LocalDate.of(2025, 10, 1));
        Emprestimo e2 = new Emprestimo(u1, l2, LocalDate.of(2025, 10, 10));
        Emprestimo e3 = new Emprestimo(u2, l3, LocalDate.of(2025, 10, 15));
        
        //tentanto pegar livro nao disponivel
        Emprestimo e4 = new Emprestimo(u2, l1, LocalDate.of(2025, 10, 1));
        //
        Emprestimo e5 = new Emprestimo(u1, l4, LocalDate.of(2025, 10, 1));

        //tentando pegar mais de 3 livros
        Emprestimo e6 = new Emprestimo(u1, l5, LocalDate.of(2025, 10,1));

        // Listar livros disponíveis
        l2.livrosDisponiveis();

        // Listar empréstimos ativos de Quesia
        u1.listarEmprestimos();

        // Devolver livros
        LocalDate devolucao1 = LocalDate.of(2025, 10, 20); // atraso
        System.out.println("Multa de " + l1.titulo + ": R$ " + e1.multa(devolucao1));
        u1.devolverLivro(l1);

        LocalDate devolucao2 = LocalDate.of(2025, 10, 22); // dentro do prazo
        System.out.println("Multa de " + l2.titulo + ": R$ " + e2.multa(devolucao2));
        u1.devolverLivro(l2);

        // Listar livros disponíveis após devolução
        l1.livrosDisponiveis();
    }
}

