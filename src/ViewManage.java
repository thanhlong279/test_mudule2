import java.util.List;
import java.util.Scanner;

public class ViewManage {
    public int view() {
        System.out.println("--------StudentView--------");
        System.out.println("1. add");
        System.out.println("2. Display");
        System.out.println("3. Delete");
        System.out.println("4. student search by name");
        System.out.println("0. Edit");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            try {
                System.out.println("Input your choice");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("code là số nguyên dương lớn hơn 0");
            }
        } while (choice < 0 || choice > 4);
        return choice;
    }

    public Student viewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập codeStudent: ");
        String codeStudent = sc.nextLine();
        System.out.println("nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("nhập ngày sinh: ");
        String birth = sc.nextLine();
        System.out.println("nhập giới tính: ");
        String gender = sc.nextLine();
        System.out.println("nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println(" nhập mã lớp học: ");
        String codeClassRoom = sc.nextLine();
        Student student = new Student(codeStudent, name, birth, gender, phoneNumber, codeClassRoom);
        return student;
    }

    public void viewMessage(boolean result) {
        if (result) {
            System.out.println("thanh cong");
        } else {
            System.out.println("that bai");
        }

    }

    public void displayAll(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    public String inputCode() {
        System.out.println(" nhập code muốn xóa: ");
        return new Scanner(System.in).nextLine();
    }

    public boolean confirmDelete(Student student) {
        System.out.println(" ban co muon xoa sinh vien co code la " + student.getCodeStudent() + "bam Y de xac nhan, bam N de huy");
        Scanner sc = new Scanner(System.in);
        String confirm = sc.nextLine();
        if (confirm.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public String inputName() {
        System.out.println(" nhập tên: ");
        return new Scanner(System.in).nextLine();
    }

    public void displayMessageNotFound() {
        System.out.println(" ko tim thay");
    }
}
