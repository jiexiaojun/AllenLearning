package allen._21_30;


/*一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
求它在第10次落地时，共经过多少米？第10次反弹多高？*/
public class Test21 {
    public static void main(String[] args) {
        double s = 0;
        double h = 100;
        for (int i = 1; i <= 10; i++) {
            s += h;
            h = h/2;
            s += h;
        }
        System.out.println("经过路程："+s);
        System.out.println("反弹高度："+h);
    }
}