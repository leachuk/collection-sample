import models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Product Catalog App");
        ProductCatalog productCatalog = new ProductCatalog(ProductCatalog.getSampleCatalog());

        //filter is used to filter things out of a collection, so use inverse to find.
        List<Product> laptops = productCatalog.getProductCatalog()
                                    .filter(o -> o.getCategories()
                                            .stream()
                                            .anyMatch(category -> category.getName().equals("Macbooks")))
                                    .map(Product::getProduct).collect(Collectors.toList());
        System.out.println(laptops);

        System.out.println("List products of a category, including child products");

        System.out.println("Get category path of product");
    }
}
