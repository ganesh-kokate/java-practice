public class Interest {
    public static void main(String[] args) {
        int month = 20;
        int total = month / 12;
        float extar = month % 12;
        float final_value = total + (extar / 10);
        System.out.println(final_value);
    }

}
