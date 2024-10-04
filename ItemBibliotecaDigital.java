public abstract class ItemBibliotecaDigital implements Baixavel, Visualizavel{
    private String titulo;
    private String autor;
    private String tema;
    private int ano;

    public abstract void descricao();

    public ItemBibliotecaDigital(String titulo, String autor, String tema, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.ano = ano;
    }

    @Override
    public void baixar() {
        System.out.println("Esse arquivo não pode ser baixado.");
    }

    @Override
    public void visualizar() {
        System.out.println("Esse arquivo não pode ser visualizado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public int getAno() {
        return ano;
    }
}
