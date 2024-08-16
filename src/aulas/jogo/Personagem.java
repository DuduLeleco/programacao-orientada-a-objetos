package aulas.jogo;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    
    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format("Nome : %s \nClasse : %s \nNivel : %d\n", nome, classe , nivel);
        return informacoes;
    }

    public void atacar() {
        System.out.println("O personagem atacou");
    }

    public final void atacarSemArma() {
        System.out.format("O %s atacou sem arma", nome);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }


    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
