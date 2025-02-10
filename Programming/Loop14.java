public class Loop14 {

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }

}
