package EnumerationExercise1;

enum Grade {
    A, B, C, D, E;
}

class Student{
    private Integer studentId;
    private String name;
    private Integer totalMarks;
    private Grade grade;

    private float scholarshipAmount;
    public Integer getStudentId(){
        return studentId;
    }
    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getTotalMarks(){
        return totalMarks;
    }
    public void setTotalMarks(Integer totalMarks){
        this.totalMarks = totalMarks;
    }
    public Grade getGrade(){
        return grade;
    }
    public void setGrade(Grade grade){
        this.grade = grade;
    }
    public float getScholarshipAmount(){
        return scholarshipAmount;
    }
    public void setScholarshipAmount(float scholarshipAmount){
        this.scholarshipAmount = scholarshipAmount;
    }

    public void calculateGrade(){
        Integer marks = this.totalMarks;
        if(marks >= 250){
            setGrade(Grade.A);
        } else if (marks >= 200 && marks < 250) {
            setGrade(Grade.B);
        } else if (marks >=175 && marks < 200) {
            setGrade(Grade.C);
        } else if (marks >= 150 && marks < 175) {
            setGrade(Grade.D);
        }else{
            setGrade(Grade.E);
        }
    }

    public void calculateScholarShipAmount(){
        Grade avg = this.grade;
        switch (avg){
            case A:
                setScholarshipAmount(5000);
                break;
            case B:
                setScholarshipAmount(4000);
                break;
            case C:
                setScholarshipAmount(3000);
                break;
            case D:
                setScholarshipAmount(2000);
                break;
            default:
                setScholarshipAmount(0);
                break;
        }
    }
}

class Tester{
    public static void main(String args[]){
        Student student = new Student();
        student.setStudentId(1000);
        student.setName("Alvin");
        student.setTotalMarks(280);
        student.calculateGrade();
        student.calculateScholarShipAmount();
        System.out.println(student.getStudentId());
        System.out.println(student.getName());
        System.out.println(student.getGrade());
        System.out.println((student.getScholarshipAmount()));
    }
}