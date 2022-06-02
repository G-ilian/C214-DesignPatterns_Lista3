import Implementacao.Observador;
import Implementacao.Observavel;

public class Palavras {
    public static void main(String[] args){
        // Testando
        Observavel programa=new Observavel();

        //Criando observadores
        Observador pc1=new Observador(1,"Teste 01");
        Observador pc2=new Observador(2,"Teste 02");
        Observador pc3=new Observador(3,"Teste 03");

        // Registrando os observadores
        programa.registraPCs(pc1);
        programa.registraPCs(pc2);
        programa.registraPCs(pc3);


        // Fazendo realizando operações com o observavel
        System.out.println("Número de palavras: "
                +programa.contarPalavras("O dia está lindo hoje"));
        System.out.println("Número de palavras com caracteres par: "
                +programa.contarParidadeDePalavras("O dia está lindo hoje"));
        System.out.println("Número de palavras iniciadas com caracteres Maísculos: "
                +programa.contarPalavrasIniciadasComMaisculo("O dia está lindo hoje"));

        // Notificando os PC's acerca das operações
        System.out.println("++ Notificando os PC's ++ ");
        programa.notificaObservadores();
    }

}
