package application.exceptions;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ContatoNaoExisteException {
        Scanner scan = new Scanner(System.in);

        boolean paraSistema = false;

        Agenda agenda = new Agenda(2);

        while (!paraSistema) {

            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - consultar | 2 - adicionar novo contato | 3 - aumentar limite da agenda | 0 - Sair");

            int resultMenu = scan.nextInt();

            if (resultMenu == 1) {
                System.out.println("Digite o id a ser consultado");
                String nameConsultar = scan.next();

                try {
                    Contato contatoConsultado = agenda.consultar(nameConsultar);
                    System.out.println(contatoConsultado);
                } catch (ContatoNaoExisteException e) {
                    System.out.println(e.getMessage());
                }

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
                    System.out.println(e.getMessage());
                }
            } else if (resultMenu == 3) {
                System.out.println("O seu limite atual é " + agenda.getLimit());
                System.out.println("Digite o novo limite");
                int newLimit = scan.nextInt();
                if(agenda.contatos.size() > 0 && newLimit < agenda.getLimit()) {
                    System.out.println("Você não pode setar um valor menor do que o atual");
                } else {
                    agenda.setLimit(newLimit);
                    System.out.println("Limite alterado com sucesso!!!");
                }
            } else {
                paraSistema = true;
            }
        }

    }
}
