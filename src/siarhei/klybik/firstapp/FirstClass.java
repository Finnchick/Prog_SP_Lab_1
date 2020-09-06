package siarhei.klybik.firstapp;

public class FirstClass {
    public	static	void	main(String[]	args) {
        int i;
        double s, z;
        i = 3;
        s = 5.5;
        z = s / i;
        System.out.println("i	=	" + i);
        System.out.println("s	=	" + s);
        System.out.printf("z	=	%f", z);
        System.out.println();
        for (int f = 0; f < 20; f++) {
            if (f%2 == 0 && f/2 >=5) {
                System.out.println(f);
            }
        }
        Tribe Reapers = new Tribe();
        Reapers.ShowName();
        Reapers.ShowFireTrigger();
        Reapers.ShowQuantity();
    }
}

