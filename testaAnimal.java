package br.com.generation.heran�a.ex;

public class testaAnimal {

	public static void main(String[] args) {
		
		cachorro c = new cachorro();
		cavalo cav = new cavalo();
		pregui�a p = new pregui�a();
		
		c.setNome("Marley");
		c.setBarulho("latindo");
		
		cav.setNome("Pierre");
		cav.setBarulho("relincho");
		
		p.setNome("Nani");
		p.setBarulho("resmungando");
		
		
		System.out.println("\n" + c.getNome() + " � um cachorro muito sapeca");
		c.latir();
		c.brincar();
		
		System.out.println("\n" + cav.getNome() + " � um corsel negro");
		cav.cavalgar();
		cav.relinchar();
		
		System.out.println("\n" + p.getNome() + " � uma pregui�a de zoologico");
		p.dormir();
		p.resmungo();
		
		
		
		
		

	}

}
