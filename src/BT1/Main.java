package BT1;

import BT1.Model.Product;
import BT1.Service.ProductManager;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Product product1=new Product(1,"1",1);
        Product product2=new Product(2,"2",2);
        Product product3=new Product(3,"3",3);
        Product product4=new Product(4,"4",4);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        System.out.println("List after adding:");
        productManager.print();
        productManager.removeById(2);
        System.out.println("List after remove id2: ");
        productManager.print();
        Product product5=new Product(5,"5",5);
        productManager.editById(1,product5);
        System.out.println("List after replacing id 1:");
        productManager.print();
        productManager.sortByPrice();
        System.out.println("List after sorting by price:");
        productManager.print();


    }
}
