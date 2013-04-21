import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TestaEntrada {

	public static void main(String[] args) {
		String arquivo = "arquivo.txt";
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));
			
			try {
				String linha = br.readLine();
				
				while (linha != null){
					System.out.println(linha);
					linha = br.readLine();
				}
				
			} catch (IOException e) {
				System.out.println("Erro de I/O");
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("o arquivo n‹o foi encontrado!");
		} 
		
	}

}
