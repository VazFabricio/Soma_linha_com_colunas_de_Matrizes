import java.util.Random;

public class Main {
    private static void exibeMatriz (int [][] matriz){
        for (int i =0; i< matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    private static void exibeVetor (int [] vetor){
        for (int i = 0; i< vetor.length; i++){
            System.out.print(vetor[i]+"  ");
        }
    }
    private static void preencheMatriz(int [][] matriz, Random aleat){
        for (int i =0; i< matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                matriz[i][j] = aleat.nextInt(0, 10);
            }
        }
    }
    private static int [] somarLinhas(int [][] matriz1){
        int [] soma = new int[4];
        for (int i =0; i< matriz1.length; i++){
            for (int j = 0; j< matriz1[i].length; j++){
                soma[i] += matriz1[i][j];
            }
        }
        return soma;
    }
    private static int [] somarColunas (int [][] matriz) {
        int[] somaCol = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
                somaCol[j] = soma;
            }
        }
        return somaCol;
    }
    public static int [] somaLinhaEColuna(int [] vetor1, int [] vetor2){
        int [] soma = new int[4];
        for (int i = 0; i<vetor1.length; i++){
            soma [i] = vetor1[i]+vetor2[i];
        }
        return soma;
    }
    public static void main(String[] args) {

        Random aleat = new Random();
        int [][] matriz1 = new int[4][6];
        int [][] matriz2 = new int[6][4];

        preencheMatriz(matriz1, aleat);
        preencheMatriz(matriz2, aleat);

        int [] vetor1 = somarLinhas(matriz1);
        int [] vetor2 = somarColunas(matriz2);

        System.out.println("-> Matriz 1 (4x6)");
        exibeMatriz(matriz1);
        System.out.println("-> Matriz 2 (6x4)");
        exibeMatriz(matriz2);
        System.out.println("-> Vetor de soma das linhas de M");
        exibeVetor(vetor1);
        System.out.println(" ");
        System.out.println("-> Vetor de soma das colunas de N");
        exibeVetor(vetor2);
        System.out.println(" ");
        System.out.println("-> Vetor de soma das Linhas de M com as Colunas de N");
        exibeVetor(somaLinhaEColuna(vetor1, vetor2));

    }
}