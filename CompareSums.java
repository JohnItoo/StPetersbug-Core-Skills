import java.io.PrintWriter;
import java.util.Scanner;

public class CompareSums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        float[] a = new float[n + 1];
        float suma = 0f;
        float sumb = 0f;
        for (int i = 0; i < n; i++) {
            a[i]= in.nextFloat();
            suma +=  a[i];
//            out.println( (a[i] * 1000) + " " + a[i]);
        }
        float[] b = new float[n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = in.nextFloat();
            sumb +=   b[i];
//            out.println( (b[i] * 1000) + " " + b[i]);

        }

        out.println("This is sumb" + sumb);
        out.println("This is suma" + suma);
//        float btot = (float) b[n]/1000;
//        float atot = (float) a[n]/1000;
        if (suma < sumb) {
            out.println("SUM(A)<SUM(B)");
        } else if (suma > sumb) {
            out.println("SUM(A)>SUM(B)");
        } else {
            out.println("SUM(A)=SUM(B)");
        }

        in.close();
        out.close();
    }
}
