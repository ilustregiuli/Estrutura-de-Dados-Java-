package bubbleSort;

public class BubbleSort {

    /*  Bubble sort.
        Compara dois pares de elementos, um a um e troca de lugar se
        um for maior que o outro.
        Objetivo: "empurrar" o elemento maior para o final.  */
    public int[] bubbleSort(int[] numeros) {

    /*  O "for" do "i" vai até o total de elementos - 1, pois ao comparar
        cada dupla de elementos, iremos somente até o penúltimo, que será
        comparado com o último. O último elemento não tem próximo para
        comparar.   */
        for (int i = 0; i < numeros.length - 1; i++){
            /*  O "for" do "j" também vai até o penúltimo elemento, por isso usamos
                o - 1 da mesma forma. Porém, além do uso do - 1, subtraímos também
                o valor atual de "i", para que o array vá diminuindo, pois
                a cada passada, será adicionado mais um elemento maior no final, não
                sendo necessário comparar esse último alocado.  */
            for (int j = 0; j < numeros.length -1 - i; j++){
                //Compara se um elemento é maior que seu próximo vizinho (J > J + 1)
                if(numeros[j] > numeros[j + 1]) {
                    // var para guardar o valor de numeros[j] para efetuar a troca
                    int temp = numeros[j];
                    // troca feita, o valor de "j" agora é "j + 1"
                    numeros[j] = numeros[j + 1];
                    /* o valor guardado em "temp", anteriormente de "j", agora é
                       o valor de "j + 1". O número mais alto subiu de posição.    */
                    numeros[j + 1] = temp;
                }
            }
        }
        return numeros;
    }
}
