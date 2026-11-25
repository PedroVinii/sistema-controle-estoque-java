public class Produto {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {

        this.id = proximoId++;
        this.nome = nome;
        this.preco = preco;
    }

    @Override

    public String toString() {
        return "ID: " + id +
                " | Nome: " + nome +
                " | Preço: " + preco;
    }

}
