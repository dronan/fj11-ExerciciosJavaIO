import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.util.Scanner;



public class TestaSaida {

	public static void main(String[] args) throws IOException {
			
			OutputStream os = new FileOutputStream("arquivoSaida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			Scanner entrada = new Scanner(System.in);
			
			//System.out.println(entrada.hasNextLine());
			
			String linha = entrada.nextLine();
			
			while (!linha.isEmpty()){
				
				bw.write(linha);
				bw.newLine();
				linha = entrada.nextLine();
				
			}
			
			bw.close();

	}
}
