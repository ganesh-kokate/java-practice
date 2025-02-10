class NarrowingDouble {
    public static void main(String[] args) {
        double d = 1.7976931348623157E308;
        System.out.println(d);

        float f = (float) d; // 1.7976931348623157E308 --> Infinity
        System.out.println(f); // 1.7976931 --> 1.7976931

        long l = (long) d; // 1.7976931348623157E308 --> 9223372036854775807
        System.out.println(l); // 1.7976931 --> 1

        int i = (int) d; // 1.7976931348623157E308 --> 2147483647
        System.out.println(i); // 1.7976931 --> 1

        short s = (short) d; // 1.7976931348623157E308 --> -1
        System.out.println(s); // 1.797 --> 1

        byte b = (byte) d; // 1.7976931348623157E308 --> -1
        System.out.println(b); // 132 --> -124

    }

}
