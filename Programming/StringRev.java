public class StringRev {

    public static void main(String[] arg) {
        String str = "Tejus";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);

        StringBuffer rev2 = new StringBuffer(rev);
        System.out.println(rev2.reverse());
    }

}
