import java.io.*;
import java.util.*;
public class Files {

	public static void main(String[] args)
	{
		String nombrefichero;
		String ruta ="";
		String nombrecarpeta;
		

		Scanner sc = new Scanner(System.in);
		 //Fecha actual del sistema

		java.util.Date fechaActual = new java.util.Date();


	
		//-----------------creacion de la carpeta------------------------------

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

		//-----------------creacion del fichero dentro de la carpeta creada---------

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

		//--------------------escribir en el fichero creado-------------------------
		
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


	
	}
}
