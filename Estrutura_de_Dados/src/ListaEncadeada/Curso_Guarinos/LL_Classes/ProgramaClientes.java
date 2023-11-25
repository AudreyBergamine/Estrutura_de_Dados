package ListaEncadeada.Curso_Guarinos.LL_Classes;

import ListaEncadeada.Curso_Guarinos.LL_Generics;

public class ProgramaClientes {

	public static void main(String[] args) {
		LL_Generics<Cliente> clientes = new LL_Generics<Cliente>();

		// Modelo de novo cliente:      clientes.adicionar( new Cliente("   ", "   "));
		clientes.adicionar( new Cliente("123", "Jao"));
		clientes.adicionar( new Cliente("124", "Juca"));
		clientes.adicionar( new Cliente("125", "Ze"));


		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println(clientes.get(i).getValor());
		}

		System.out.println("Tamanho: " + clientes.getTamanho());





	}
}
