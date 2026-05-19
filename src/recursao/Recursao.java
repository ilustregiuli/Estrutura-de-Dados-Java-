package recursao;

import java.util.List;

public class Recursao {

    private List<Integer> lista;

    public Recursao(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public Integer soma(List<Integer> lista) {
        if(lista.size() == 1){
            return lista.getFirst();
        } else {
            return lista.removeFirst() + this.soma(lista);
        }
    }


}
