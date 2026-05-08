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
                    "C:\\Program Files\\WinRAR\\Rar.exe",
                    "a",
                    arquivoSaida,
                    arquivoEntrada
            );

            pb.inheritIO();

            Process p = pb.start();
            int resultado = p.waitFor();

            if (resultado == 0) {
                System.out.println("Compactação RAR realizada!");
             } else {
                System.out.println("Erro na compactação RAR.");
             }

        } catch (IOException | InterruptedException e) {

            System.out.println("Erro ao compactar RAR.");
            e.printStackTrace();
        }
    }
}