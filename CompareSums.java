import java.io.PrintWriter;
import java.util.Scanner;

public class CompareSums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        double[] a = new double[n + 1];
        double suma = 0.0000000000;
        double sumb = 0.0000000000f;
        for (int i = 0; i < n; i++) {
            a[i]= in.nextDouble();
            suma += a[i];
            out.println(suma);
//            out.println( (a[i] * 1000) + " " + a[i]);
        }
        double[] b = new double[n + 1];
         out.println("SUMB");
        for (int i = 0; i < n; i++) {
            b[i] = in.nextDouble();
            sumb += b[i];
            out.println(sumb);

//            out.println( (b[i] * 1000) + " " + b[i]);

        }

        out.println("This is sumb" + sumb);
        out.println("This is suma" + suma);
//        float btot = (float) b[n]/1000;
//        float atot = (float) a[n]/1000;
        if (suma == sumb) {
            out.println("abs is" + Math.abs(suma-sumb)  );
            out.println("SUM(A)=SUM(B)");
        } else if (suma > sumb + 0.001) {
            out.println("SUM(A)>SUM(B)");
        } else {
            out.println("SUM(A)<SUM(B)");
        }

        in.close();
        out.close();
    }
}
