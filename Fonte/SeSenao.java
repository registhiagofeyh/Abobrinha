class SeSenao extends Compara{

	
	public int seSenao(String xy, Inteiro I){
		xy = xy.replace(" ", "");
		xy = xy.replace("se","");
		return this.compara(xy, I);
	}
}
