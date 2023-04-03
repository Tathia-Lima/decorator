package decorator;

public class CafeSimples implements Cafe {

    public float preco;

    public CafeSimples() {
    }

    public CafeSimples(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getIngrediente() {
        return "Café Simples";
    }

}
