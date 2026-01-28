import java.util.ArrayList;
public class StudentManager {
     private  ArrayList<Student> students = new ArrayList<>();
      

     public void addStudent(Student s){
      for(Student st:students){
         int roll = 0;
         if(st.getRoll()==s.getRoll()){
            System.out.println("Student already Added with this Roll No.");
            return ;
         }
      }
      students.add(s);
      System.out.println("Student Added Successfully");
     }
     public void removeStudent(int r){
         for(Student st:students){
            if(st.getRoll()==r){
               students.remove(st);
               System.out.println("Student Removed");
               return;
            }else if(st.getRoll()!=r){
               System.out.println("Student Not Found");
            }
         }
     }
     public void SearchbyRoll(int roll){
      for(Student st:students){
         if(st.getRoll()==roll){
               System.out.println("RollNo.:"+st.getRoll()+" Name:"+st.getname()+" Course:"+st.getCourse());
         }else{
            System.out.println("Student Not Found");
         }
      }
     }

     public void showAllStudent(){
      if(students.isEmpty()){
         System.out.println("No Student Found");
         return ;
      }
        for(Student s:students){
        System.out.println("RollNo:"+s.getRoll()+" Name:"+s.getname()+" Course:"+s.getCourse());
        }
     }

    }
