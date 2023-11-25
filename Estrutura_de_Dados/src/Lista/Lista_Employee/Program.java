package Lista.Lista_Employee;

import java.util.ArrayList;
import java.util.List;
//import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US); // separar os pontinhos
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println(); // vazio pra pular linha
			System.out.println("Emploee #"+(i+1)+ ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again");
				id = sc.nextInt();
			}
			
						
			System.out.println("Name: ");
			sc.nextLine(); // quebra linha
			String name = sc.nextLine();
			System.out.println("Salary :");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();	
		
		// procurando na lista se existe ou retirna nulo
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idsalary);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for( Employee e: list) {
			System.out.println(e);
		}
		
		
		sc.close();

	}
	// criando uma funcao pra verificar se ja existe um id criado
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp!=null;
	}
	
	// criar uma funcao pra procurar um elemento na lista que será capaz de me dizer qual é a posição do meu id na lista
	public static Integer position(List<Employee> list, int id) {  // funcao tem que ser a mesma do void main...no caso static
		for (int i = 0; i <	 list.size(); i++) {
			if (list.get(i).getId() == id ) {
				return i;
			}
		}
		return null;
		//return -1; // significa que não encontrou o elemento
	}

}

