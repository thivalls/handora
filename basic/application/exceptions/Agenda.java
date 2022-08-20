package application.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();
    public int limit;

    public Agenda (int limit) {
        this.limit = limit;
    }

    public void addContact(Contato contato) throws AgendaCheiaException {
        if (contatos.size() < limit) {
            contatos.add(contato);
        } else {
            throw new AgendaCheiaException("Agenda já está cheia!");
        }
    }

    public Contato consultar(String name) throws ContatoNaoExisteException {
        Contato contato = contatos.stream()
                .filter(x -> x.name.equals(name))
                .findAny()
                .orElse(null);
        if (contato == null) {
            throw new ContatoNaoExisteException("Este contato não existe");
        }
        return contato;
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato : contatos) {
            s += contato.toString() + "\n";
        }
        return s;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
