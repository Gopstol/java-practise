public class text_complex {
    public static void main(String[] args) {
        complex z1 = new complex();
        z1.print();
        z1.x = 2;
        z1.print();
        System.out.println(z1.module());
        System.out.println(z1.arg());

        System.out.println("Введем второе число:");
        complex z2 = new complex(3, -2);
        z2.print();
        System.out.println(z2.module());
        System.out.println(z2.arg());
        complex z3 = z1.sum(z2);
        z3.print();
    }
}
