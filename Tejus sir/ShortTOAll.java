class ShortTOAll {

    public static void main(String[] args) {
        short s = 65;
        System.out.println(s);

        int i = s;
        System.out.println(i);

        long l = s;
        System.out.println(l);

        // char c = s;
        // System.out.println(c); // lossy conversion

        float f = s;
        System.out.println(f);

        double d = s;
        System.out.println(d);

        // String str = s;
        // System.out.print(str); // byte cannot be converted to String

        // boolean boo = s;
        // System.out.println(boo); // short cannot be converted to boolean

    }

}