public class EBook extends ItemBibliotecaDigital{
    private int paginas;

    public EBook(String titulo, String autor, String tema, int ano, int paginas){
        super(titulo, autor, tema, ano);
        this.paginas = paginas;
    }

    @Override
    public void descricao() {
        System.out.println("O livro \"" + getTitulo() + "\", escrito por \"" + getAutor() + "\" no ano de " + getAno() + " possui o tema de " + getTema() + ".");
    }

    public int getPaginas() {
        return paginas;
    }


    @Override
    public void baixar() {
        System.out.println("O livro foi baixado.");
    }
}
