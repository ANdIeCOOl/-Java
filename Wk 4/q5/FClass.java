     public class FClass{
            public static void main(String[] args) {
                   var a = 100;
                   a = 10.5;          //LINE 1  error: incompatible types: possible lossy conversion from double to int
                   var b = 5;
                   var c = a / b;
                   System.out.println(c);
             }
      }