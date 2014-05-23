class Compara{
	private int a,b,c;
	private char c1,c2;
	private String s1 = new String(), s2 = new String();

	public int compara(String xy, Inteiro I){
		a=0;
		s1="";
		while(xy.charAt(a)!='='&&xy.charAt(a)!='<'&&xy.charAt(a)!='>'){
			s1+= xy.charAt(a);
			a++;
		}
		c1=xy.charAt(a);
		a++;
		c2=xy.charAt(a);
		s1=I.trocaVar(s1);
		a++;
		s2="";
		while(xy.charAt(a)!=','){
			s2+= xy.charAt(a);
			a++;
		}
		s2=I.trocaVar(s2);
		b=Integer.parseInt(s1);
		c=Integer.parseInt(s2);
		if(c1=='<'&&c2=='<'){
			if(b<c)
			return 1;
			return 0;	
		}
		else if(c1=='<'&&c2=='='){
			if(b<=c)
			return 1;	
			return 0;
		}
		else if(c1=='>'&&c2=='>'){
			if(b>c)
			return 1;
			return 0;	
		}
		else if(c1=='>'&&c2=='='){
			if(b>=c)
			return 1;
			return 0;	
		}
		else if(c1=='='&&c2=='='){
			if(b==c)
			return 1;
			return 0;	
		}
	return 3;
	}
}
