import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            String caminhoArquivo = "arquivo.txt";
        BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));

        escritor.write("Olá tudo bem?");

        escritor.close();
        } catch (Exception erro) {
            System.out.println("Houve um problema ");
            erro.printStackTrace();
        }
}
}