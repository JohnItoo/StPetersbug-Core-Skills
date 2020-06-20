public class NestedFors {
    public static void main(String[] args) {
        familiarNestedFors(3, 0, new char[3]);
    }

    static void nestedFors(int n, int thisFor, char[] x) {
        if (thisFor < n) {
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    x[thisFor] = 'a';
                } else {
                    x[thisFor] = 'b';
                }
                nestedFors(n, thisFor + 1, x);
            }
        } else {
            System.out.println(x);
        }
    }

    static void familiarNestedFors(int n, int idx, char[] x) {
        if (idx == n) {
            System.out.println(x);
            return;
        }
        char[] c = {'a', 'b'};
        for (int i = 0; i < 2; i++) {
            x[idx] = c[i];
            familiarNestedFors(n, idx + 1, x);
        }
    }
}