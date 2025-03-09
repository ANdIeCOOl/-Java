  public class FClass{
         public static void main(String[] args) {
                try {
                     Point p1 = new Point(10, 20);
                     Point p2 = p1;
                     Point p3 = (Point)p1.clone();
                     p1.setX(100);
                     p1.setY(200);
                     System.out.println(p1 + " , " + p2 + ", " + p3);
                }
                catch(CloneNotSupportedException e) {
                       System.out.println("clone() not supported");
                 }
          }
  }
// clone() requires Cloneable interface
// The clone() method in Java is inherited from the Object class.

// By default, calling clone() on an object will throw CloneNotSupportedException
//  unless the class explicitly implements the Cloneable interface.

// In your code, the Point class does not implement Cloneable, so calling super.clone() 
// inside the clone() method throws the exception.