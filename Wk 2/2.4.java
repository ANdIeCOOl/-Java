 class Test

{   
          byte a;
          short b;
          int c;
          long d;
          float e;
          double f;
          boolean g;
     
          void show()
         {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println(g);
         }
                public static void main(String[ ] args)
         {   
                new Test().show();
          }
      }