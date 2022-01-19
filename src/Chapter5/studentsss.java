package Chapter5;

public class studentsss {
    String fname;
    String lname;
    int age;
//setter
    public void setFname(String fname){
        this.fname = fname; 
    }
    public void setLname(String lname){
        this.fname = fname;
    }
    public void setAge(int age){
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
