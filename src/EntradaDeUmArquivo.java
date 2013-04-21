import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class EntradaDeUmArquivo {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = System.in; // new FileInputStream("arquivo.txt");
			
			Scanner entrada = new Scanner(is);
			
			while (entrada.hasNextLine()){
				System.out.println(entrada.nextLine());
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

