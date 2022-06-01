package Principal;

import Interfaces.Algoritmos;

import java.util.ArrayList;

public abstract class Ordenadores {
    // Realizando composição
    protected Algoritmos algoritmos;

    // Delegando um comportamento
    public ArrayList ordenarVetores(ArrayList<Integer> vetor){
        return algoritmos.OrdenaVetores(vetor);
    }

    //Getters and setter's

    public Algoritmos getAlgoritmos() {
        return algoritmos;
    }

    public void setAlgoritmos(Algoritmos algoritmos) {
        this.algoritmos = algoritmos;
    }
}
