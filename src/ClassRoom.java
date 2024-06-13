public class ClassRoom {
    private String codeClassRoom;
    private String nameClassRoom;
    private String codeTeacher;

    public ClassRoom(){}

    public ClassRoom(String codeClassRoom, String codeTeacher, String nameClassRoom) {
        this.codeClassRoom = codeClassRoom;
        this.codeTeacher = codeTeacher;
        this.nameClassRoom = nameClassRoom;
    }

    public String getCodeClassRoom() {
        return codeClassRoom;
    }

    public void setCodeClassRoom(String codeClassRoom) {
        this.codeClassRoom = codeClassRoom;
    }

    public String getCodeTeacher() {
        return codeTeacher;
    }

    public void setCodeTeacher(String codeTeacher) {
        this.codeTeacher = codeTeacher;
    }

    public String getNameClassRoom() {
        return nameClassRoom;
    }

    public void setNameClassRoom(String nameClassRoom) {
        this.nameClassRoom = nameClassRoom;
    }
}
