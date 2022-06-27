package produto;

public class Distribuidora {
    public static void main(String[] args) {
        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto("Carvão", 5.60);
        produtos[1] = new Produto("Alho", 1.60);
        produtos[2] = new Produto("Shampoo", 8.60);
        produtos[3] = new Produto("Presunto", 12.40);
        produtos[4] = new Produto("Queijo", 5.50);

        for(int i = 0 ; i < 5; i++){
            System.out.println(produtos[i].calcular(5));
        }
    }
}
