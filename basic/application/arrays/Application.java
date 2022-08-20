package application.arrays;

import java.util.Arrays;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
//        double tempDiaria001 = 31.3;
//        double tempDiaria002 = 31.3;
//        double tempDiaria003 = 31.3;
//        double tempDiaria004 = 31.3;

        double[] listaTemperaturaDiaria = new double[365];
        listaTemperaturaDiaria[0] = 32;
        listaTemperaturaDiaria[1] = 33;
        listaTemperaturaDiaria[2] = 34;
        listaTemperaturaDiaria[3] = 29;

        System.out.println("o array armazena " + listaTemperaturaDiaria.length + " posições");

//        for(int i = 0; i < listaTemperaturaDiaria.length; i++) {
//            System.out.println("Temperatura no dia " + (i + 1) + " é " + listaTemperaturaDiaria[i]);
//        }

        int loop = 1;
        for(double temp : listaTemperaturaDiaria) {
            System.out.println("Temperatura no dia " + loop + " é " + temp);
            loop++;
        }

//        Arrays.stream(listaTemperaturaDiaria).forEach(x -> {
//                 System.out.println("Temperatura " + x);
//                });
    }
}
