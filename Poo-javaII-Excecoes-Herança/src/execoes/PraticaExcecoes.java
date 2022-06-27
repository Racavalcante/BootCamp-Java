package execoes;

public class PraticaExcecoes {

    public static void main(String[] args) {
    int a = 0;
    int b = 300;
        try {
           int result = b/a;
        } catch(ArithmeticException ex) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        }
    }
}
