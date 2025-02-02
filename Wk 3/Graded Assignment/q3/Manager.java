  public class Manager extends Employee, TeamLead{
           public void display( ){
                 System.out.println("In Manager class");
          }
           public static void main(String[] arg) {
                 TeamLead t = new Employee( );
           }
    }