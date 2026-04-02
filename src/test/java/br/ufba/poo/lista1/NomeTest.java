package br.ufba.poo.lista1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NomeTest {

    @Test
    public void testaExemplo() {
        Nome nome = new Nome();
        nome.setPrimeiroNome("Fulano");
        nome.setSobrenome("de Tal");
        assertEquals("Fulano de Tal", nome.getNomeCompleto());
    }

    @Test
    public void testaAlterarNome() {
        String s1 = "iuw e hqwe";
        String s2 = "qw ieg as";
        Nome nome = new Nome();
        nome.setPrimeiroNome("abc");
        nome.setSobrenome(s2);
        nome.setPrimeiroNome(s1);
        assertEquals(s1 + " " + s2, nome.getNomeCompleto());
    }

    @Test
    public void testaGettersESetters() {
        String s1 = "iscuw e hqwe";
        String s2 = "qw utyieg as";
        Nome nome = new Nome();
        nome.setPrimeiroNome(s1);
        nome.setSobrenome(s2);
        assertEquals(s1, nome.getPrimeiroNome());
        assertEquals(s2, nome.getSobrenome());
    }

    @Test
    public void testaOutroExemplo() {
        String s1 = "iuw e hqwe";
        String s2 = "qw ieg as";
        Nome nome = new Nome();
        nome.setPrimeiroNome(s1);
        nome.setSobrenome(s2);
        assertEquals(s1 + " " + s2, nome.getNomeCompleto());
    }
}

