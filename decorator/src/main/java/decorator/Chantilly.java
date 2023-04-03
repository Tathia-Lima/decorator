package decorator;

public class Chantilly extends CafeDecorator {

    public Chantilly(Cafe cafe) {
        super(cafe);
    }

    public float getValor() {
        return 3.0f;
    }

    public String getNomeIngrediente() {
        return "Chantilly";
    }
}
