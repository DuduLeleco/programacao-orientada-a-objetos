package aulas.jogo2;

public class Guerreiro extends Personagem{

    @Override
    public void atacar() {
    int valorDado = rolarDado();
    if (valorDado < 4) {
        System.out.format("Você errou o ataque e causou apenas %d de dano!\n", valorDado);
    } else if ( valorDado == 6) {
        System.out.format("Você acertou um ataque especial causando %d de dano!\n", valorDado);
    } else {
        System.out.format("Você acertou o golpe e causou %d de dano!\n", valorDado);
    }
    }
    
}
