package br.uern.di.pa.abb.lucas.joao;

public class Main {
	
	public static void main(String[] args) {
	Passaro p1= new Papagaio(100);
	Passaro p2= new Currupio(200);
	
	p1.cantar();
	System.out.println(p1.voar(150));
	
	p2.cantar();
	System.out.println(p2.voar(50));
	
	}
}
