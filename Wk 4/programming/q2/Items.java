import java.util.*;
class Items implements Cloneable {
    public String[] item;


    public Items(String[] item) {
        this.item = item.clone(); 
    }


    @Override
    public Items clone() throws CloneNotSupportedException {
        return new Items(item.clone()); 
    }


    @Override
    public String toString() {
        return String.join(" ", item);
    }
}
