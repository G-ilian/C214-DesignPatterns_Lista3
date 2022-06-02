import Implementacao.Observador;
import Implementacao.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testePalavras {
    @Test
    public void testePalavrasPar(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarParidadeDePalavras("Isso tem que ter apenas tres pares"),3);
    }

    @Test
    public void testeNumeroPalavras(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarPalavras("Isso tem que ter apenas sete palavras"),7);
    }

    @Test
    public void testeNumeroPalavrasComecadasComMaisculo(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarPalavrasIniciadasComMaisculo("Isso tem que ter apenas 1 palavra iniciada em maísculo")
                ,1);
    }

    @Test
    public void testeAdicionarObservadores(){
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

        assertEquals(programa.getPcs().size(),3);
    }
}
