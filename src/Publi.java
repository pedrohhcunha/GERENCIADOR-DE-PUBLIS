public class Publi {
    
    String nome;
    Integer precoExemplar;
    protected Integer valorAnuidade;
    Editora editora;


    public Publi(String nome, Integer precoExemplar, Editora editora) {
        this.nome = nome;
        this.precoExemplar = precoExemplar;
        this.editora = editora;
    }

    public void calcularAnuidade() {
        this.valorAnuidade = precoExemplar * 12;
    }
    
    public void imprimirDados() {
        System.out.println("---------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.precoExemplar);
        System.out.println("Anuidade: " + this.valorAnuidade);
    }
}
