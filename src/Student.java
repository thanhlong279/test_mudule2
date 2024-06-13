public class Student extends Person{
    private String codeStudent;
    private String codeClassRoom;

    public Student(){}

    public Student(String birthOfDay, String male, String name, String phoneNumber, String codeClassRoom, String codeStudent) {
        super(birthOfDay, male, name, phoneNumber);
        this.codeClassRoom = codeClassRoom;
        this.codeStudent = codeStudent;
    }

    public String getCodeClassRoom() {
        return codeClassRoom;
    }

    public void setCodeClassRoom(String codeClassRoom) {
        this.codeClassRoom = codeClassRoom;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    @Override
    public String toString() {
        return codeStudent+","+super.getName()+","+codeClassRoom+","+super.getMale()+","+super.getPhoneNumber()+","+super.getBirthOfDay();
    }
}
