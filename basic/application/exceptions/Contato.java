package application.exceptions;

public class Contato {
    static Integer count = 0;
    int id;
    String name;
    String telefone;

    public Contato(String name, String telefone) {
        countIncrement();
        this.id = count;
        this.name = name;
        this.telefone = telefone;
    }

    public static void countIncrement() {
        count++;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
