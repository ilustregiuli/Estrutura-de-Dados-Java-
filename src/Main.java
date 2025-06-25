import pesquisaBinaria.PesquisaBinaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PesquisaBinaria pb = new PesquisaBinaria();
        int [] n = {10, 8, 3, 41, 7, 15, 36, 6, 2, 11, 300, 45, 77, 1000 };

        System.out.println("Quero buscar no array o seguinte numero e posicao: ");
        int busca = scanner.nextInt();

        pb.setElementos(n);
        System.out.println(pb.getNumeroElementos());



        scanner.close();


    }


}
