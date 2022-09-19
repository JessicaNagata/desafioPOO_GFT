package exercicio04_05_06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int maiorIdade = 0;
        String nome = null;
        int contador = 0;
        int idadeProcurada = 0;

        Pessoa pessoa1 = new Pessoa("João", 15);
        Pessoa pessoa2 = new Pessoa("Leandro", 21);
        Pessoa pessoa3 = new Pessoa("Paulo", 17);
        Pessoa pessoa4 = new Pessoa("Jessica", 18);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        System.out.println("\n\n----------------------------------EXERCÍCIO 04----------------------------------------------");

        for (Pessoa item : pessoas) {
            if (item.getIdade() > maiorIdade) {
                maiorIdade = item.getIdade();
                nome = item.getNome();
            }
        }
        System.out.println(nome);

        System.out.println("\n\n----------------------------------EXERCÍCIO 05----------------------------------------------");

        for (int i = 0; i < pessoas.size(); i++) {

            if (pessoas.get(i).getIdade() < 18) {
                pessoas.remove(pessoas.get(i));
                contador++;
            }
        }

        System.out.println("Quantidade de pessoas na lista inicial: " + (pessoas.size() + contador) + "\nQuantidade de pessoas após exclusões: " + pessoas.size());

        System.out.println("\n\n----------------------------------EXERCÍCIO 06----------------------------------------------");

        for (Pessoa item : pessoas) {
            if ("Jessica".equals(item.getNome())) {
                idadeProcurada = item.getIdade();
            }
        }
        if(idadeProcurada != 0){
            System.out.println("Idade: " + idadeProcurada + " anos.");
            }else{
                System.out.println("Não conta na lista.");
            }
    }
}
