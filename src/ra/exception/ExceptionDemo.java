package ra.exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        //Xử lý ngoại lệ cho khối lệnh bên dưới với try...catch
        /*
         * try{
         *   Block Statements;//Khối lệnh được bắt ngoại lệ
         * }catch(Exception ex){
         *   Block Statements;//Khối lệnh xử lý ngoại lệ
         * }finally{
         *   Block Statements;//Khối lệnh bắt buộc thực hiện dù có exception hay không
         * }
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH BẮT ĐẦU");
        try {
            System.out.println("Nhập số nguyên thứ nhất:");
            int firstNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào số nguyên thứ hai:");
            int secondNumber = Integer.parseInt(scanner.nextLine());
            //Unchecked Exception - Runtime
            int div = firstNumber / secondNumber;
            System.out.printf("Kết quả của phép chia giữa %d và %d là: %d\n", firstNumber, secondNumber, div);
        } catch (NumberFormatException nfe) {
            System.err.println("Lỗi định dạng dữ liệu đầu vào, mời bạn chạy lại chương trình");
        } catch (ArithmeticException ae) {
            System.err.println("Lỗi chia cho 0, mời bạn chạy lại chương trình");
        } catch (Exception ex) {
            System.out.println("Chương trình bị lỗi: " + ex.getMessage());
            System.out.println("Mời bạn chạy lại chương trình");
        } finally {
            System.out.println("CHƯƠNG TRÌNH KẾT THÚC");
        }
        //Checked Exception - Compile
        //Class.forName("");
        int result = divTwoNumber(8, 0);
        System.out.println("Kết quả hai số: " + result);
    }

    public static int divTwoNumber(int firstNumber, int secondNumber) throws Exception {
        //Sử dụng throw để ném ngoại lệ các trường hợp cụ thể
//        if (secondNumber == 0) {
//            //Ném 1 đối tượng ngoại lệ để xử lý
//            throw new ArithmeticException("Lỗi chia 0 trong phép chia");
//        }
        int result = firstNumber / secondNumber;
        return result;
    }
}
