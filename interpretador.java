import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.io.File;
import java.util.Scanner;


class abobrinha{

	public static void main(String args[]){
		try{
			int a=0. b=0, c=0;
				
			
			File file=new File(args[0]);
			FileReader fileR = new FileReader(file);
			BufferedReader buffer= new BufferedReader(fileR);
			StringBuffer stringB= new StringBuffer();				//esse codigo le o arquivo que vai ser interpretado
			String linha = new String();                            // o arquivo tem que estar na mesma pasta dessa classe  
																	//e o arquivo pode ser salvo com qualquer nome e 
																	//qualquer extensao
																	//Ex: teste.txt
																	//pra compilar isso faz : javac *.java
										                		    //    java interpretador teste.txt 	
			while((linha=buffer.readLine())!=null){
				stringB.append(linha);
				stringB.append("\n");
				b++;
			}
		
			String [] linhas=new String[b];
			file = new File(args[0]);
			fileR = new FileReader(file);
			buffer = new BufferedReader(fileR);
			stringB = new StringBuffer();
		
			while((linha=buffer.readLine())!=null){
				if(linha.length()==0){
					b--;
					continue;
				}
				stringB.append(linhas[a]);
				stringB.append("\n");
				linhas[a]=linha;
				a++;
			}
			for(a=0;a<b;a++){//Apaga espaços da linha para depois interpretar. 
				linhas[a] = linhas[a].trim(); 
				if(linhas[a].contains("imprime")==false){				
					linhas[a] = linhas[a].replace(" ", "");
				}				 
			}	

			
			System.out.println("\n\n\n");
			
					
						
	
			for(a=0;a<b;a++){//Aqui dentro desse for tudo vai ser interpretado por exemplo abaixo;
				if((linhas[a].contains("soma")==true)){
					soma();
				}
				if((linhas[a].contains("subtracao")==true)){
					subtracao();
				}
				if((linhas[a].contains("multiplica")==true)){
					multiplica();
				if((linhas[a].contains("divide")==true)){
					divide();
				}

			}




