public class Teacher extends Person{
    public ClassRoom nameTeacher;

   public Teacher(){}


    public Teacher(String birthOfDay, String male, String name, String phoneNumber, ClassRoom nameTeacher) {
        super(birthOfDay, male, name, phoneNumber);
        this.nameTeacher = nameTeacher;
    }

    public ClassRoom getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(ClassRoom nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}
