import java.util.Scanner;
class Interpretador {
    private String linhas[];
	private char vetor[];
	private int r = 1,f=1,j=1,x,a;
	private Inteiro I = new Inteiro();
	private Operadores O = new Operadores();
	private Scanner S = new Scanner(System.in);
	private SeSenao C = new SeSenao();
	private Laco L = new Laco();
    
    public void interpreta(String l[]) {
        this.linhas = l;
        
        for(int i = 0; i < this.linhas.length; i++) {
            if(this.linhas[i] != null) {
            	if(linhas[i].contains("laco")){
            			j=L.testa(I,linhas[i]);
            			if(j==0){
            				for(a=i;!(linhas[a].contains("fimdolac"));a++){
            				}
            				i=a+1;
            			}
            			else{
            				x=i;
            			}
            		}
            	else if(linhas[i]. contains("fimdolac")){
            		i=x-1;
            	}
            	if(linhas[i].contains("fimdose")){
            		r=1;
            		i++;
            		f=1;
            	}
            	else if(linhas[i].contains("senao")&&f==0){
            		r=0;
            		i++;
            	}
            	else if(linhas[i].contains("senao")){
            		r=1;
            		i++;
            	}
            	if(r==1){
            		if(linhas[i].contains("leia")){
            			linhas[i]="";
						linhas[i]=S.nextLine();
					}
	            	 if(linhas[i].contains("se")){
						r=C.seSenao(linhas[i],I);
						if(r==1){
							f=0;
						}
					}
	            	else if(linhas[i].contains("mostre-me")){
						I.imprima(linhas[i]);
					}
					else if(linhas[i].contains("iii")){
						I.instancia(linhas[i]);
	                	}
	                else if(linhas[i].contains("%%")||linhas[i].contains("--")||linhas[i].contains("//")||linhas[i].contains("**")||linhas[i].contains("++")){
	                	I.opera(linhas[i]);
	                }
					else if(linhas[i].contains(":")){
						I.setValor(linhas[i]);
					}
	         //       System.out.println(this.linhas[i]); // usado pra ver se está lendo as linhas que entram no programa;
				}
            }
        }
    }
}
