package br.com.generation.herança.ex;

public class testaAnimal {

	public static void main(String[] args) {
		
		cachorro c = new cachorro();
		cavalo cav = new cavalo();
		preguiça p = new preguiça();
		
		c.setNome("Marley");
		c.setBarulho("latindo");
		
		cav.setNome("Pierre");
		cav.setBarulho("relincho");
		
		p.setNome("Nani");
		p.setBarulho("resmungando");
		
		
		System.out.println("\n" + c.getNome() + " é um cachorro muito sapeca");
		c.latir();
		c.brincar();
		
		System.out.println("\n" + cav.getNome() + " é um corsel negro");
		cav.cavalgar();
		cav.relinchar();
		
		System.out.println("\n" + p.getNome() + " é uma preguiça de zoologico");
		p.dormir();
		p.resmungo();
		
		
		
		
		

	}

}
