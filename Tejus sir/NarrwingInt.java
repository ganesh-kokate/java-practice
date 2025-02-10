class NarrwingInt {

    public static void main(String[] args) {
        int i = 6500000;
        System.out.println(i);

        Short s = (short) i; // 65000000 --->-11712
        System.out.println(s); // 65-->65

        byte b = (byte) i; // 65000000 --> 64
        System.out.println(b); // 65 -->65

        char c = (char) i; // 65000000 --> ?
        System.out.println(c); // 65 --> A

    }

}
