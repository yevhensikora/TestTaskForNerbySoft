import java.time.LocalDate;

public class VirtualProduct extends Product{

    private String code;
    private LocalDate expirationDate;
    public VirtualProduct(String productName, double productPrice, String code, LocalDate expirationDate) {
        super(productName, productPrice);
        this.code = code;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
