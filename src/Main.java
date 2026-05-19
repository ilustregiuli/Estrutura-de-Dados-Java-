import pesquisaBinaria.PesquisaBinaria;
import recursao.Recursao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
        Scanner scanner = new Scanner(System.in);
        PesquisaBinaria pb = new PesquisaBinaria();
        int [] n = {10, 8, 3, 41, 7, 15, 36, 6, 2, 11, 300, 45, 77, 1000 };

        System.out.println("Quero buscar no array o seguinte numero e posicao: ");
        int busca = scanner.nextInt();

        pb.setElementos(n);
        System.out.println(pb.getNumeroPesquisado(n, busca));

        scanner.close();
    */


        List<Integer> lista = new ArrayList<>();
        lista.add(1); // 0
        lista.add(2); // 1
        lista.add(5); // 2
        lista.add(2); // 3
        lista.add(10); // 4
        lista.add(7); // 5

        Recursao recursao = new Recursao(lista);

        System.out.println(recursao.soma(recursao.getLista()));


    }


}
