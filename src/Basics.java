public class Basics {

    public static void sayHelloWorld() {
        System.out.println("Hello, World!");
    }

    public static void secondQuestion(
            double a, double b, double c
    ) {
        double composition = a * b * c;
        double average = (a + b + c) / 3;
        double buff;

        for (int i = 0; i < 2; i++) {
            if (b < a) {
                buff = a;
                a = b;
                b = buff;
            }
            if (c < b) {
                buff = b;
                b = c;
                c = buff;
            }
        }
        System.out.println(composition);
        System.out.println(average);
        System.out.printf("%f, %f, %f\n", a, b, c);
    }
}
