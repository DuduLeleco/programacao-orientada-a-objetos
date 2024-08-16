package aulas.jogo;

public class Arqueiro extends Personagem{
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString() {
        String informacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format("Arma : %s\n", arma);
        return informacaoPersonagem + informacaoArqueiro;
    }
    
    @Override
    public void atacar() {
        System.out.format("O arqueiro atacou usando %s\n" , arma);
    }
}
