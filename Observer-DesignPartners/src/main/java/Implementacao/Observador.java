package Implementacao;

import Interfaces.IntObservador;

public class Observador implements IntObservador {
    private String pC;
    int id;

    public Observador(int id,String model){
        this.id=id;
        this.pC=model;

    }

    @Override
    public void informarPC(Observavel contaPalavras) {
        System.out.println("PC ID: "+this.id);
        System.out.println("PC Model: "+this.pC);
    }
}
