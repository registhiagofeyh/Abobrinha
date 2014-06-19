import java.util.Arrays;

class Inteiro{
	private int indice[] = new int[1000];
	private int valor[] = new int[1000];
	private String nome[] = new String[1000];
	private String inter=new String(),numero=new String();
	private int m,a,b,c;
	private Operadores O = new Operadores();


	public void instancia(String xy){
		xy = xy.replace(" ", "");	
		m=this.acrescentaindice();
		a=3;
		nome[m]="";
		while(xy.charAt(a)!=','){
			nome[m]+=xy.charAt(a);
			a++;				
		}
	}

	public void instanciaStruct(String linha){
		String[] arr;
		String first,parts;
		arr = linha.split("\\{");
		first=arr[0];
		arr[1] = arr[1].trim().substring(0,arr[1].trim().length()-2);
		parts = arr[1];
		arr = parts.split(",");
		for(int i=0;i<arr.length;i++){
			if(arr[i].trim().length()>0)
				this.instancia(first+"."+arr[i].trim()+",");
		}
	}

	public void setValor(String xy){
		a=0;
		xy = xy.replace(" ", "");
		inter="";	
		while(xy.charAt(a)!=':'){
			inter+=xy.charAt(a);
			a++;
		}
		a++;
		numero="";
		while(xy.charAt(a)!=','){
			numero+=xy.charAt(a);
			a++;
		}
		valor[this.getIndice(inter)]=Integer.parseInt(numero);
	//	System.out.println(inter+" " + getIndice(inter)+" "+numero); //usado pra testar o indice e a atribuicao do valor;
	}
	public int getValor(int id){
		return this.valor[id];
	}
	public int getIndice(String h){
		for(a=1;a<1000;a++){
			if(h.equals(nome[a])){
			break;
			}
		}
		return this.a;
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
	public int qtIndice(){
		for(a=0;this.indice[a]!=0;a++);
		return a;
	}
	public void imprima(String xy){
		xy = xy.replace("mostre-me ", "");
		xy=this.trocaVar(xy);
		System.out.println(xy.trim());
	}
	public String trocaVar(String xy){
		c=1;
		b=this.qtIndice();
		while(c<=b){
			inter=""+valor[c];
			xy = xy.replace(nome[c], inter);
			c++;
		}
		return xy;
	}
	public void opera(String xy){
	xy=xy.replace(" ","");
	xy=O.define(xy,this);
	this.setValor(xy);
	}
}
