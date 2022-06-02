/*
  Isabela Cruz Silva - SP3045072
  Maria Eduarda Lúcio - SP304498X
  Matheus Silva Portes - SP3044912
  Werônica Alves de Melo - SP3045391
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-----Lista-----\n");
            
        Lista lista = new Lista();
        lista.adicionar("Matheus");
        lista.adicionar("Luís");
        lista.adicionar("Bernardo");
        lista.adicionar("Latorre");

        System.out.println("\nElementos da lista: " + lista.toString());
        System.out.println("\nPosição do elemento 'Luís':" + lista.encontrar("Luís"));
        System.out.println("\nElemento da posição 0: " + lista.encontrar(0));

        lista.remover("Bernardo");
        lista.remover(1);
        System.out.println("\nElementos do vetor, após remover elemento: " + lista.toString());


        //---------------------------------------------------------------

        System.out.println("\n-----Lista 1-----\n");
            
        Lista l1 = new Lista();
        l1.adicionar("LP2");
        l1.adicionar("LP3");
        l1.adicionar("AW1");
        l1.adicionar("TDS");
        l1.adicionar("TPO");
        l1.adicionar("BDD");

        l1.remover("BDD");

        Collection<String> collection = l1.getCollection();

        for(String e : collection) {
            System.out.println(e);
        }

        System.out.println("\n-----Lista 2-----\n");
            
        Lista l2 = new Lista();
        l2.adicionar("Piano");
        l2.adicionar("Saxofone");
        l2.adicionar("Trombone");
        l2.adicionar("Violão");
        l2.adicionar("Tímpanos");
        l2.adicionar("Guitarra");

        l2.remover("Saxofone");

        Iterator<String> iterator = l2.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        Map<Integer, String> mapaLista2 = l2.getMapOrdenado();

        System.out.println("\n-----Lista 2 (Ordenada)-----\n");

        for (int i = 1; i <= mapaLista2.size(); i++) {
            System.out.println(mapaLista2.get(i));
        }

        System.out.println("\n-------------------------\n");
    }  	
}
