package ra.validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateDemo {
    public static void main(String[] args) {
        /*
         * Nhập vào và hiển thị thông tin sinh viên:
         * 1. Mã sinh viên
         * 2. Tên sinh viên
         * 3. Tuổi sinh viên phải là số nguyên và có giá trị lớn hơn hoặc bằng 18
         * 4. Điểm trung bình sinh viên phải là số thực - float, và có giá trị nằm trong khoảng 0-10
         * 5. Ngày sinh sinh viên, phải có kiểu dữ liệu là date và có định dạng dd/MM/yyyy
         * */
        Scanner scanner = new Scanner(System.in);
        String studentId = inputStudentId(scanner);
        String studentName = inputStudentName(scanner);
        int age = inputAge(scanner);
        float avgMark = inputAvgMark(scanner);
        Date birthDate = inputBirthDate(scanner);
    }

    public static String inputStudentId(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        return scanner.nextLine();
    }

    public static String inputStudentName(Scanner scanner) {
        System.out.println("Nhập vào tên sinh viên:");
        return scanner.nextLine();
    }

    public static int inputAge(Scanner scanner) {
        System.out.println("Nhập vào tuổi sinh viên:");
        //Tuổi có kiểu dữ liệu là số nguyên
        do {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age >= 18) {
                    return age;
                } else {
                    System.err.println("Tuổi sinh viên phải có giá trị lớn hơn hoăc bằng 18");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Tuổi sinh viên phải là số nguyên, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Có lỗi không xác định, vui lòng nhập lại");
            }
        } while (true);
    }

    public static float inputAvgMark(Scanner scanner) {
        System.out.println("Nhập vào điểm trung bình của sinh viên:");
        do {
            try {
                float avgMark = Float.parseFloat(scanner.nextLine());
                if (avgMark >= 0 && avgMark <= 10) {
                    return avgMark;
                } else {
                    System.err.println("Điểm trung bình nằm trong khoảng 0-10, vui lòng nhập lại");
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Điểm trung bình sinh viên là số thực, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Có lỗi không xác định, vui lòng nhập lại");
            }
        } while (true);
    }

    public static Date inputBirthDate(Scanner scanner) {
        System.out.println("Nhập vào ngày sinh của sinh viên:");
        do {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.parse(scanner.nextLine());
            } catch (ParseException pe) {
                System.err.println("Không đúng định dạng dd/MM/yyyy, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Có lỗi không xác định, vui lòng nhập lại");
            }
        } while (true);
    }
}
