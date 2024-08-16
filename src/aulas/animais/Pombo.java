package aulas.animais;

public class Pombo extends Ave{
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void cantar() {
        System.out.printf("%s cantou \n", getNome());
    }

    public void enviarCarta() {
        System.out.printf("%s enviou %d cartas \n", getNome() , getCartasEnviadas());
        cartasEnviadas ++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }   
}
