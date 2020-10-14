package order;

public class OrderItem {

    private Integer quantidade;
    private Double precoOrder;

    private Product product;

    public OrderItem() {    }

    public OrderItem(Integer quantidade, Double precoOrder, Product product) {
        this.quantidade = quantidade;
        this.precoOrder = precoOrder;
        this.product = product;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoOrder() {
        return precoOrder;
    }

    public void setPrecoOrder(Double precoOrder) {
        this.precoOrder = precoOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
         return quantidade * precoOrder;
    }

}
