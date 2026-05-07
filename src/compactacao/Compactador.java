package compactacao;

public abstract class Compactador implements ICompactacao {

    protected String arquivoEntrada;
    protected String arquivoSaida;

    public Compactador(String arquivoEntrada, String arquivoSaida) {
        this.arquivoEntrada = arquivoEntrada;
        this.arquivoSaida = arquivoSaida;
    }

    public void mostrarInfo() {
        System.out.println("Arquivo de entrada: " + arquivoEntrada);
        System.out.println("Arquivo de saída: " + arquivoSaida);
    }
}