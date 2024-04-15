import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double precoBruto;
    private double taxa;
    private double precoTotal;
    private List<Product1> produtos;

//Configurando para iniciar uma lista de produtos
    public Cart() {
        this.produtos = new ArrayList<>();
    }
// método para add produtos ao carrinho e atualizar preço bruto conforme for adicionando
    public void adicionarProduto(Product1 produto) {
        produtos.add(produto);
        calcularPrecoBruto();
    }
// setar taxa, que poderá ser de desconto nos produtos
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
// método para calculcar o preco bruto dos itens
    public void calcularPrecoBruto() {
        precoBruto = 0;
        for (Product1 produto : produtos) {
            precoBruto += produto.getPreco();
        }
    }
// método para calcular o preço total
    public void calcularPrecoTotal() {
        double desconto = precoBruto * taxa;
        precoTotal = precoBruto - desconto;
    }
// Retornar preço total
    public double getPrecoTotal() {
        return precoTotal;
    }
//Mostrar prosutos que foram adicionados a lista
    public List<String> listarProdutos() {
        List<String> nomesProdutos = new ArrayList<>();
        for (Product1 produto : produtos) {
            nomesProdutos.add(produto.getNome());
        }
        return nomesProdutos;
    }
}