/**
 * PubliSemanal
 */
public class PubliSemanal extends Publi {

    Double taxaEntrega;


    public PubliSemanal(String nome, Integer precoExemplar, Editora editora) {
        super(nome, precoExemplar, editora);
    }


    public void calcularAnuidade() {
        System.out.println("Calculando Anuidade!");
        super.valorAnuidade = super.precoExemplar * 52;
    }

    public void calcularTaxaEntrega() {
        System.out.println("Calculando Taxa de entrega!");
        this.taxaEntrega = super.precoExemplar * 0.05;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Entrega: " + this.taxaEntrega);
        System.out.println("---------------------------");
    }
}