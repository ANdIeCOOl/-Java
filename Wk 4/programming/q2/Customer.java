import java.util.*;
class Customer implements Cloneable {
    private String name;
    private Items items;


    public Customer(String name, Items items) {
        this.name = name;
        this.items = items;
    }


    public Items getItems() {
        return items;
    }


    public void setName(String s) {
        this.name = s;
    }


    @Override
    public Customer clone() throws CloneNotSupportedException {
        return new Customer(this.name, this.items.clone()); 
    }

 
    @Override
    public String toString() {
        return name + " " + items;
    }
}