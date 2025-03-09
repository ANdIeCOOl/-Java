public class Product implements Cloneable{
           private String prodname;
           private double prodprice;
           public Product(String prodname, double prodprice) {
                  this.prodname = prodname;
                  this.prodprice = prodprice;
           }
           public Product(Product p) {
                  this.prodname = p.prodname;
                  this.prodprice = p.prodprice;
           }
           public void setProdname(String prodname) {
                  this.prodname = prodname;
           }
           public void setProdprice(double prodprice) {
                  this.prodprice = prodprice;
           }
           public String toString() {
                  return prodname + " : " + prodprice;
           }
           protected Product clone() throws CloneNotSupportedException{
                  return (Product)super.clone();
           }
   }