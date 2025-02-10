class NarrowingShort {

    public static void main(String[] args) {
        // short s = 65;
        // System.out.println(s);

        // char c = (char) s; // 650 --> ?
        // System.out.println(c); // 65 --> A

        // byte b = (byte) s; // 65 --> 65
        // System.out.println(b); // 650 --> -118

        char c = 'A';

        short s = (short) c;
        byte b = (byte) c;

        System.out.println(b);
    }

}
