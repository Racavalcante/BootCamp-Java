package produto;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                "} " + super.toString();
    }

    @Override
    public double calcular(int quantidade){
        double precoCheio = getPreco() * quantidade;
        if(diasParaVencer == 1) return  precoCheio/4;
        if(diasParaVencer == 2) return  precoCheio/3;
        if(diasParaVencer == 3) return  precoCheio/2;
        return precoCheio;
    }
}
