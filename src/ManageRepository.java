import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManageRepository {
    private static final String SRC_STUDENT = "D:\\code_gym\\module_2_java\\session\\test_module2\\src\\student.csv";
    private static List<Student> students = new ArrayList<>();

    public void add(Student student) {
        List<Student> students = new ArrayList<>();
        students.add(student);
        writeFile(students, true);
    }

    public List<Student> getAll() {
        List<Student> students = new LinkedList<>();
        File file = new File(SRC_STUDENT);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                students.add(new Student(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khômng tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        } finally {
            if( br !=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
        }
        return students;
    }

    private void writeFile(List<Student> students, boolean append) {
        File file = new File(SRC_STUDENT);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student temp : students) {
                bufferedWriter.write(toString(temp));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Lỗi đóng file");
                }
            }
        }
    }

    private String toString(Student student) {
        return student.getCodeStudent() + "," + student.getName() + "," + student.getMale() + "," + student.getBirthOfDay()+","+student.getCodeClassRoom()+","+student.getPhoneNumber();
    }

    public Student findByCode(String code) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student == null) {
                return null;
            }
            if (student.getCodeStudent().equals(code)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        List<Student> students = getAll();
        int size = students.size();
        for (int i = 0; i < size; i++) {
            if (students.get(i).getCodeStudent().equals(student.getCodeStudent())) {
                students.remove(i);
                writeFile(students, false);
                break;
            }
        }
    }

}
