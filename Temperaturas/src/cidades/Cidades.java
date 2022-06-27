package cidades;

public class Cidades {




    public static void main(String[] args) {
        String[] cidades = { "Londres", "Madrid", "Nova York", "Buenos aires", "Asunção", "São Paulo", "Lima", "Satiago", "Lisboa", "Tokio"} ;
        int maxEMin [][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int maxima = 1;
        int minima = 0;

        for(int i = 1; i <= 9; i ++){
            if(maxEMin[i][0] < maxEMin[minima][0]){
                minima = i;
            }
            if(maxEMin[i][1] > maxEMin[maxima][1]){
                maxima = i;
            }
        }

        System.out.println("temperatura minima: " + cidades[minima] + " " + maxEMin[minima][0]);
        System.out.println("temperatura maxima: " + cidades[maxima] + " " + maxEMin[maxima][1]);
    }
}
