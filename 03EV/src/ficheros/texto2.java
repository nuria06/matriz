package ficheros;
import java.util.Scanner;
import java.io.*;

public class texto2 {
	private static int leerpreguntas(String[] l){
		
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("Cuantas preguntas vas a leer");
		num=sc.nextInt();
		for (int i=0; i<num; i++){
		System.out.println("Pregunta "+ (i+1));
		l[i]=sc.next();
			
		}
		return num;
		}
	
	public static void hacer preguntas(int n, String[] l){
		Scanner sc= new Scanner(System.in);
		String resp="";
		try
		{
			FileWriter bw= new FileWriter( "d:\\salida.txt");
			for (int i=0; i<n;i++)
			{
				System.out.println(l[i]);
				resp=sc.nextLine();
				bw.write("P"+ ( i+1) + ":" +l[i]+"\n");
				bw.write("R"+ ( i+1) + ":" + resp+"\n");
				bw.flush();
				
			}
			bw.close();
		}
		catch (IOException ioe) {
			System.out.println("Error IO: "+ ioe.toString());
			
		}
	}

	private static void escribirfichero() {
		
		try
		{
			FileReader br=new FileReader( "d:\\salida.txt");
			int a = br.read();
			while (a!=-1){
				System.out.println((char)a);
				a=br.read();
				
			}
			br.close();
		}
		catch
		(IOException ioe)
		{
			System.out.println("Error IO: " +ioe .toString());
			
			
			
		}
	}

/*public static void main (String[] args) {
	Scanner sc= new Scanner(System.in);
	FileOutputStream fos= null;
	DataOutputStream salida= null;
	int n;
	
	try {
		fos = new FileOutputStream("e://datos.dat");
		salida= new DataOutputStream(fos);
		
		System.out.println("introduce numero entero, -1 para acabar: ");
		n= sc.nextInt();
		while (n != -1){
			salida.writeInt(n);; //se escribe el numero entero en el fichero
			System.out.println("introduce numero entero, -1 para acabar: ");
			n= sc.nextInt()
		}
	}*/
}

