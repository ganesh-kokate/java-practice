class Charcasting {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        int i = c;
        System.out.println(i);

        // short s = c;
        // System.out.println(s); // possible lossy conversion from char to short

        long l = c;
        System.out.println(l);

        float f = c;
        System.out.println(f);

        double d = c;
        System.out.println(d);

        // String str = c;
        // System.out.print(str); // char cannot be converted to String

        // boolean boo = c;
        // System.out.println(boo); // char cannot be converted to boolean

    }
}
