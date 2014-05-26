class Laco extends Compara{
	private int w;
	
	public int testa(Inteiro I, String xy){
		xy = xy.replace(" ", "");
		xy = xy.replace("laco","");
		return this.compara(xy, I);
	}
}
