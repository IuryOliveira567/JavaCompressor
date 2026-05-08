package compactacao;

import java.io.IOException;

public class Rar extends Compactador {

    public Rar(String arquivoEntrada, String arquivoSaida) {
        super(arquivoEntrada, arquivoSaida);
    }

    @Override
    public void compactar() {

        try {

            ProcessBuilder pb = new ProcessBuilder(
                    "rar",
                    "a",
                    arquivoSaida,
                    arquivoEntrada
            );

            pb.inheritIO();

            Process p = pb.start();

            p.waitFor();

            System.out.println("Compactação RAR realizada!");

        } catch (IOException | InterruptedException e) {

            System.out.println("Erro ao compactar RAR.");
            e.printStackTrace();
        }
    }
}