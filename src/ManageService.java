import java.util.ArrayList;
import java.util.List;

public class ManageService {
ManageRepository manageRepository = new ManageRepository();

    public boolean add(Student student) {
        if (validateAddStudent(student)) {
            manageRepository.add(student);
            return true;
        }
        return false;
    }

    public boolean validateAddStudent(Student student){
        if(student.getCodeStudent().equals("")){
            return false;
        }
        if(student.getName().equals("") || student.getName().length() < 4 || student.getName().length() > 50){
            return false;
        }
        if(student.getCodeClassRoom().equals("")){
            return false;
        }
        if(student.getBirthOfDay().equals("")){
            return false;
        }
        if (student.getMale().equals("")){
            return false;
        }
        if(student.getPhoneNumber().equals("")){
            return false;
        }
        return true;
    }

    public List<Student> getAll() {
        return manageRepository.getAll();
    }

    public Student findByCode(String code) {
        return manageRepository.findByCode(code);
    }

    public void removeStudent(Student student) {
manageRepository.removeStudent(student);
    }

    public List<Student> searchByName(String name) {
        List<Student> students = this.getAll();
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().lastIndexOf(name) >= 0) {
                result.add(student);
            }
        }
        return result;
    }
}
