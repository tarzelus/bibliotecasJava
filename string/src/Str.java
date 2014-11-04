
import java.lang.String;
import java.util.Scanner;

public class Str
{
	public static void main (String[] args)
	{
	//declaracion de las variables de tipo string
		String bat;
		String bi;

	
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Intruoduce el el primer string: ");
		bat = sc.nextLine();

	
		System.out.print("\n Introduce el segundo string: ");
		bi = sc.nextLine();



		// con el siguiente objeto concatena el string bat con el string 2
    		String concatenado = bat.concat(bi);
   		System.out.println("\n El texto concatenado es: " + concatenado);

		
		// para imprimir los dos strings ya concatenados
		System.out.println("\n Primer valor de la cadena concatenada: " + concatenado);
		

		//para convertir en mayusculas o minusculas los caracteres del string
		String minus = concatenado.toLowerCase();
		String mayus = concatenado.toUpperCase();

		System.out.print("lo concatenado en minuscula: " + minus);
		System.out.print("\nlo concatenado en mayuscula: " + mayus);





		//para comparar los dos Strings si son iguales da igual mayuscula o minuscula
		if (bat.equalsIgnoreCase(bi) )  //  igual con mayuscula y minusculas  bat.equals(bi)
			System.out.println("\nLos dos strings son iguales");
		else
			System.out.println("\nlos dos strings son diferentes");

		//si el string esta vacio para ello lo escrito por teclado tiene que ser de tipo nextLine
		if (bat.isEmpty())
			System.out.println("el string bat esta vacio");

		if (bi.isEmpty())
			System.out.println("el string bi esta vacio");

		//para convertir datos de cualquier tipo a string
		System.out.print("\n Intruoduce un numero para convertirlo a string ");
		int zenbaki = sc.nextInt();

		String berria = String.valueOf(zenbaki);
		System.out.print(zenbaki);
		

		
			
	}
}
