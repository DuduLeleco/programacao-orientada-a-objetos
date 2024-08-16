package aulas;
public class FestaVip {
    int quantidadeCafe = 30;
    int quantidadeSalgado = 50;

    public void entrar() {
        beberCafe();
        comerSalgado();
        beberCafe();
    }

    private void beberCafe() {
        quantidadeCafe--;
        System.out.println("Bebeu uma xícara de café!");
    }

    private void comerSalgado() {
        quantidadeSalgado--;
        System.out.println("Comeu 5 salgados!");
    }

}
