import models.Category;
import models.Product;

import java.util.*;
import java.util.stream.Stream;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class ProductCatalog {
    Stream<Product> productCatalog;

    public ProductCatalog(Stream<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Stream<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(Stream<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public static Stream<Product> getSampleCatalog(){
        Category electronics = new Category("Electonics");
        Category computer = new Category("Computer");
        Category laptop = new Category("Laptop");
        Category tablet = new Category("Tablet");
        Category macbooks = new Category("Macbooks");
        Category dell = new Category("Dell");
        Category lenovo = new Category("Lenovo");

        ArrayList<Category> categoriesMac = new ArrayList<Category>() {{
            add(electronics);
            add(computer);
            add(laptop);
            add(macbooks);
        }};

        ArrayList<Category> categoriesDell = new ArrayList<Category>() {{
            add(electronics);
            add(computer);
            add(laptop);
            add(dell);
        }};

        ArrayList<Category> categoriesLenovo = new ArrayList<Category>() {{
            add(electronics);
            add(computer);
            add(laptop);
            add(lenovo);
        }};

        ArrayList<Category> categoriesTablet = new ArrayList<Category>() {{
            add(electronics);
            add(computer);
            add(tablet);
        }};

        Stream<Product> sample1 = Stream.of(
            new Product("Apple MacBook Air MJVE2LL/A 13-inch Laptop", "Apple Macbook Pro", new Float(3000.00), categoriesMac),
            new Product("Dell 15", "Dell 15 inch laptop", new Float(2500.00), categoriesDell),
            new Product("Lenovo 15", "Lenovo 15 inch laptop", new Float(2700.00), categoriesLenovo),
            new Product("iPad", "iPad Pro Tablet", new Float(1400.00), categoriesTablet)
        );

        return sample1;
    }
}
