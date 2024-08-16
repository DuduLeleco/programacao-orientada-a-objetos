package aulas.classes2;

public class Xadrez implements Jogo{

    public void jogar() {
    System.out.println("Exibir menu");
    System.out.println("Exibir video de jogadas no fundo");
    }

    @Override
    public void fechar() {
    System.out.println("Fechando o jogo");
    }
    
}
