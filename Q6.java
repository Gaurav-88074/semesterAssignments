class Student{
    private String name;
    private int    totalScore;
    private int    noOfQuizzes;
    private float avgScore;

    public String getName(){
        return name;
    }
    public int getTotalScore(){
        return totalScore;
    }
    public double calAvgScore(){
        return avgScore;
    }
    public Student(String name ,int  totalScore ,int  noOfQuizzes){
        this.name        = name;
        this.totalScore  = totalScore;
        this.noOfQuizzes = noOfQuizzes;
        this.avgScore    = (float)totalScore/noOfQuizzes;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Student newStudent = new Student("ARSD STUDENT" , 38 , 5);
        System.out.println("\nName of Student : " + newStudent.getName());
        System.out.println("Total Score     : " + newStudent.getTotalScore());
        System.out.printf("Avgerage score  : %.2f\n", newStudent.calAvgScore());
    }
}
