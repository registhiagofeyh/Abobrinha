
class Interpretador {
    private String linhas[];
	private char vetor[];
	private int r;
	private Inteiro I = new Inteiro();
	private Operadores O = new Operadores();
    
    public void interpreta(String l[]) {
        this.linhas = l;
        
        for(int i = 0; i < this.linhas.length; i++) {
            if(this.linhas[i] != null) {
            	if(linhas[i].contains("mostre-me")){
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
           //     System.out.println(this.linhas[i]); // usado pra ver se está lendo as linhas que entram no programa;
				
            }
        }
		//System.out.println(r);
    }
}
