package ma.priz.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Exercice5 {
	
	public static void main(String[] args) {
		trier();
	}
	
	private static void trier() {
		Collection<IPersonne> persons = new ArrayList<>();
		initialize(persons);
		persons = filterCollection(persons);
		System.err.println(persons);
	}
	
	private static Collection<IPersonne> filterCollection(Collection<IPersonne> persons) {
		Comparator<IPersonne> comparator = Comparator.comparing(IPersonne::getName);
		return persons.stream().filter(p -> p.getAge()>18)
		.sorted(comparator).collect(Collectors.toList());
	 
	}
	
	private static void initialize(Collection<IPersonne> persons) {
		
		
		persons.add(aPerson(20,"Ludovic paul"));
		persons.add(aPerson(17,"Paul Grey"));
		persons.add(aPerson(26,"Lukasz Podolski"));

		
	}
	
	private static IPersonne aPerson(int age, String name) {
		IPersonne p = new Personne();
		p.setName(name);
		p.setAge(age);
		
		return p;
	}
}


class Personne implements IPersonne{
	private int age;
	private String name;
	
	@Override
	public int getAge() {
		return age;
	}
	@Override
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}


interface IPersonne{
	int getAge();
	String getName(); 
	void setAge(int age);
	void setName(String name);
}