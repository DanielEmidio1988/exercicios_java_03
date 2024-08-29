import br.com.danielemidio.pessoa.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Daniel");
        pessoa1.setIdade(36);
        pessoa2.setNome("Cristiano");
        pessoa2.setIdade(34);
        pessoa3.setNome("Carlos");
        pessoa3.setIdade(28);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista " + listaDePessoas.size());
        System.out.println("Primeira Pessoa da Lista " + listaDePessoas.get(0));
        System.out.println("Lista completa " + listaDePessoas.toString());

    }
}