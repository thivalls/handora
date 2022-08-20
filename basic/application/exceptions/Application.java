package application.exceptions;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean paraSistema = false;

        while (! paraSistema) {

            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - consultar | 2 - adicionar novo contato | 0 - Sair");

            int resultMenu = scan.nextInt();

            if (resultMenu == 1) {
                System.out.println("Digite o id a ser consultado");
                int idConsultar = scan.nextInt();

                Agenda agenda = new Agenda();

                try {
                    Contato contatoConsultado = agenda.consultar(idConsultar);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (resultMenu == 2) {
                System.out.println("Digite o nome");
                String name = scan.next();
                System.out.println("Digite o telefone");
                String telefone  = scan.next();

                Contato novoContato = new Contato(name, telefone);
                Agenda agenda = new Agenda();
                agenda.addContact(novoContato);
                System.out.println("Contato cadastrado com sucesso");
                System.out.println(novoContato);
            } else {
                paraSistema = true;
            }
        }

    }
}
