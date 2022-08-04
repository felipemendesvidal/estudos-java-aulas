package crud01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class atividade_prs01 {

	public static void main(String[] args) throws IOException {
		
		
		// entrada de dados do usuario
		Scanner scanner = new Scanner (System.in);
		//criar arquivo
		FileWriter arquivo = new FileWriter("teste.txt");
		PrintWriter writer = new PrintWriter(arquivo);
		arquivo.close();
		System.out.println("arquivo criado com sucesso nome teste.txt");
			
		
		System.out.println("informe o nome do arquivo:\n");
		String caminhodoArquivo = scanner.nextLine();
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			//codigo que vai ser tentado
			is = new FileInputStream(caminhodoArquivo);
			os = new FileOutputStream("copia de" + caminhodoArquivo);
			byte[] buffer = new byte[1024];
			
			int lengh;
			
			while((lengh = is.read(buffer)) > 0) {
				os.write(buffer, 0, lengh);
			}
			System.out.println("arquivo copiado com sucesso nome teste.txt");
			System.out.println("fim do programa");
		}catch(Exception e) {
			//mensagem de erro
			System.out.printf("erro ao abrir o arquivo: %s.\n", e.getMessage());
			
		} finally {
				
				is.close();
				os.close();
			
		}
				
		
		

	}

}
