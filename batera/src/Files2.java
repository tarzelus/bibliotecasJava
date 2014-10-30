import java.io.*;
import java.util.*;
public class Files2 {

	public static void main(String[] args)
	{
		String nombrefichero;
		String ruta ="";
		String nombrecarpeta = "";
		int opcion; 

		Scanner sc = new Scanner(System.in);
		 //Fecha actual del sistema

		java.util.Date fechaActual = new java.util.Date();

		System.out.print("\nelige una de las siguientes opciones: \n");

		System.out.print("\n1- creacion de una carpeta");
		System.out.print("\n2- creacion del fichero");
		System.out.print("\n3- escribir en el fichero");
		System.out.print("");



		opcion = sc.nextInt();		

switch (opcion) {
	
		//-----------------creacion de la carpeta------------------------------
		case 1:
		{
		System.out.print("\n Introduce un nombre para la carpeta que quieras crear: ");
		nombrecarpeta = sc.next();

		
		File carpeta = new File (nombrecarpeta);

			if (carpeta.mkdir())
			{
				System.out.println("La carpeta a sido creada.");
			}

			else
			{
				System.out.println("No se ha creado .");
			}
		break;
		}
		//-----------------creacion del fichero dentro de la carpeta creada---------
		
		case 2:
		{

		try
		{

			System.out.print("\n Introduce un nombre para el fichero que quieras crear: ");
			nombrefichero = sc.next();

			File fichero = new File (nombrecarpeta , nombrefichero);
		
			ruta = fichero.getAbsolutePath(); 


			if (fichero.createNewFile())
			{
   				 System.out.println("El fichero se ha creado correctamente");	
			}
 			else
   			 	System.out.println("No ha podido ser creado el fichero");
		} 
		catch (IOException ioe) 
		{
  			ioe.printStackTrace();
		}
		break;
		}
		//--------------------escribir en el fichero creado-------------------------
		case 3:
		{
		try 
		{
			PrintWriter pw = null;	
 
			pw =new PrintWriter(ruta);
		
			String escribir = "";
		
			System.out.print("\n Introduce el texto que quieras para añadir al fichero creado \n");
			escribir = sc.nextLine();

			while (!escribir.equalsIgnoreCase("FIN")) 
			{
				pw.println(escribir + " --> " +fechaActual);
               			 escribir = sc.nextLine();
           		}

		

			pw.flush();
        	}
		 catch (FileNotFoundException e) 
		{
           		 System.out.println(e.getMessage());
        	}
		break;
		}
		}
	
	}
}
