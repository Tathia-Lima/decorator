package decorator;

public abstract class CafeDecorator implements Cafe {

    private Cafe cafe;
    public String ingrediente;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public abstract float getValor();

    public float getPreco() {
        return this.cafe.getPreco() + (this.getValor());
    }

    public abstract String getNomeIngrediente();

    public String getIngrediente() {
        return this.cafe.getIngrediente() + "/" + this.getNomeIngrediente();
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
}
