class Laço extends Compara{
	private int w;
	
	public int testa(Inteiro I, String xy){
		xy = xy.replace(" ", "");
		xy = xy.replace("laço","");
		return this.compara(xy, I);
	}
}
