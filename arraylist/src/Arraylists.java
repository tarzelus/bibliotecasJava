import java.util.*;
public class Arraylists{
	public static void main(String[] args) {

		
		
		System.out.println();


		Scanner sc=new Scanner(System.in);

		String datua;

		//se crea el constructor de ArrayList para poder darle uso
		
		ArrayList lista = new ArrayList();

		System.out.println("idatzi next hasteko edo sakatu fin amaitzeko");
		datua=sc.next();
		
		//si la variable de datua es diferente a fin empieza a dar valor al arraylist
		
		if (!datua.equalsIgnoreCase("FIN")) 
		{
		
			//creacion del bucle para ir dando valor al array en sus respectivas posiciones
			for (int i = 0 ; i <= 2; i++)
			{
				if (!datua.equalsIgnoreCase("FIN") && i==0)
				{
				System.out.println("Sartu zure izena");
				datua=sc.next();
				lista.add(i, datua);
				}

				if (!datua.equalsIgnoreCase("FIN") && i==1)
				{
				System.out.println("Sartu zure Abizena");
				datua=sc.next();
				lista.add(i, datua);
				}

				if (!datua.equalsIgnoreCase("FIN") && i==2)
				{
				System.out.println("Sartu zure jaiotza data");
				datua=sc.next();
				lista.add(i, datua);
				}
			}
			


		}
		
		//imprime las siguientes opciones para comprabar si lo escrito en el array es correcto
		//si no es asi da opcion a cambiarlo hasta que esten todos los datos correctos y sale de la ejecucion
		int  egin = 0;
		do {
		System.out.println("Datuak zuzen ezbadaude aukeratu zein\n");
		System.out.println("\n0--> izena: " + lista.get(0) );
		System.out.println("\n1--> abizena: " + lista.get(1));
		System.out.println("\n2--> jaiotza data: " + lista.get(2));
		System.out.println("\n3--> datuak zuzenak badira ");
		
		

		egin=sc.nextInt();	
		
		switch (egin) 
		{
			case 0 : 
			{	
			System.out.println("Idatzi berriro zure izena\n");
			String izberri = sc.next();
			lista.remove(0);
			lista.add(0, izberri);
			break;
			}
			case 1 : 
			{
			System.out.println("idatzei berriro zure abirzena\n");
			String abizberri = sc.next();
			lista.remove(1);
			lista.add(1, abizberri);
			break;
			}
			case 2 : 
			{
			System.out.println("idatzi berriro zure jaoitza data\n");
			String jaio = sc.next();
			lista.remove(1);
			lista.add(1, jaio);
			break;
			}
		}



		
		}while (egin != 3);
		
		System.out.println("----- atera da -----");


	}
	
}
