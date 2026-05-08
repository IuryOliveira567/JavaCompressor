package compactacao;

import java.io.IOException;

public class Zip7 extends Compactador {

    public Zip7(String arquivoEntrada, String arquivoSaida) {
        super(arquivoEntrada, arquivoSaida);
    }

    @Override
    public void compactar() {

        try {

            ProcessBuilder pb = new ProcessBuilder(
                    "7z",
                    "a",
                    arquivoSaida,
                    arquivoEntrada
            );

            pb.inheritIO();

            Process p = pb.start();

            p.waitFor();

            System.out.println("Compactação 7Z realizada!");

        } catch (IOException | InterruptedException e) {

            System.out.println("Erro ao compactar 7Z.");
            e.printStackTrace();
        }
    }
}