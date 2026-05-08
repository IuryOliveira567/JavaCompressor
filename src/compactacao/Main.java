package compactacao;

public class Main {

    public static void main(String[] args) {

        String entrada = "arquivo.txt";

        ICompactacao zip =
                new Zip(entrada, "arquivo.zip");

        ICompactacao zip7 =
                new Zip7(entrada, "arquivo.7z");

        ICompactacao rar =
                new Rar(entrada, "arquivo.rar");

        zip.compactar();

        zip7.compactar();

        rar.compactar();
    }
}