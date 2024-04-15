import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cadastrando cliente
        User cliente = new User();
        cliente.setNome("Owayran");
        cliente.setIdade(25);
        cliente.setEmail("owayran1998@gmail.com");
        // Cadastrando produto
        Product1 produto1 = new Product1();
        produto1.setNome("Rabanete");
        produto1.setPreco(1.50);
        produto1.setPeso(70);

        Product1 produto2 = new Product1();
        produto2.setNome("Cenoura");
        produto2.setPreco(2.00);
        produto2.setPeso(50);

        //Adicionando produto ao carrinho do cliente
        cliente.getCarrinho().adicionarProduto(produto1);
        cliente.getCarrinho().adicionarProduto(produto2);

        cliente.getCarrinho().calcularPrecoTotal();

        System.out.println("Dados do cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Email: " + cliente.getEmail());

        System.out.println("Dados do(s) produto(s): ");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço(UN): " + produto1.getPreco());
        System.out.println("Peso(g): " + produto1.getPeso());
        
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço(UN): " + produto2.getPreco());
        System.out.println("Peso(g): " + produto2.getPeso());
        
        //Mostrando a lista dos produtos adicionados
        List<String> nomesProdutos = cliente.getCarrinho().listarProdutos();
        System.out.println("Produtos no carrinho:");
        for (String nomeProduto : nomesProdutos) {
            System.out.println(nomeProduto);
        }
        
        System.out.println("Preço Total do Carrinho para " + cliente.getNome() + ": " + cliente.getCarrinho().getPrecoTotal());
    }
}