public class Livro{
    String titulo; 
    String autor; 
    int isnb; 
    boolean disponibilidade;

    //construtor
    public Livro(String titulo, String autor, int isnb, boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.isnb = isnb;
        this.disponibilidade = disponibilidade;

    }

    public boolean taDisponivel(Livro livro){
        return livro.disponibilidade;
    }


}