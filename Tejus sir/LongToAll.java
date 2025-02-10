// without typecasting operator possible lossy conversion
class LongToAll {
    public static void main(String[] args) {
        long l = 1000000000000000000l;
        System.out.println(l);

        byte b = (byte) l;
        System.out.println(b);

        short s = (short) l;
        System.out.println(s);

        char c = (char) l; // ? if it is is under ascii code then it prints specific character according to
                           // asccii value
        System.out.println(c);

        int i = (int) l;
        System.out.println("--" + i); // 1486618624

        float f = (float) l; // small value under a range of float value add with decimal point .000
        System.out.println(f); // Big Value--> 9.9999998E17

        double d = (double) l; //// small value under a range of double value add with decimal point .000
        System.out.println(d); // 1.0E18

    }
}