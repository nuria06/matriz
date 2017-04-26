package ficheros;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class TiempoDiaSemana {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        FileOutputStream fos = null;
	        DataOutputStream salida = null;
	        int t;
	        int d;
	    

	        try {
	            fos = new FileOutputStream("H:\\tempdia.txt");
	            salida = new DataOutputStream(fos);

	            System.out.print("Introduce temperatura. ");// -1 para acabar:
	            t = sc.nextInt();
	            while (t != -1) {
	                salida.writeInt(t); //se escribe el número entero en el fichero
	                t = sc.nextInt();
	                
	           System.out.print("Introduce dia de la semana. : ");//-2 para acabar
		       d = sc.nextInt();
		       while (d != -2) {
		           salida.writeInt(d); //se escribe el número entero en el fichero
		           d = sc.nextInt();
		           
		            }  
	            }
	        

	        
	        }
	         catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (fos != null) {
	                    fos.close();
	                }
	                if (salida != null) {
	                    salida.close();
	                }
	            } catch (IOException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    
	}
}


	
	
