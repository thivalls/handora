package application.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public void addContact(Contato contato) {
        contatos.add(contato);
    }

    public Contato consultar(int id) throws ContatoNaoExisteException {

        if(contatos.isEmpty()) {
            throw new ContatoNaoExisteException("Nenhum contato foi adicionado ainda");
        }

        Contato contato = contatos.get(id);
        if(contato != null) {
            System.out.println(contato);
        } else {
            throw new ContatoNaoExisteException("minha mensagem customizada");
        }
        return contatos.get(id);
    }
}
