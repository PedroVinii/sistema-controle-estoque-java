import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        exibirMensagem();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre um novo produto!");

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(nome, preco);

        inventory.adicionarProduto(produto);

        System.out.println("Produto Cadastrado");

        inventory.listarProdutos();

    }

    public static void exibirMensagem() {
        System.out.println("Bem-vindo ao sistema!");
    }
}

