/**
 * Editora
 */
public class Editora {

    String nome;
    String cnpj;


    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void imprimirDados() {
        System.out.println("Nome Editora: " + this.nome);
        System.out.println("CNPJ Editora: " + this.cnpj);
    }
}