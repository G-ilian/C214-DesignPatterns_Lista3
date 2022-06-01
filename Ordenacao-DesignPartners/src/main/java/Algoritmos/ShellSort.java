package Algoritmos;

import Interfaces.Algoritmos;

import java.util.ArrayList;

public class ShellSort implements Algoritmos {
    @Override
    public ArrayList OrdenaVetores(ArrayList<Integer> vetor) {
        int tam=vetor.size();

        for(int i=tam/2;i>0;i/=2){
            for(int k=i;k<tam;k++){
                int temp=vetor.get(k);

                int j;

                for(j=i;j>=i&&vetor.get(j-i)>temp;j-=i){
                    vetor.set(j,vetor.get(j-i));
                }
                temp=vetor.get(j);
            }
        }
        return vetor;
    }
}
