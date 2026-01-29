import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    StudentManager sm = new StudentManager();
    while(true){
    System.out.println("1. Add Student");
    System.out.println("2. View Students");
    System.out.println("3. Search Student");
    System.out.println("4. Exit");
    System.out.print("Choose:");
    int choice = sc.nextInt();
    sc.nextLine();
    if(choice==1){
        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("RollNo.");
        int RollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Course");
        String course = sc.nextLine();

        sm.addStudent(new Student(name, RollNo, course));
    }
    else if(choice==3){
        System.out.println("Enter RollNo to Search");
        int roll = sc.nextInt();
        sm.SearchbyRoll(roll);
    }
    else if(choice==2){
        sm.showAllStudent();
        System.out.println("1.Remove Student");
        System.out.println("2.Back to Menu");
        System.out.println("Choose:");

        int subchoice = sc.nextInt();
        sc.nextLine();
        if(subchoice==1){
            System.out.println("Enter RollNo to Remove");
            int r = sc.nextInt();
            sc.nextLine();
            sm.removeStudent(r);
        }
    else if(subchoice==2){
        System.out.println("Menu");
         }
        }else if(choice==4){
            System.out.println("Thank You");
            break;
        }
        else{
            System.out.println("Invalid Choice");
            break;
        }
      }
    }

}