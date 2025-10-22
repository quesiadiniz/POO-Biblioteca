import java.util.ArrayList;

public class Livro{
    String titulo; 
    String autor; 
    int isnb; 
    boolean disponibilidade;
    static ArrayList<Livro> acervo = new ArrayList<>();

    //construtor
    public Livro(String titulo, String autor, int isnb, boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.isnb = isnb;
        this.disponibilidade = disponibilidade;

        acervo.add(this);
        System.out.println("Livro " + titulo + "Cadastrado no acervo");

    }

    public boolean taDisponivel(){
        return disponibilidade;
    }

    public void livrosDisponiveis(){
        System.out.println("Livros Disponiveis nesse momento:");

        for(Livro l : acervo){
            if(l.taDisponivel()==true){
                System.out.println("    - " + l.titulo + " (" + l.autor + ")");
            }
        }
    }


}