package BT1.Service;

import BT1.Model.Product;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager implements Manageable <Product>{
    private ArrayList<Product> products=new ArrayList<>(10);

    public ProductManager() {
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void print() {
        for(Product product:products){
            System.out.println(product);
        }

    }

    @Override
    public Product findByName(int name) {
        for(Product product:products) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void editById(int id, Product product) {
        int index=findIndexById(id);
        products.set(index,product);

    }

    @Override
    public void removeById(int id) {
        int index=findIndexById(id);
        products.remove(index);

    }

    @Override
    public void sortByPrice() {
        products.sort(Comparator.comparingInt(Product::getPrice));

    }

    @Override
    public int findIndexById(int id) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
}
