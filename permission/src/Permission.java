
import java.util.*;
import java.io.*;

public class Lectura {
    public static void main(String arglist[]) throws IOException{
    String nombre;
    String ruta;
    String salida;

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce la ruta: ");
	ruta = sc.next();
	System.out.print("\nIntroduce el nombre del archivo que quieras leer: ");
	nombre = sc.next();

if (permission == null) {
    String path=fileName;
    if (File.separatorChar != '/') {
      path=path.replace('/',File.separatorChar);
    }
    permission=new FilePermission(ruta,"read");
  }
  return permission;
