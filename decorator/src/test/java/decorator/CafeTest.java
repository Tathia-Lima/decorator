package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {

    @Test
    void deveRetornarValorIngredienteCafeSimples() {
        Cafe cafe = new CafeSimples(5.0f);
        assertEquals("Café Simples", cafe.getIngrediente());
        assertEquals(5.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarValorIngredienteCafeSimplesCanela() {
        Cafe cafe = new Canela(new CafeSimples(5.0f));
        assertEquals("Café Simples/Canela", cafe.getIngrediente());
        assertEquals(7.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarValorIngredienteCafeSimplesChantilly() {
        Cafe cafe = new Chantilly(new CafeSimples(5.0f));
        assertEquals("Café Simples/Chantilly", cafe.getIngrediente());
        assertEquals(8.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarValorIngredienteCafeSimplesLeiteCondensado() {
        Cafe cafe = new LeiteCondensado(new CafeSimples(5.0f));
        assertEquals("Café Simples/LeiteCondensado", cafe.getIngrediente());
        assertEquals(9.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarValorIngredienteCafeSimplesCanelaChantilly() {
        Cafe cafe = new Canela(new Chantilly(new CafeSimples(5.0f)));
        assertEquals("Café Simples/Chantilly/Canela", cafe.getIngrediente());
        assertEquals(10.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarValorIngredienteCafeSimplesChantillyLeiteCondensado() {
        Cafe cafe = new Chantilly(new LeiteCondensado(new CafeSimples(5.0f)));
        assertEquals("Café Simples/LeiteCondensado/Chantilly", cafe.getIngrediente());
        assertEquals(12.0f, cafe.getPreco());
    }

    @Test
    void deveRetornarValorIngredienteCafeSimplesLeiteCondensadoChantillyCanela() {
        Cafe cafe = new Canela(new Chantilly(new LeiteCondensado(new CafeSimples(5.0f))));
        assertEquals("Café Simples/LeiteCondensado/Chantilly/Canela", cafe.getIngrediente());
        assertEquals(14.0f, cafe.getPreco());
    }

}