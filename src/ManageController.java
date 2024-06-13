import java.util.List;

public class ManageController {
    public static void main(String[] args) {
        ViewManage viewManage = new ViewManage();
        ManageService manageService = new ManageService();


        while (true) {
            int choice = viewManage.view();
            switch (choice) {
                case 1:
                    Student student = viewManage.viewStudent();
                    boolean result =manageService.add(student);
                    viewManage.viewMessage(result);
                    break;
                case 2:
                   List<Student> students = manageService.getAll();
                    viewManage.displayAll(students);
                    break;
                case 3:
                    String code = viewManage.inputCode();
                    student = manageService.findByCode(code);
                    if (student == null) {
                        viewManage.viewMessage(false);
                    } else {
                        boolean isConfirm = viewManage.confirmDelete(student);
                        if (isConfirm) {
                            manageService.removeStudent(student);
                            viewManage.viewMessage(true);
                        }
                    }
                    break;
                case 4:
                   String name = viewManage.inputName();
                    students = manageService.searchByName(name);
                    if (students.isEmpty()) {
                        viewManage.displayMessageNotFound();
                    } else {
                        viewManage.displayAll(students);
                    }
                case 0:
                    return;
                default:

                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

}

