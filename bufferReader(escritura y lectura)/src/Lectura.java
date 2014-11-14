import java.util.*;
import java.io.*;

public class Lectura {
    public static void main(String arglist[]) throws IOException{
 //-------------------------escritura------------------------------   

    String nombre;
    String ruta;
    String salida;
	String DNI, nombre1, apellido, denuevo;
		int edad;

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce la ruta donde se encuentra el fichero: ");
	ruta = sc.next();
	System.out.print("\nIntroduce el nombre del archivo que quieras leer: ");
	nombre = sc.next();
 	ruta=ruta+"/"+nombre;
			FileWriter fw = new FileWriter(ruta , true);
			BufferedWriter bw = new BufferedWriter(fw);
		
			


		

			//pregunta por primera vez para escribir el nombre del habitante y pregunta para agregar un nombre mas a la lista
			do{
		
			//comprueba que el DNI inglresado tiene el numero de caracteres que tiene que tener un DNI		
				System.out.print("\ningresa el numero del DNI con letra (8 numeros y 1 letra): ");
				DNI = sc.next();
							
				bw.write(DNI + ",");

				System.out.print("\ningresa el Nombre del habitante: ");
				nombre1 = sc.next();
				bw.write(nombre1 + ",");
			
				System.out.print("\ningresa el apellido del hahbitante: ");
				apellido = sc.next();
				bw.write(apellido + ",");

				System.out.print("\ningresa la edad del habitante: ");
				edad = sc.nextInt();
				bw.write(edad + "\n");

				bw.close();
				System.out.print("\nquieres insertar otro habitante? (si/no)");
				denuevo = sc.next();
		

			}while (denuevo.equalsIgnoreCase("si"));




//-------------------------------lectura---------------------------------------


	File archivo = new File(ruta);
	FileReader leer = new FileReader (archivo);
	BufferedReader bf = new BufferedReader(leer);
		while ((salida = bf.readLine())!=null) {
   		System.out.println(salida);
		}
  	}
}
