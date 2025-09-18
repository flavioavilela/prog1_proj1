import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {
    private LocalDate dataVenda;
    private Produto produto;
    private String numeroVenda;

    /**
     * @return the dataVenda
     */
    public LocalDate getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the numeroVenda
     */
    public String getNumeroVenda() {
        return numeroVenda;
    }

    /**
     * @param numeroVenda the numeroVenda to set
     */
    public void setNumeroVenda(String numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public void imprimirVenda() {
        System.out.println("------ DADOS DA VENDA ------");
        System.out.println("Número da venda: " + getNumeroVenda());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = getDataVenda().format(formatter);
        System.out.println("Data da venda: " + dataFormatada);

        System.out.println("------ DADOS DO PRODUTO ------");
        System.out.println("Produto vendido: " + getProduto().getNome());
        System.out.println("Marca: " + getProduto().getMarca());
        System.out.println("Preço: " + getProduto().getPreco());
        System.out.println("Quantidade em estoque: " + getProduto().getQtde());
        System.out.println("-----------------------------");

    }

}
