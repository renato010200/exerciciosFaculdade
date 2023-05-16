package Principal;

import ExercicioAula.ContaCorrente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Renato Santos", " 123.456.789-10", "1234");

        System.out.println(conta1.toString());

        conta1.depositar(500.0);
        conta1.sacar(100.0);
        conta1.transferir("123", 321321, 350.0);
        conta1.transferirPix("fulano@email.com", 100.0);

        ArrayList<String> extrato = conta1.getExtrato();
        for (String lancamento : extrato) {
            System.out.println(lancamento);
        }

    }
}