import java.util.Scanner;

public class Masa_corporal {

	public static void main(String[] args) {

		Scanner entrada=new Scanner (System.in);
		
		double peso,estatura;
		boolean x;
		
		System.out.println("ingresa peso");
		peso=entrada.nextDouble();

		System.out.println("ingresa estatura");
		estatura=entrada.nextDouble();
		
		double IMC = peso/Math.pow(estatura, 2);
		
		x=IMC<=18.9;
		System.out.println("bajo peso "+x);
		
		x=IMC>=18.50 && IMC<=24.99;
		System.out.println("peso normal "+x);
		
		x=IMC>=25.00 && IMC<=29.99;
		System.out.println("sobrepeso "+x);
		
		x=IMC>=30.00 && IMC<=34.99;
		System.out.println("obesidad leve "+x);
		
		x=IMC>=35.00 && IMC<=34.99;
		System.out.println("obesidad media "+x);
		
		x=IMC>=40.00;
		System.out.println("obesidad morbida "+x);
		
		
		/*if (IMC<=18.9)
			System.out.println("bajo peso");
		else if(IMC>=18.50 && IMC<=24.99)
			System.out.println("peso normal");
		else if (IMC>=25.00 && IMC<=29.99)
			System.out.println("sobrepeso");
		else if (IMC>=30.00 && IMC<=34.99)
		System.out.println("obesidad leve");
		else if (IMC>=35.00 && IMC<=34.99)
			System.out.println("obesidad media");
		else if (IMC>=40.00)
			System.out.println("obesidad morbida");*/

			}

	}
