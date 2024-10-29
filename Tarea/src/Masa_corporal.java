import java.util.Scanner;

public class Masa_corporal {

	public static void main(String[] args) {

		 double imc, p, t, t2;
		        Scanner entrada=new Scanner(System.in);
		        
		        System.out.println("INGRESAR PESO EN KILOGRAMOS ");
		        p=entrada.nextDouble();
		        
		        System.out.println("INGRESAR LA TALLA");
		        t2=entrada.nextDouble();
		        
		        t=Math.pow(t2, 2);
		        imc=p/t;
		        
		        String condicion = "";
		        if (imc < 18.9){
		            condicion = "PASO BAJO";
		        } else if (imc < 24.99){
		            condicion = "PESO NORMAL";
		        } else if (imc < 29.99){
		            condicion = "SOBRE PESO";
		        } else if (imc < 34.99){
		            condicion = "OBESIDAD LEVE";
		        } else if (imc < 39.99){
		            condicion = "OBESIDAD MEDIA";
		        } else if (imc > 40.0){
		            condicion = "OBESIDAD MORBIDA";
		        }
		        
		        System.out.println("SU IMC SE ENCUENTRA EN " +imc);
		        System.out.println("SU IMC SE ENCUENTRA EN " +condicion);


	}

}
