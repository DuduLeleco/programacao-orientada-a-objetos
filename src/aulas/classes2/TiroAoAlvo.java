package aulas.classes2;

public class TiroAoAlvo implements Jogo{

    public void jogar() {
    System.out.println("Carregando o jogo");
    System.out.println("Conectando ao servidor");
    System.out.println("Carregando Partida");
    }

    @Override
    public void fechar() {
    System.out.println("Salvando progresso do servidor");
    System.out.println("Saindo do jogo");
    }
    
}
