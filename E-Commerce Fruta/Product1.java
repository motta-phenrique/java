public class Product1 {
    private String nome;
    private double preco;
    private double peso;

//Setar nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }
// Retornar nome do produto    
    public String getNome(){
        return nome;
    }
// Setar preço do produto
    public void setPreco(double preco) {
        this.preco = preco;
    }
// Retornar preço do produto    
    public double getPreco(){
        return preco;
    }
// setar peso do produto
    public void setPeso(double peso) {
        this.peso = peso;
    }
// retornar peso do produto    
    public double getPeso(){
        return peso;
    }
// método para calcular desconto do cliente(para ex foi usado 10%, mas pode ser associado a taxa como váriavel de desconto)
    public double calcDesconto(boolean temDesconto) {
        if (temDesconto) {
            double desconto = preco * 0.1; 
            return preco - desconto;
        } else {
            return preco; 
        }
    }
}

