package Algoritmos;

import Interfaces.Algoritmos;

import java.util.ArrayList;

public class BubbleSort implements Algoritmos {

    @Override
    public ArrayList OrdenaVetores(ArrayList<Integer> vetor) {
        // Realizando o bubble propiamente dito
        int tam=vetor.size();

        for (int i=0;i<tam;i++){
            for(int j=0;j<tam-i-1;j++){
                if(vetor.get(j)>vetor.get(j+1)){
                    int aux=vetor.get(j);
                    vetor.set(j,vetor.get(j+1));
                    vetor.set(j+1,aux);

                }
            }

        }
        return vetor;
    }
}