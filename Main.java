import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemBibliotecaDigital item = null;

        // Vídeos
        VideoDigital rockLeeGaara = new VideoDigital("Rock Lee VS Gaara (Som de Numb)", "Kishimoto e Chester Bennington", "Melhor Luta", 2008, 7);
        VideoDigital cartaAbertaVazio = new VideoDigital("Carta aberta para o vazio (e pra quem se perdeu nele)", "Ludo Viajante", "Reflexão", 2021, 10);
        VideoDigital exageradoCazuza = new VideoDigital("Exagerado - Cazuza", "Cazuza", "Música", 1989, 3);
        VideoDigital datenaMarcal = new VideoDigital("Datena agride Marçal com cadeirada durante debate da TV Cultura", "TV Cultura", "Debate", 2023, 1);

        // Livros
        EBook odisseia = new EBook("Odisseia", "Homero", "Épico", 132, 576);
        EBook harryPotterCamaraSecreta = new EBook("Harry Potter - A Câmara Secreta", "J.K. Rowling", "Fantasia", 1997, 224);
        EBook mitoDeSisifo = new EBook("O Mito de Sísifo", "Albert Camus", "Filosofia", 132, 160);
        EBook bibliaSagrada = new EBook("Bíblia Sagrada", "Diversos Autores", "Religião", 12, 950);

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("[1] - Livro\n[2] - Vídeo");
            String resposta = sc.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Temos os livros: \n[1] - Odisseia\n[2] - Harry Potter - A Câmara Secreta\n[3] - O Mito de Sísifo\n[4] - Bíblia Sagrada");
                String escolhaLivro = sc.nextLine();
                switch (escolhaLivro) {
                    case "1":
                        item = odisseia;
                        break;
                    case "2":
                        item = harryPotterCamaraSecreta;
                        break;
                    case "3":
                        item = mitoDeSisifo;
                        break;
                    case "4":
                        item = bibliaSagrada;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        return;
                }
                System.out.println("Gostaria de ver a descrição do livro antes de o baixar?\n[1] - Sim\n[2] - Não");
                String respostaLivro = sc.nextLine();
                if (respostaLivro.equals("1")) {
                    item.descricao();
                }
                System.out.println("Gostaria de o baixar?\n[1] - Sim\n[2] - Não");
                String respostaBaixar = sc.nextLine();
                if (respostaBaixar.equals("1")){
                    item.baixar();
                }
            } else if (resposta.equals("2")) {
                System.out.println("Temos os vídeos: \n[1] - Rock Lee VS Gaara (Som de Numb)\n[2] - Carta aberta para o vazio (e pra quem se perdeu nele)\n[3] - Exagerado - Cazuza\n[4] - Datena agride Marçal com cadeirada durante debate da TV Cultura");
                String escolhaVideo = sc.nextLine();

                switch (escolhaVideo) {
                    case "1":
                        item = rockLeeGaara;
                        break;
                    case "2":
                        item = cartaAbertaVazio;
                        break;
                    case "3":
                        item = exageradoCazuza;
                        break;
                    case "4":
                        item = datenaMarcal; //
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        return;
                }
                System.out.println("Gostaria de ver a descrição do vídeo antes de o visualizar?\n[1] - Sim\n[2] - Não");
                String respostaVideo = sc.nextLine();
                if (respostaVideo.equals("1")) {
                    item.descricao();
                }
                System.out.println("Gostaria de o visualizar?\n[1] - Sim\n[2] - Não");
                String respostaVisualizar = sc.nextLine();
                if (respostaVisualizar.equals("1")){
                    item.visualizar();
                }
            } else {
                System.out.println("Opção inválida.");
                return;
            }
        }

    }
}