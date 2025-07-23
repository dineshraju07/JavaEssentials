package WrapperClassesExercise1;

class Student{
    private String name;
    private String studentId;
    private String examId;

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void generateExamId(){
        char temp = this.studentId.charAt(this.studentId.length()-1);
        int val = Integer.parseInt(String.valueOf(temp));
        this.examId = String.valueOf(val * val);

    }

    public void getStudentDetails(){
        this.generateExamId();
        String[] val = name.split(" ");
        System.out.println(val[0]+"-"+val[1]+":"+studentId+"-"+examId);
    }
}

class Tester{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setName("Sai Dinesh");
        s1.setStudentId("1305");
        s1.getStudentDetails();
    }
}