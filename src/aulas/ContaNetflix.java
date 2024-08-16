package aulas;
public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar() {
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    private void buscarPreferenciasDoUsuario() {
        idiomaPreferencial = "PT-BR";
    }

    private void identificarResolucao() {
        resolucaoTela = "FULL HD";
    }
 
    public void assistirFilme (String nomeFilme) {
        System.out.format("Iniciando o filme %s \n" , nomeFilme);
        System.out.format("Carregando o filme na resolução %s \n", resolucaoTela);
        carregarAudioFilme();
    }
    
    private void carregarAudioFilme() {
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.format("Carregando o audio em %s\n ", idiomaPreferencial);
        } else {
            System.out.println("Carregando o áudio em EN-US");
        }
    }
}
