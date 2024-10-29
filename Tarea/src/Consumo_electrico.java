import java.util.Scanner;

public class Consumo_electrico {

	public static void main(String[] args) {
		Scanner entrada =new Scanner (System.in);
		
		double b, i, e;
        double cb, ci, ce, tb, ti, te;
        
        System.out.println("INGRESAR CONSUMO BASICO ");
        b=entrada.nextInt();
        
        System.out.println("INGRESAR CONSUMO INTERMEDIO ");
        i=entrada.nextInt();
        
        System.out.println("INGRESAR CONSUMO EXEDENTE ");
        e=entrada.nextInt();
        
        cb=Math.min(b, 75);
        ci=Math.min(i, 140);
        ce=Math.min(e, 141);
        
        tb=(cb+25)*0.882;
        ti=(ci+25)*1.073;
        te=(ce+25)*3.134;
        
        System.out.println("CONSUMO BASICO " +b);
        System.out.println("CONSUMO INTERMEDIO " +i);
        System.out.println("CONSUMO EXCEDENTE " +e);
        
        System.out.println("CONSUMO BASICO TOTAL A PAGAR " +tb);
        System.out.println("CONSUMO BASICO TOTAL A PAGAR " +ti);
        System.out.println("CONSUMO BASICO TOTAL A PAGAR " +te);

	}

}
