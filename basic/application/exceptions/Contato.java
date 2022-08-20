package application.exceptions;

public class Contato {
    static Integer count = 0;
    int id;
    String name;
    String telefone;

    public Contato(String name, String telefone) {
        this.id = count++;
        this.name = name;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telefone='" + telefone + '\'' +
                ']';
    }
}
