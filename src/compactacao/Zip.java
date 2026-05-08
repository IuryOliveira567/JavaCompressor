package compactacao;

import java.io.IOException;

public class Zip extends Compactador {

    public Zip(String arquivoEntrada, String arquivoSaida) {
        super(arquivoEntrada, arquivoSaida);
    }

    @Override
    public void compactar() {

        try {

            String comando = "powershell Compress-Archive "
                    + arquivoEntrada + " "
                    + arquivoSaida;

            ProcessBuilder pb = new ProcessBuilder(
                    "powershell",
                    "Compress-Archive",
                    arquivoEntrada,
                    arquivoSaida
            );

            pb.inheritIO();

            Process p = pb.start();

            p.waitFor();

            System.out.println("Compactação ZIP realizada!");

        } catch (IOException | InterruptedException e) {

            System.out.println("Erro ao compactar ZIP.");
            e.printStackTrace();
        }
    }
}