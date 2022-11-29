package person;

public class Student extends Person {
    private String grade;
    private String daysAttended;

    public Student(String name, String grade, String daysAttended) {
            super(name);
            this.grade = grade;
            this.daysAttended = daysAttended;
    }

    public void inflateGrade(){
            this.grade=this.grade.replace("-", "+");
    }
    
    public void boostAttendance(){
        int temp = Integer.parseInt(this.daysAttended);

            this.daysAttended=String.valueOf(temp+2);
    }

    @Override
    public String toString(){
            return "[Name: " + this.getName() + ", Grade: "+this.grade+ ", Days attended; " + this.daysAttended + "]";
    }
}