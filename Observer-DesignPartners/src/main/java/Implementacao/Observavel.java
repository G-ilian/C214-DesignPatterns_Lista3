package Implementacao;

import Interfaces.IntObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements IntObservavel {
    private String modeloPc;
    private List<Observador> Pcs;

    // Construtor
    public Observavel(){
        Pcs=new ArrayList<Observador>();
    }
    @Override
    public int contarPalavras(String frase) {
        int n=0;// Número de caracteres
        String []palavras;
        palavras=frase.split(" ");
        for (int i=0;i<palavras.length;i++){
            n++;
        }

        return n;
    }

    @Override
    public int contarParidadeDePalavras(String frase) {
        int nPar=0;// Número de caracteres
        String []palavras;
        palavras=frase.split(" ");
        for(int i=0;i<palavras.length;i++){
            if(palavras[i].length()%2==0) {
                nPar++;
            }
        }

        return nPar;
    }

    @Override
    public int contarPalavrasIniciadasComMaisculo(String frase) {
        int nMais=0;
        String []palavras;
        palavras=frase.split(" ");
        for(int i=0;i<palavras.length;i++){
            if(Character.isUpperCase(palavras[i].charAt(0)))
                nMais++;
        }
        return nMais;
    }

    @Override
    public void registraPCs(Observador obs) {
        Pcs.add(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : Pcs) {
            observador.informarPC(this);
        }
    }

    // Get's e setter's

    public String getModeloPc() {
        return modeloPc;
    }

    public void setModeloPc(String modeloPc) {
        this.modeloPc = modeloPc;
    }

    public List<Observador> getPcs() {
        return Pcs;
    }

    public void setPcs(List<Observador> pcs) {
        Pcs = pcs;
    }
}
