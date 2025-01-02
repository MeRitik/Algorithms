class RollingHash {

    private static final int P = 256;
    private static final int M = (int) 1e9 + 9;

    public static long computeHash(String s) {
        long hashValue = 0;
        long pPow = 1;

        for (char c : s.toCharArray()) {
            hashValue = (hashValue + (c - 'a' + 1) * pPow) % M;
            pPow = (pPow * P) % M;
        }

        return hashValue;
    }

    public static void main(String[] args) {
        String testString = "example";
        long hash = computeHash(testString);
        System.out.println("Hash value: " + hash);
    }
}
