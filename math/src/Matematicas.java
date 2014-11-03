import java.util.*;

public class Matematicas{
	 
	     public static void main(String[] args) {	

        	      Scanner sc = new Scanner(System.in);


System.out.println("--> para calcular el valor absoluto de dos numeros escribe 'absoluto' \n ");
System.out.println("--> para calcular el valor de la elevacion de dos numeros escribe 'elevado'\n ");
System.out.println("--> para crear dos numeros aleatorios y te dice cual es el mayor 'maximo'\n ");
	       		String hacer ;

			hacer = sc.next();
	

//para calcular el valor absoluto de un numero
if (hacer.equalsIgnoreCase("absoluto") )
			{

		      		int x, y;
		
				System.out.println("mete el valor que quieras darle a x:");
		 	 	x = sc.nextInt();
				
				System.out.println("mete el valor que quieras darle a y: ");
       		 		y = sc.nextInt();

			
    				System.out.println("Valor absoluto de "+ x + " es=" + Math.abs(x));
     				System.out.println("Valor absoluto de "+ y + " es="  + Math.abs(y));				
		         }

// para calcular la elevacion de un numero
if (hacer.equalsIgnoreCase("elevado") )
			{
				int x, y;
				System.out.println("escribe el valor del numero que quieras elevar:");
		 	 	x = sc.nextInt();
				
				System.out.println("mete el valor de las vezes que el numero introducido sea elevado");
       		 		y = sc.nextInt();

				double eleva = Math.pow( x,  y);
				System.out.println("el resultado de "+ x +"^"+ y + "es : "+eleva);
			}

if (hacer.equalsIgnoreCase("maximo") )
			{

			Random rndm = new Random ();
			
			int numero1 = rndm.nextInt();
			int numero2 = rndm.nextInt();
			System.out.println("estos son los numeros creado aleatoriamente" + numero1+"  y  "+numero2);

			int max = Math.max(numero1, numero2);
			System.out.println("el mayor es " + max);
			
     }
}
}
