class BytetoAll {
    public static void main(String[] arg) {
        byte b = 65;
        System.out.println("byte : " + b);

        short s = b;
        System.out.println(s);

        int i = b;
        System.out.println(i);

        long l = b;
        System.out.println(l);

        // char c = b;
        // System.out.println(c); //lossy conversion

        float f = b;
        System.out.println(f);

        double d = b;
        System.out.println(d);

        // String str = b;
        // System.out.print(str); // byte cannot be converted to String

    }
}