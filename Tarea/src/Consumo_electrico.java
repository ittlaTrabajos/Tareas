import java.util.Scanner;

public class Consumo_electrico {

	public static void main(String[] args) {
	Scanner entrada =new Scanner (System.in);
		
	double c,d;
	boolean x=true;
        
        System.out.println("Ingresa consumo en Kwh");
        c=entrada.nextDouble();
       
        c=c+25;

	x=(c<=75);
	System.out.println("Tu consumo es basico "+ x + " y el costo es de $.882");
	d= c*.882;
	System.out.println("El total a pagar es "+d);

	System.out.println("Tu consumo es intermedio bajo "+ x + " y el costo es de $1.073");
	d= c*1.073;
	System.out.println("El total a pagar es "+d);

	System.out.println("Tu consumo es excedente "+ x + " y el costo es de $3.134");
	d= c*3.134;
	System.out.println("El total a pagar es "+d);
	}

}
