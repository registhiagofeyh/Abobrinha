//Trabalho de Programacao 1 feito por Andre Luiz Maso e Myke Wyllian Dal Agnol
// e-mail: andre.luiz_1985@hotmail.com & mykewd@gmail.com
// link no github https://github.com/myke1993/Abobrinha.git

import java.util.Scanner;
import java.io.File;

class Abobrinha {
    public static void main(String args[]) {
        File f;
        Scanner s;
        Interpretador b;
        String linhas[] = new String[2000]; 
        
        try {
            f = new File(args[0]);
            s = new Scanner(f);
            b = new Interpretador();
            
            int i = 0;
            while(s.hasNext()) {
                linhas[i] = s.nextLine();
                i++;
            }
            linhas[i] = ",";
            
            b.interpreta(linhas);
            
        } catch (Exception e) {
            System.out.println("Nao consegui ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
            System.out.println("Uso:");
            System.out.println("    java Blah /caminho/para/arquivo.blah");
        }
        
    }
}
