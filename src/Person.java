public class Person {
    private String name;
    private String birthOfDay;
    private String male;
    private String phoneNumber;

    public Person(){

    }

    public Person(String birthOfDay, String male, String name, String phoneNumber) {
        this.birthOfDay = birthOfDay;
        this.male = male;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(String birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "birthOfDay='" + birthOfDay + '\'' +
//                ", name='" + name + '\'' +
//                ", male='" + male + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
}
