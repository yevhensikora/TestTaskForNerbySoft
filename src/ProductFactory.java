import java.time.LocalDate;

public interface ProductFactory {
   static RealProduct createRealProduct(String productName,double productPrice, int size, int weight) {
      return new RealProduct(productName,productPrice,size,weight);
   }
   static VirtualProduct createVirtualProduct(String productName, double productPrice, String code, LocalDate date) {
      return new VirtualProduct(productName, productPrice, code, date);
   }

}
