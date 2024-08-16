package aulas;
import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus() {
        System.out.format("Herói %s de nível %d com %d de força!\n", nome , nivel, forca);
    }

    int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = gerador.nextInt(19) + 1;
        int dano = forca + dado20Faces;
        return dano;
    }

    void atacar(String alvo , String habilidade) {
        int danoCausado = calcularDano();
        if (habilidade.length() == 0){
            System.out.format("O Personagem %s atacou %s e causou %d de dano!\n", nome , alvo , danoCausado);
        } else {
            System.out.format("O Personagem %s atacou %s usando %s e causou %d de dano!\n", nome , alvo , habilidade, danoCausado);
        }

    }
}
