/*
  Isabela Cruz Silva - SP3045072
  Maria Eduarda Lúcio - SP304498X
  Matheus Silva Portes - SP3044912
  Werônica Alves de Melo - SP3045391
*/

import java.util.*;

public class Lista {
    private List<String> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public void adicionar(String elemento) {
        lista.add(elemento);
    }

    public int encontrar(String elemento) {
        for(int i = 0; i < lista.size(); ++i) {
            if(elemento.equals(lista.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public String encontrar(int posicao) {
        if(posicao < 0 || posicao > lista.size()) {
            throw new RuntimeException("Posição inválida");
        }
        return lista.get(posicao);
    }

    public void remover(String elemento) {
        for(int i = 0; i < lista.size(); ++i) {
            if(elemento.equals(lista.get(i))) {
                lista.remove(i);
            }
        }
    }

    public void remover(int posicao) {
        if(posicao < 0 || posicao > lista.size()) {
            throw new RuntimeException("Posição inválida");
        }
        lista.remove(posicao);
    }

    public Map<Integer, String> getMapOrdenado() {  
        List<String> listaOrdenada = lista;
        Collections.sort(listaOrdenada, new Comparator<String>() {
        @Override
        public int compare(String string1, String string2) {
            return string1.compareTo(string2);
        }
        }); 
        
        Map<Integer, String> mapOrdenado = new HashMap<Integer, String>();
        for(int i = 0; i < listaOrdenada.size(); i++) {
            mapOrdenado.put(i + 1, listaOrdenada.get(i));
        }

        return mapOrdenado;
    }

    public String toString() {
        return lista.toString();
    }

    public Collection<String> getCollection() {
        return lista;
    }

    public Iterator<String> getIterator() {
        return lista.iterator();
    }
}