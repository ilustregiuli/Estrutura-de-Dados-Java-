package pesquisaBinaria;

import bubbleSort.BubbleSort;

public class PesquisaBinaria {

    private int numeroElementos;
    private int[] elementos;
    private BubbleSort bubbleSort;

    public PesquisaBinaria() {
        this.bubbleSort = new BubbleSort();
    }

    public BubbleSort getBubbleSort(){
        return bubbleSort;
    }

    private void setNumeroElementos(int[] elementos) {
        this.numeroElementos = elementos.length;
    }

    public int getNumeroElementos() {
        this.setNumeroElementos(this.elementos);
        return numeroElementos;
    }

    public void setElementos(int[] elementos){
        this.elementos = elementos;
    }

    public String getNumeroPesquisado(int[] elementos, int numero){

        int[] elementosOrdenados = this.bubbleSort.bubbleSort(elementos);

        int inicioLista = 0;
        int finalLista = elementosOrdenados.length - 1;
        int comparacao = 0;

        while (inicioLista <= finalLista){
            int elementoCentral = (inicioLista + finalLista) / 2;
            int tentativa = elementosOrdenados[elementoCentral];
            comparacao++;
            System.out.println("Comparação n: " + comparacao);
            System.out.println("Inicio: " + inicioLista);
            System.out.println("Final: " + finalLista);
            System.out.println("Numero testado: " + tentativa + " , no indice: " + elementoCentral);

            if(tentativa == numero) {
                return ("Numero encontrado! Posicao do array: " + elementoCentral);
            }

          /*  Se o numero testado (tentativa) for maior que o numero a encontrar,
              (numero), redefinimos o "final" da lista diminuindo sendo o meio - 1  */
            if (tentativa > numero){
                finalLista = elementoCentral - 1;
            } else {
          /*   Caso contrario, o numero testado será menor, (tentativa < numero)
               então, temo que redefinir o "inicio", que será o meio + 1      */
                inicioLista =  elementoCentral + 1;
            }
        }

        return "Valor nao encontrado na lista passada";

    }


}
