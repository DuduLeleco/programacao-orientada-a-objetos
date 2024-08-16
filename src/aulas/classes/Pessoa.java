package aulas.classes;


public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome , int idade , float altura) {
        System.out.println("Olá mundo");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void imprimirDados() {
    System.out.format("Nome: %s  ;  Idade: %d  ;  Altura: %.1f\n" ,
    nome , idade , altura);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
