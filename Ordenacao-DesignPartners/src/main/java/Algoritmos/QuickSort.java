package Algoritmos;

import Interfaces.Algoritmos;

import java.util.ArrayList;

public class QuickSort implements Algoritmos {

    //** ALGORITMO PODE SER ENCONTRADO EM
    // http://www.eecs.qmul.ac.uk/~mmh/ADSOOF/sortingefficiency/sortArrays2.html

    @Override
    public ArrayList OrdenaVetores(ArrayList<Integer> vetor) {

        if(vetor.size()<=0)
            return vetor;

        ArrayList<Integer> menores = new ArrayList<Integer>();
        ArrayList<Integer> maiores= new ArrayList<Integer>();
        Integer pivot = vetor.get(0);

        for(int i=1; i<vetor.size(); i++)
        {
            Integer pos=vetor.get(i);
            if(pos.compareTo(pivot)<0)
                menores.add(pos);
            else
                maiores.add(pos);
        }
        menores=OrdenaVetores(menores);
        maiores=OrdenaVetores(maiores);
        menores.add(pivot);
        menores.addAll(maiores);

        return menores;
    }

}
