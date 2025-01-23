// // q1
// public class q1 {
//           public static void main(String[] args) {
//                       String str1, str2;
//                       str1 = "welcome to IITM";
//                       str2 = str1.substring(0, 11) + "java course" ;
//                       System.out.println(str2);
//           }
// }

// // q2
//      public class q2 {
//          public static void main(String[] args) {
//                  int[] a = {1, 2, 3};
//                  int[] b = {1, 2, 3};
//                  System.out.println(a == b);
// // To understand why System.out.println(a == b); 
// // on line 16 prints false, we need to examine the context in which a and b are defined and used. 
// // The == operator checks for reference equality when used with objects, 
// // meaning it checks if both references point to the same object in memory.
//          }
//      }

// // q3
//  class q3{
//      public static void main(String[] args) {
//             int i1 = 10, i2 = 29;
//             double d;
//             d = i2 / i1;
//             System.out.print(d + " ");
//             d = (double)(i2 / i1);
//             System.out.print(d + " ");
//             d = (double)i2 / i1;
//             System.out.print(d);
//       }
//  }


// // q4
// class q4{
//     public static void main(String[] args) {
// // Compile-time errors (e.g., invalid syntax, type mismatch) must be resolved before the program runs. 
// // They cannot be caught with try-catch.
// // Runtime exceptions (e.g., NullPointerException, ArithmeticException) occur during execution 
// // and can be caught using try-catch.
//         // try {
//         //     boolean flag = 1;
//         // } catch (Exception e) {
//         //     System.out.println("Error:boolean flag = 1 " + e.getMessage());
//         // }

//         try {
//             boolean flag = true;
//             System.out.println("boolean flag = true---works");
//         } catch (Exception e) {
//             System.out.println("Error: boolean flag = true" + e.getMessage());
//         }

//         // try {
//         //     boolean flag = TRUE;
//         // } catch (Exception e) {
//         //     System.out.println("Error:boolean flag = TRUE; " + e.getMessage());
//         // }

//         // try {
//         //     boolean flag = "false";
//         // } catch (Exception e) {
//         //     System.out.println("Error:boolean flag = \"false\"; " + e.getMessage());
//         // }

//     }
// }

// // q5
// class Point_q5{
//        private int x;
//        private int y;
//        public Point_q5(int x, int z) {
//               x = x;
//               y = z;
//         }
//         public void printPoint() {
//               System.out.println("(" + x + ", " + y + ")");
//             //   prints (0,20) x has referential problems but z does not hence
//             //  in constructor x = x is not specified and garbage meaningful value 
//             //  y is unambiguous and hence prints 20
//         }
//  }
// class q5{
//         public static void main(String[] args) {
//               Point_q5 p = new Point_q5(10, 20);
//               p.printPoint();
//         }
//  }

// // q6
// import java.util.*;
// class q6{
//     public static int doSomething(int num) {
//            int n = num;
//            System.out.println("In dosomthing with " + n);
//            int total = 0;
//            for(int i = 1; i <= n; i++) {
//                 if (n % i == 0) {
//                   System.out.print(i+" ");
//                    total = total + i;
//                 }
//            }
//            System.out.println();
//            return total;
//      }
//      public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            int number = sc.nextInt();
//            int x = doSomething(number);
//            System.out.println(x);
//      }
//  }

// // q7
// class q7
//   {
//        public static void main(String[] args)
//         {
//              int i=0;
//              while(i>0)
//              {
//                       System.out.println(i);
//              }
//             do
//             {
//                       System.out.println(i);
//             }while(i>0);
//        }
//  }

// // q8 IMPORTANT QUESTION
// class q8
//    {
//          public static void main (String args[])
//           {
//                      System.out.println(10+20+"IIT Madras");
//                     System.out.println("IIT Madras"+10+20);
//            }
//    }

// // q11
// class q11
//     {
//           public static void main(String args[])
//             {
//                 int arr[] = {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
//                 int n = 9;
//                 n = arr[arr[n] / 2];
//                 System.out.println(arr[n] / 3);
//             }
//     }


// //  q12
// public class q12
//   {
//          public static void main(String args[])
//            {
//                 int x; x = 1;
//                 // if(x) gives incompatible type error
//                 if(x == 1)
//                  { System.out.println(x); }
//                 else { System.out.println("2"); }
//             }
//    }

// // q13
// public class q13
//  {
//         public static void main(String args[])
//          {
//                int x=1;
//                if(false) { System.out.println(x); }
//                else { System.out.println("True"); }
//           }
//  }

// // q14

// public class q14
//   {
//         public static void main(String args[])
//          {
//              switch(2)
//               { 
//                     case 1:
//                     System.out.println("One");
//                     case 2:
//                     System.out.println("Two");
//                     case 3:
//                     System.out.println("Three");
//                     default:
//                     System.out.println("Default");
//                     break;
//               }
//        }
//  }


// q16
class Employee_q16
{
         int eid;
         String ename;

         public void display()
         {
              System.out.println("eid: "+eid);
              System.out.println("ename: "+ename);
         }
}

class q16
{
         public static void main(String[] args)
         {
                Employee_q16 e1 = new Employee_q16();
                e1.display();
          }
}