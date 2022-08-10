public class Prime {
    public static void main(String[] args) {

        int num = 5;
        boolean trueFalse = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                trueFalse = true;
                break;
            }
        }

        if (!trueFalse)
            System.out.println(true);
        else
            System.out.println(false);
    }
}