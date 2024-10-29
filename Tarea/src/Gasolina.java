import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		
		double tkm, pgl, dgv, cg, cp, r, v, l;
        int hrs, min;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("TOTAL DE KILOMETROS ");
        tkm=entrada.nextDouble();
        
        System.out.println("PRECIO DE GASOLINA (POR LITRO) ");
        pgl=entrada.nextDouble();
        
        System.out.println("DINERO DE GASOLINA GASTADO EN EL VIAJE ");
        dgv=entrada.nextDouble();
        
        System.out.println("INGRESAR TIPO EN HORAS Y MINUTOS" );
        hrs=entrada.nextInt();
        min=entrada.nextInt();
        
        l=dgv/pgl;
        cg=(l/tkm)*100;
        cp=cg*pgl;
        r=l/tkm;
        v=tkm/((hrs + (double) min /60));
        
        System.out.println("CONSUMO DE GASOLINA (LITROS) " +cg);
        System.out.println("CONSUMO EN PRECIO " +cp);
        System.out.println("RENDIMIENTO DE GASOLINA (LITROS) " +r);
        System.out.println("VELOCIDAD MEDIA " +v);

	}

}