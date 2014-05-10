public void calculaSoma(String linhas[], int a){
		int auxiliar=0, auxiliar1=0, r1, r, i, t, s, k;
		double cont=0, cont1=0;
		String aux,aux3,aux4; 		
		
		t=linhas[a].indexOf("=");
		aux=linhas[a].substring(0,t);
		s=linhas[a].indexOf(";");
		k=linhas[a].indexOf("+");
														
		aux3=linhas[a].substring(t+1,k);
		aux4=linhas[a].substring(k+1,s);					
}
