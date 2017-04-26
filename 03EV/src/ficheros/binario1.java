package ficheros;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class binario1 {
	

	
	
	
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		FileOutputStream fos= null;
		DataOutputStream salida= null;
		int n;
		
		try {
			fos = new FileOutputStream("D:\\prog.txt");
			salida= new DataOutputStream(fos);
			
			System.out.println("introduce numero entero, -1 para acabar: ");
			n= sc.nextInt();
			while (n != -1){
				salida.writeInt(n); //se escribe el numero entero en el fichero
				System.out.println("introduce numero entero, -1 para acabar: ");
				n= sc.nextInt();
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
				
		} 
		finally {
			try{
				if (fos !=null) {
					fos.close();
					
				}
				if (salida !=null) {
					salida.close();
				}
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
}



