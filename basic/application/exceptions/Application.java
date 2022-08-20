package application.exceptions;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ContatoNaoExisteException {
        Scanner scan = new Scanner(System.in);

        boolean paraSistema = false;

        Agenda agenda = new Agenda();

        while (!paraSistema) {

            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - consultar | 2 - adicionar novo contato | 0 - Sair");

            int resultMenu = scan.nextInt();

            if (resultMenu == 1) {
                System.out.println("Digite o id a ser consultado");
                int idConsultar = scan.nextInt();

                Contato contatoConsultado = agenda.consultar(idConsultar);
                System.out.println(contatoConsultado);

            } else if (resultMenu == 2) {
                System.out.println("Digite o nome");
                String name = scan.next();
                System.out.println("Digite o telefone");
                String telefone = scan.next();

                try {
                Contato novoContato = new Contato(name, telefone);
                agenda.addContact(novoContato);
                System.out.println("Contato cadastrado com sucesso");
                } catch (Exception e) {
                    System.out.println("Houve um erro!");
                    System.out.println(e.getMessage());
                }
            } else {
                paraSistema = true;
            }
        }

    }
}
