package decorator;

public class Canela extends CafeDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    public float getValor() {
        return 2.0f;
    }

    public String getNomeIngrediente() {
        return "Canela";
    }
}
