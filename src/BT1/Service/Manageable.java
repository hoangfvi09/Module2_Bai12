package BT1.Service;

public interface Manageable<T> {
    void add(T t);
    void print();
    T findByName(int name);
    void editById(int id,T t);
    void removeById(int id);
    void sortByPrice();
    int findIndexById(int id);
}
