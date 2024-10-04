public class VideoDigital extends ItemBibliotecaDigital{
    private int tempo;

    public VideoDigital(String titulo, String autor, String tema, int ano, int tempo){
        super(titulo, autor, tema, ano);
        this.tempo = tempo;
    }

    @Override
    public void descricao() {
        System.out.println("O vídeo \"" + getTitulo() + "\", produzido por \"" + getAutor() + "\" no ano de " + getAno() + " possui o tema de " + getTema() + ".");
    }

    @Override
    public void visualizar() {
        System.out.println("ROla amigos! 🙋‍♂️ O vídeo durou " + getTempo() + " minutos.");
    }

    public int getTempo() {
        return tempo;
    }
}
