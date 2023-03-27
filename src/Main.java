public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        double c = (double) a/b;
        int d = a%b;
        System.out.println();
        System.out.println("______Задача перша______");
        System.out.println("числа : "+a+" та "+b);
        System.out.println("результат ділення : "+c);
        System.out.println("остача ділення : "+d);
        System.out.println();

        int f = 39;
        int ds = f/10;
        int od = f%10;
        int sum = ds+od;
        System.out.println("______Задача друга______");
        System.out.println("число : "+f);
        System.out.println("сума цифр двозначного числа : "+sum);
        System.out.println();

        double r = 3.65;
        double v = r + 0.5 ;
        double vi = (int) v;
        System.out.println("______Задача третя______");
        System.out.println("число : "+r);
        System.out.println("округлене число : "+ vi);
        System.out.println();
        System.out.println();

    }
}