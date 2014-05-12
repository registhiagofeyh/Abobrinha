class Inteiro{
	private int indice[] = new int[1000];
	private int valor[] = new int[1000];
	private String nome[] = new String[1000];
	private String inter;
	private int m,a,b;


	public void instancia(String xy){
		xy = xy.replace(" ", "");	
		b=3;
		do{
			m=this.acrescentaindice();
			a=b;
			nome[m]="";
			while(xy.charAt(a)!='.'&&xy.charAt(a)!=','&&xy.charAt(a)!=':'){
				nome[m]+=xy.charAt(a);
				a++;
			}
			if(xy.charAt(a)==':'){
				a++;
				inter="";
				while(xy.charAt(a)!='.'&&xy.charAt(a)!=','){
					inter+=xy.charAt(a);
						a++;
				}
				this.setValor(inter,m);
			}
			if(xy.charAt(a)==','){
				break;
			}
		}while(xy.charAt(a)=='.');		
	}
	public void setValor(String numero,int id){
		valor[id]=Integer.parseInt(numero);
	}
	public int getValor(int id){
		return this.valor[id];
	}
	public int getIndice(String h){
		for(a=0;a<1000;a++){
			if(h.equals(nome[a]));
			break;
		}
		return this.indice[a+1];
	}
	private int acrescentaindice(){
		for(a=0;a<1000;a++){
			if(indice[a]==0){
				this.indice[a]=a+1;
				break;
			}
		}
		return this.indice[a];
	}
}
