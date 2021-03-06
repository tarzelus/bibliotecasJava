	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	 
	public class Calendars{
	 
	     public static void main(String[] args) {
	        // Nos da informacion sobre nuestro calendario
	         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//se crea el constructor de Calendar para poder darle uso
	         Calendar calendar = Calendar.getInstance();
	         System.out.println(dateFormat.format(calendar.getTime()));

		//accedemos a los datos que nos proporciona el objeto calendar	         
	        System.out.println("Urtea: " + calendar.get(Calendar.YEAR));
	        System.out.println("hilabetea: " + calendar.get(Calendar.MONTH));
	        System.out.println("Urteko Astea: " + calendar.get(Calendar.WEEK_OF_YEAR));
	        System.out.println("Hilabeteko asketa: " + calendar.get(Calendar.WEEK_OF_MONTH));
	        System.out.println("data: " + calendar.get(Calendar.DATE));
	        System.out.println("Eguna: " + calendar.get(Calendar.DAY_OF_MONTH));
	        System.out.println("Urteko eguna: " + calendar.get(Calendar.DAY_OF_YEAR));
	        System.out.println("Asteko eguna: " + calendar.get(Calendar.DAY_OF_WEEK));
	        System.out.println("Asteko eguna hilabeteas: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	        System.out.println("Goiz/arratsalde: " + calendar.get(Calendar.AM_PM));
	        System.out.println("Ordua: " + calendar.get(Calendar.HOUR));
	        System.out.println("Minutua: " + calendar.get(Calendar.MINUTE));
	        System.out.println("Segundua: " + calendar.get(Calendar.SECOND));
	        System.out.println("Milisegundua: " + calendar.get(Calendar.MILLISECOND));
	  	}

}
