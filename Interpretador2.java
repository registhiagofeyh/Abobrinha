/**
 * Exemplo de interpretador.
 *
 * Esse código é um exemplo de interpretador para a linguagem 'Blah'. Esse programa
 * não faz qualquer interpretação, ele apenas lê o conteúdo de um arquivo que foi
 * passado pela linha de comando.
 *
 * Por Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */

class Interpretador {
    private String linhas[];
	private char vetor[];
	private int r;
	private Inteiro I = new Inteiro();
    
    public void interpreta(String l[]) {
        this.linhas = l;
        
        for(int i = 0; i < this.linhas.length; i++) {
            if(this.linhas[i] != null) {
				if(linhas[i].contains("iii")){
					I.instancia(linhas[i]);
                	}
                System.out.println(this.linhas[i]);
				
            }
        }
		//System.out.println(r);
    }
}
