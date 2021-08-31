public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------> GERENCIADOR DE PUBLIS <------");
        Editora editora = new Editora("Canto quente", "086.929.234-72");
        Publi publi = new Publi("Prefeito MORRE", 7, editora);
        PubliSemanal publiSemanal = new PubliSemanal("SemanaBacana", 3, editora);

        publi.calcularAnuidade();
        publi.imprimirDados();

        publiSemanal.calcularAnuidade();
        publiSemanal.calcularTaxaEntrega();
        publiSemanal.imprimirDados();
    }
}
