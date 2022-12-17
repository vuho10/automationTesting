package Bai1;

public class B1b2 {

//    chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b
    public static final char CHAR_55 = 55;

    public static void main(String[] args){

        int n = 15;
        System.out.println("So " + n + " trong he co so 2 = " + B1b2.convertNumber(n, 2));
        System.out.println("So " + n + " trong he co so 16 = " + B1b2.convertNumber(n, 16));
    }
    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 || b > 16 ) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;

        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }
}
