public class RealProduct extends Product{

    private int size;
    private int weight;
    public RealProduct(String productName,double productPrice, int size, int weight) {
        super(productName, productPrice);
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
