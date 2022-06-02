package Interfaces;

import Implementacao.Observador;

public interface IntObservavel {

    public int contarPalavras(String frase); // Conta a quantidade de caracteres de uma palavra
    public int contarParidadeDePalavras(String frase); // Conta palavras com número par de caracteres
    public int contarPalavrasIniciadasComMaisculo(String frase); // Contar palavras iniciadas com letras maísculas
    public void registraPCs(Observador obs);
    public void notificaObservadores();



}
