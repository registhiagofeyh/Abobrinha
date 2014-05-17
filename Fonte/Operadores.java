class Operadores{
	private String pre=new String(),op1=new String(),op2=new String();
	private char operando;
	private int res, ope1, ope2,a;
	
	
	public String define(String xy,Inteiro I){
		pre="";
		pre+=xy.charAt(0);
		a=1;
		while(xy.charAt(a-1)!=':'){
			pre+=xy.charAt(a);
			a++;
		}
		op1="";
		while(xy.charAt(a)!='+'&&xy.charAt(a)!='-'&&xy.charAt(a)!='*'&&xy.charAt(a)!='/'&&xy.charAt(a)!='%'){
			op1+= xy.charAt(a);
			a++;
		}
		operando=xy.charAt(a);
		op1=I.trocaVar(op1);
		a+=2;
		op2="";
		while(xy.charAt(a)!=','){
			op2+= xy.charAt(a);
			a++;
		}
		op2=I.trocaVar(op2);
		ope1=Integer.parseInt(op1);
		ope2=Integer.parseInt(op2);
		if(operando=='+'){
			res=this.adicao(ope1,ope2);
		}
		if(operando=='-'){
			res=this.subtracao(ope1,ope2);
		}
		if(operando=='*'){
			res=this.multiplicacao(ope1,ope2);
		}
		if(operando=='/'){
			res=this.divisao(ope1,ope2);
		}
		if(operando=='%'){
			res=this.resto(ope1,ope2);
		}
		return pre+res+",";
	}
	public int adicao(int a,int b){
	return(a+b);
	}
	public int subtracao(int a,int b){
	return(a-b);
	}
	public int multiplicacao(int a,int b){
	return(a*b);
	}
	public int divisao(int a,int b){
	return(a/b);
	}
	public int resto(int a,int b){
	return(a%b);
	}
}
