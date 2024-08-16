package aulas.classes2;

public class PingPong implements Jogo {

    public void jogar() {
    System.out.println("Tela de Apresentação do jogo");
    System.out.println("Menu inicial");
    }

    @Override
    public void fechar() {
    System.out.println("Salvar o progresso do jogo");
    System.out.println("Fechar o jogo");
    }
    
}
