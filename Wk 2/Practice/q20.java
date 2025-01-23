// q1
// public class Example{
//     public static void main(String[] args) {
//         System.out.println("Addition of 10 and 20 is "+ 10 + 20);
// }
// }
// in line 3, the numbers 10 and 20 are 
// interpreted as strings due to the way the concatenation operator + works in Java. 
// When you use + with a string, it converts the other operands to strings and concatenates them.

// q2
// public class FClass{
//     public static void main(String[] args) {
//         int a [] = {1,2,3};
//         int[] b = a;
//         System.out.print(a == b);
//     }
// }

// // q3
// public class q3{
//     public static void main(String[] args)
//     {
//         String[] str1, str2 = {"apples", "grapes", "bananas"};
//         // System.out.println(str1[1]); 
//         //  String not intialized just declared, so compilation error
//         // q3.java:25: error: variable str1 might not have been initialized
//         // System.out.println(str1[1]);
//                       //    ^
// // 1 error

//         System.out.println(str2[1]);
//     }
// }

// class q4{
//     public static void main(String[] args)
//     {
//         int i1 = 10, i2 = 29;
//         double d ;
//         d = i1 / i2 * i2;
//         // here since both i1 and i2 are integers, the result of i1/i2 is 0 
//         // integer division and then 0 * i2 = 0, then implicit conversion to double
//         System.out.println(d);
//         d = i2 * i1 / i2;
//         System.out.println(d);
//     }
// }


// // q5
// class q5{
//     public static void main(String[] args)
//     {
//         final int i =10;
// //         i = 20;
        
// // //         5.java:56: error: cannot assign a value to final variable i
// // //         i = 20;
// // //         ^
// // // 1 error
//         System.out.println(i);
//     }
// }

// // q6
// class SClassq6{
//     int i = 10;
//     public SClassq6(int _i) { 
//         i = 20; 
//         }
//     public void print(){
//         System.out.println(i);
//     }
// }

// class q6{
//     public static void main(String[] args)
//     {
//         int i = 30;
//         SClassq6 obj = new SClassq6(i);
//         obj.print();
//     }
// }

// q7
// class q7{
//     public static void main(String[] args)
//     {
//         String str = "we are here to learn java";
//         String str1 = "";
//         char ch [] = {'a', 'e', 'i', 'o', 'u'};
//         for (char c : ch)
//         {
//             for (int i=0; i<str.length(); i++)
//             {
//                 if (str.charAt(i) == c)
//                 {
//                     str1 += c;
//                 }
//             }
//         }
//         System.out.println(str1);
//     }
// }


// q8
// import java.util.Scanner;
// class q8{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter team name");
//         String country = sc.nextLine();
// //         The difference between sc.next() and sc.nextLine() lies in how they 
// // handle input from the user:

// // sc.next():
// // Reads the next token from the input. A token is typically a word separated by whitespace (space, tab, newline).
// // It stops reading as soon as it encounters whitespace.

// // sc.nextLine():
// // Reads the entire line of input until the end of the line.
// // It includes all characters up to the newline character.
// // In summary, use sc.next() when you need to read a single word and
// //  sc.nextLine() when you need to read an entire line of text.
//   switch(country)
//   {
//     case "India":
//         System.out.println("Delhi is capital of "+country);
//     case "SriLanka":
//         System.out.println("Colombo is capital of "+country);
//     default:
//         System.out.println("Please enter a valid country name");
//   }


//     }
// }

// // q9
// class q9{
//     public static void main(String[] args)
//     {
//         int j = 20;
//         for (int i =10; i<j;i++,j--)
//         {
//             System.out.println("Hello World");
//         }
//     }
// }

// // q10
// class q10
// {
//     public static void main (String args[])
//     {
//         for(;;)
// // no stopping condition, so infinite loop
//         {
//             System.out.println("Hello World");
//         }
//     }
// }

// // q11
// class q11{
//     public static void main(String[] args)
//     {
//         int x = 10;
//         int y = 20;
//         y = +x;
//         System.out.println(y);
            
//         }
//     }

// // q12
// class q12
// {
//     public static void main(String apple[])
//     {
        
//         int a = 34;
//         // int a = 34.0;
// //  q12.java:184: error: incompatible types: possible lossy conversion from double to int
// //         int a = 34.0;
// //                 ^
// // 1 error       
//         int b =7;
//         int c = a%b;
//         System.out.println(c);
//     }
// }

// // q15
// class q15
// {
//     public static void main(String[] args)
//     {
//         String [] state = new String[] {"Maharashtra", "Kerala", "Karnataka", "Tamil Nadu"};
    //   // legal array declaration
//         for (String s : state)
//         {
//             System.out.println(s);
//         }
//     }
// }

// // q19
// class Employee_q19{
//     int eid;
//     String ename;
//     public Employee_q19(Employee_q19 e)
//     {
//         this.eid = e.eid;
//         this.ename = e.ename;
//     }
//      public Employee_q19()
//     //  Extra code added line 220-224
//     {

//     }
//     public void display()
//     {
//         System.out.println("Employee ID: "+eid);
//         System.out.println("Employee Name: "+ename);
//     }
// }
// class q19{
//     public static void main(String[] args)
//     {
//      Employee_q19 e1 = new Employee_q19();
// // q19.java:229: error: constructor Employee_q19 in class Employee_q19 cannot be applied 
// // to given types;
// //         Employee_q19 e1 = new Employee_q19();
// //                           ^
// //   required: Employee_q19
// //   found:    no arguments
// //   reason: actual and formal argument lists differ in length
// // 1 error
//         e1.display();
//     }
// }

// q20
// import java.util.*;
// class Employee_q20{
//     int eid;
//     String ename;
//     String eprojects[];

//     public Employee_q20(Employee_q20 e)
//     {
//         this.eid = e.eid;
//         this.ename = e.ename;
//         this.eprojects = e.eprojects;
//     }
//     public Employee_q20( int id, String name, String[] projects)
//     {
//         this.eid = id;
//         this.ename = name;
//         this.eprojects = projects;
//     }
//     public void display()
//     {
//         System.out.println("eid: "+eid);
//         System.out.println("ename: "+ename);   
//         System.out.println("eprojects: ");
//         for (String s : eprojects)
//         {
//             System.out.println(s);
//         } 
//     }

//     public void mutator()
//     {
//         this.ename = this.ename+"_IITM";
//         this.eprojects[0] = "P6";
//     }
    
// }

// public class q20{
//     public static void main(String[] args)
//     {
//         String [] arr = {"P1", "P2"};
//         Employee_q20 e1 = new Employee_q20(12, "Alex", arr);
//         Employee_q20 e2 = new Employee_q20(e1);
//         e1.mutator();
//         e1.display();
//         e2.display();
// }
// }