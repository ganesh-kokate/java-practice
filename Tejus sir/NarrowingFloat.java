class NarrowingFloat {
    public static void main(String[] args) {

        float f = 3.4028235E38f;
        System.out.println(f);

        long l = (long) f; // 3.4028235E38f --> 9223372036854775807
        System.out.println(l); // 3.14 --> 3

        int i = (int) f; // 3.4028235E38f --> 2147483647
        System.out.println(i); // 3.14 --> 3

        short s = (short) f; // 3.4028235E38f --> -1
        System.out.println(s); // 3.14 --> 3

        char c = (char) f; // 65.0f --> A //3.14 Empty
        System.out.println(c); // 3.4028235E38f --> ?

        byte b = (byte) f; // 3.4028235E38f --> -1
        System.out.println(b);// 3.14 --> 3

    }
}
