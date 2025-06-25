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


}
