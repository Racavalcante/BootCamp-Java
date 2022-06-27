package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double IMC = peso/ (altura * altura);
        if(IMC < 20) return -1;
        else if(IMC < 25) return 0;
        else return 1;
    }

    public boolean ehMaiorIdade(){
        if(idade >= 18) return true;
        else return false;
    }

    public String toString(){
        return  "Nome: " + nome +
                " Idade: " + idade +
                " ID: " + ID +
                " Peso: " + peso +
                " Altura: " + altura;
    }

}
