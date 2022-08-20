package application.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    public void addContact(Contato contato) throws AgendaCheiaException {
        if (contatos.size() <= 4) {
            contatos.add(contato);
            System.out.println(contatos.size());
        } else {
            throw new AgendaCheiaException("Agenda cheia");
        }
    }

    public Contato consultar(int id) throws ContatoNaoExisteException {

        try {
            Contato contato = contatos.get(id);
            return contato;
        } catch (Exception e) {
            throw new ContatoNaoExisteException("Este contato não existe");
        }

    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}
