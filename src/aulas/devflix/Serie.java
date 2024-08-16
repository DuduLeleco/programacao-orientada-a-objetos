package aulas.devflix;

public class Serie extends Filme{
    private int temporadas;
    private int episodiosPorTemporada;
    private int episodioAtual;
    private int temporadaAtual;


    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    public void play(int temporada , int episodio) {
        if (validarEpisodio(temporada, episodio) == true) {
        this.temporadaAtual = temporada;
        this.episodioAtual = episodio;
        System.out.println("Play: " + toString());
        } else {
            System.out.println("Episódio Inválido.");
        }
        
    }

    private boolean validarEpisodio(int temporada , int episodio) {
       if (temporada == 0 || episodio == 0)
        return false;
       
        if( temporada > temporadas || episodio > episodiosPorTemporada)
        return false;

        return true;
    }

    @Override
    public String toString() {
        String informacao = String.format("%s %d-%02d\nAudio : %s \nLegenda : %s \n", 
        getNome(), 
        temporadaAtual,
        episodioAtual,
        getAudio() , 
        getLegenda());
        return informacao;
    }



    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }


    public int getEpisodioAtual() {
        return episodioAtual;
    }
    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }


    public int getTemporadaAtual() {
        return temporadaAtual;
    }
    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
    
}
