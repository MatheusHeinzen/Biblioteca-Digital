import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemBibliotecaDigital item = null;

        // Vídeos
        VideoDigital rockLeeGaara = new VideoDigital("Rock Lee VS Gaara (Som de Numb)", "Kishimoto e Chester Bennington", "Melhor Luta", 2008, 441);
        VideoDigital cartaAbertaVazio = new VideoDigital("Carta aberta para o vazio (e pra quem se perdeu nele)", "Ludo Viajante", "Reflexão", 2021, 300);
        VideoDigital exageradoCazuza = new VideoDigital("Exagerado - Cazuza", "Cazuza", "Música", 1989, 260);
        VideoDigital datenaMarcal = new VideoDigital("Datena agride Marçal com cadeirada durante debate da TV Cultura", "TV Cultura", "Debate", 2023, 150);

        // Livros
        EBook odisseia = new EBook("Odisseia", "Homero", "Épico", 800, 576);
        EBook harryPotterCamaraSecreta = new EBook("Harry Potter - A Câmara Secreta", "J.K. Rowling", "Fantasia", 251, 224);
        EBook mitoDeSisifo = new EBook("O Mito de Sísifo", "Albert Camus", "Filosofia", 132, 160);
        EBook bibliaSagrada = new EBook("Bíblia Sagrada", "Diversos Autores", "Religião", 1500, 950);

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("[1] - Livro\n[2] - Vídeo");
            int resposta = sc.nextInt();

            if (resposta == 1) {
                System.out.println("Temos os livros: \n[1] - Odisseia\n[2] - Harry Potter - A Câmara Secreta\n[3] - O Mito de Sísifo\n[4] - Bíblia Sagrada");
                int escolhaLivro = sc.nextInt();
                switch (escolhaLivro) {
                    case 1:
                        item = odisseia;
                        break;
                    case 2:
                        item = harryPotterCamaraSecreta;
                        break;
                    case 3:
                        item = mitoDeSisifo;
                        break;
                    case 4:
                        item = bibliaSagrada;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        return;
                }
                item.descricao();
                item.baixar();
            } else if (resposta == 2) {
                System.out.println("Temos os vídeos: \n[1] - Rock Lee VS Gaara (Som de Numb)\n[2] - Carta aberta para o vazio (e pra quem se perdeu nele)\n[3] - Exagerado - Cazuza\n[4] - Datena agride Marçal com cadeirada durante debate da TV Cultura");
                int escolhaVideo = sc.nextInt();

                switch (escolhaVideo) {
                    case 1:
                        item = rockLeeGaara;
                        break;
                    case 2:
                        item = cartaAbertaVazio;
                        break;
                    case 3:
                        item = exageradoCazuza;
                        break;
                    case 4:
                        item = datenaMarcal; //
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        return;
                }
                item.descricao();
                item.visualizar();
            } else {
                System.out.println("Opção inválida.");
                return;
            }
        }

    }
}