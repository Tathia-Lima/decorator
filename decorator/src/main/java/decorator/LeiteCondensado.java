package decorator;

public class LeiteCondensado extends CafeDecorator {

    public LeiteCondensado(Cafe cafe) {
        super(cafe);
    }

    public float getValor() {
        return 4.0f;
    }

    public String getNomeIngrediente() {
        return "LeiteCondensado";
    }
}
