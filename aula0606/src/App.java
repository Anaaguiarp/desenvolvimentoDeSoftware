import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa p = new Pessoa("Juliana", "03030303030", "323232323232352");
		pessoas.add(p);
		p = new Pessoa("Katia", "03030303030", "323232323232352");
		pessoas.add(p);
		p = new Pessoa("Juliana", "03030303030", "323232323232352");
		pessoas.add(p);
		
		System.out.println("Lista sem ordenação: "+ pessoas);
		Collections.sort(pessoas);
		System.out.println("Lista com ordenação: "+ pessoas);
		
		Pessoa p2 =  new Pessoa("José", "35145465416358", "35146354654");
		System.out.println("Busca binária pelo último obj add: "+ Collections.binarySearch(pessoas, p));
		System.out.println("Busca binária obj não add: "+ Collections.binarySearch(pessoas, p2));
		
		List<Pessoa> pessoas2 = new ArrayList<>();
		Pessoa p1 = new Pessoa("Maria das Neves", "6546541321", "54154654654");
		pessoas2.add(p1);
		p1 = new Pessoa("Adriano Silva", "6546541321", "54154654654");
		pessoas2.add(p1);
		p1 = new Pessoa("Eliane Moraes", "6546541321", "54154654654");
		pessoas2.add(p1);
		System.out.println("Os arrayList não possuem números em comum? "+ Collections.disjoint(pessoas, pessoas2));
		p1 = new Pessoa("Eliane Moraes", "654654", "54154654654");
		p1.setNome("Teste 2");
		pessoas.add(p1);
		System.out.println("Quantas vezes Eliane Moraes aparece em pessoas2? "+ Collections.frequency(pessoas2, p1));
		System.out.println("Menor valor: "+ Collections.min(pessoas2) + " / Maior valor: "+ Collections.max(pessoas2));
		
		Collections.reverse(pessoas2);
		System.out.println("pessoas2 Invertido" + pessoas);
		
		
		System.out.println("==========================================================================");
		
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(10);
		inteiros.add(50);
		inteiros.add(41);
		inteiros.add(0);
		inteiros.add(-1);
		
		System.out.println("Lista sem ordenação: "+ inteiros);
		Collections.sort(inteiros);
		System.out.println("Lista após a ordenação: "+ inteiros);
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Claudemir Junior");
		nomes.add("Ana Carolina");
		nomes.add("Eduardo Pelloso");
		System.out.println("Lista sem ordenação: "+nomes);
		Collections.sort(nomes);
		System.out.println("Lista após a ordenação: "+nomes);
		
		System.out.println("Busca binária 10: "+ Collections.binarySearch(inteiros, 10));
		System.out.println("Busca binária 20: "+ Collections.binarySearch(inteiros, 20));
		// só encontra strings exatas: teste com Ana Carolina - retorna index 0
		System.out.println("Busca binária 'Ana': "+ Collections.binarySearch(nomes, "Ana"));
		
		List<Integer> inteiros2 = new ArrayList<>();
		inteiros2.add(30);
		inteiros2.add(52);
		inteiros2.add(20);
		inteiros2.add(-10);
		inteiros2.add(100);
		
		//disjoint = "são diferentes?"
		System.out.println("Os arrayList possuem números em comum? " + Collections.disjoint(inteiros, inteiros2));
		inteiros2.add(100);
		System.out.println("Quantas vezes 100 aparece em inteiros2? "+ Collections.frequency(inteiros2, 100));
		System.out.println("Menor valor: "+ Collections.min(inteiros2) + " / Maior valor: "+ Collections.max(inteiros2));
		Collections.reverse(inteiros2);
		System.out.println("Inteiros2 invertido: " + inteiros2);
		

	}
}