public class Student{
        private String name;
        private int Rollno;
        private String course;

    public Student(String name,int Rollno,String course){
            this.name  = name;
            this.Rollno = Rollno;
            this.course = course;
        }
        public String getname(){
            return name;
        }
        public int getRoll(){
            return Rollno;
        }
        public String getCourse(){
            return course;
        }

    }
