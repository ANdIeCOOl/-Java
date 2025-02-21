 public class B extends A{
        public String sem_subjects(){
              return "DBMS, DSA and Programming concept using Java.";
        }
        public static void main(String args[]){
              A obj=new B();
            //   B obj=new A(); // error: A is abstract; cannot be instantiated
             System.out.println("Current Semester: "+A.current_sem()
                       +"\nSubjects: "+obj.sem_subjects());
        }
   }