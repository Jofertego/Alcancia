import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner usuario=new Scanner (System.in);
        int m20=0,m50=0,m100=0,m200=0,m500=0,m1000=0,op,opm,activo=0,s20=0,s50=0,s100=0,s200=0,s500=0,s1000=0,total=0,meta;
        System.out.println("Asigne una meta de ahorro: ");
        meta = usuario.nextInt();
        while(activo==0) {
            System.out.println("""
                    Bienvenido a su alcancia, escoja una opcion.
                    1.Ahorrar
                    2.Contar monedas
                    3.Valor acumulado
                    4.Total dinero
                    5.Meta de ahorro
                    6.Cerrar programa""");
            op = usuario.nextInt();
            switch (op) {
                case 1:
                    System.out.println("""
                            Escoja la moneda que desea ahorrar.
                            1.Moneda de 20.
                            2.Moneda de 50.
                            3.Moneda de 100.
                            4.Moneda de 200.
                            5.Moneda de 500.
                            6.Moneda de 1000.""");
                    opm = usuario.nextInt();
                    switch (opm) {
                        case 1:
                            System.out.println("Se sumo una moneda de 20");
                            m20=m20+1;
                            break;
                        case 2:
                            System.out.println("Se sumo una moneda de 50");
                            m50=m50+1;
                            break;
                        case 3:
                            System.out.println("Se sumo una moneda de 100");
                            m100=m100+1;
                            break;
                        case 4:
                            System.out.println("Se sumo una moneda de 200");
                            m200=m200+1;
                            break;
                        case 5:
                            System.out.println("Se sumo una moneda de 500");
                            m500=m500+1;
                            break;
                        case 6:
                            System.out.println("Se sumo una moneda de 1000");
                            m1000=m1000+1;
                            break;
                    }
                case 2:
                        System.out.println("-Monedas de 20:"+m20);
                        System.out.println("-Monedas de 50:"+m50);
                        System.out.println("-Monedas de 100:"+m100);
                        System.out.println("-Monedas de 200:"+m200);
                        System.out.println("-Monedas de 500:"+m500);
                        System.out.println("-Monedas de 1000:"+m1000);
                        break;

                case 3:
                        s20=m20*20;
                        System.out.println("La suma de monedas de 20 es: "+s20);
                        s50=m50*50;
                        System.out.println("La suma de monedas de 50 es: "+s50);
                        s100=m100*100;
                        System.out.println("La suma de monedas de 100 es: "+s100);
                        s200=m200*200;
                        System.out.println("La suma de monedas de 200 es: "+s200);
                        s500=m500*500;
                        System.out.println("La suma de monedas de 500 es: "+s500);
                        s1000=m1000*1000;
                        System.out.println("La suma de monedas de 1000 es: "+s1000);
                        break;
                case 4:
                    total=s20+s50+s100+s200+s500+s1000;
                    System.out.println("El acumulado total es de: "+total);
                    break;
                case 5:
                    s20=m20*20;
                    s50=m50*50;
                    s100=m100*100;
                    s200=m200*200;
                    s500=m500*500;
                    s1000=m1000*1000;
                    total=s20+s50+s100+s200+s500+s1000;
                    if(total>=meta)
                        activo=activo=1;
                    else
                        System.out.println("La meta va en: "+total);
                    break;
                case 6:
                    activo=activo=1;
                    break;
            }
        }
        System.out.println("El programa se cerro");
    }
}