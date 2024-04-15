public class User {
    private String nome;
    private String email;
    private Integer idade;
    private Cart carrinho;

// Associar carrinho ao cliente
    public User() {
        this.carrinho = new Cart();
    }
// Setar nome
    public void setNome(String nome) {
        this.nome = nome;
    }
// Retornar nome
    public String getNome() {
        return nome;
    }
// Setar idade
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
// Retornar idade
    public Integer getIdade() {
        return idade;
    }
// Setar email
    public void setEmail(String email) {
        this.email = email;
    }
//Retornar Email
    public String getEmail() {
        return email;
    }
// método para associar carrinho ao cliente
    public void associarCarrinho(Cart carrinho) {
        this.carrinho = carrinho;
    }
// Retornar carrinho
    public Cart getCarrinho() {
        return carrinho;
    }
// Método para pagar a compra
    public void Pagar() {
    
    }
}