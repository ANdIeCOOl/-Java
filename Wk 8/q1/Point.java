 public class Point{
         private int x, y;
         public Point(int x, int y) {
                this.x = x;
                this.y = y;
         }
         public void setX(int x) {
                this.x = x;
         }
         public void setY(int y) {
                this.y = y;
         }
         public String toString() {
                return "(" + x + ", " + y + ")";
         }
         public Object clone() throws CloneNotSupportedException{
                return super.clone();
         }
  }