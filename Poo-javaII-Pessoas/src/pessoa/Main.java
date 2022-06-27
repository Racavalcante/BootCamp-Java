package pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Alberto", 25, "ASDAS15425");
        Pessoa pessoa3 = new Pessoa("Dalia", 13, "GFAGFD146575", 60.2, 1.68);

        int IMC = pessoa3.calcularIMC();
        boolean maioridade = pessoa3.ehMaiorIdade();

        System.out.println(pessoa3);
        if(IMC == -1) System.out.println("Abaixo do peso");
        else if(IMC == 0) System.out.println("Peso Saudavel");
        else System.out.println("Sobrepeso");

        if(maioridade) System.out.println("Possui mais de 18 anos");
        else System.out.println("possui menos de 18 anos");

    }
}
