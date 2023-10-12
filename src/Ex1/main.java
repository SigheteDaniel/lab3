package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Parabola{
    private Punct punct1;
    private Punct punct2;
    public Parabola(Punct parabola1,Punct parabola2){
        this.punct1=parabola1;
        this.punct2=parabola2;
    }

    public String toString(){
        int a1=this.punct1.coeficientia(),b1=this.punct1.coeficientib(),c1=this.punct1.coeficientic();
        int a2=this.punct2.coeficientia(),b2=this.punct2.coeficientib(),c2=this.punct2.coeficientic();
        float x1=-b1/(2*a1);
        float x2,y1,y2;
        float x=(x1+x2)/2;
        float y=(y1+y2)/2;

        return "("+x+","+y+")";
    }
}
class Punct {
    private final int a;
    private final int b;
    private final int c;

    public Punct(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "f(x)=" + a + "x^2+" + b + "x+" + c;
    }

    public int coeficientia(){
        return this.a;

    }
    public int coeficientib(){
        return this.b;

    }
    public int coeficientic(){
        return this.c;

    }
}

public class main {
    public static void main(String[] args) {
        List<Punct> puncte = new ArrayList<Punct>();
        puncte.add(new Punct(1, 2, 3));
        puncte.add(new Punct(3, 4, 5));
        puncte.add(new Punct(5, 6, 7));

        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        puncte.add(new Punct(a,b,c));

        System.out.println("Lista contine punctele:");
        for (Punct p : puncte) {
            System.out.println(p);
        }

        for (int i=0;i<puncte.size()-1;i++)
            System.out.println(new Parabola(puncte.get(i),puncte.get(i+1)));

    }

}
