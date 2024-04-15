package View;

import Controller.TelefoneController;
import br.edu.fateczl.fila.Fila;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Fila<String> fila = new Fila<String>();
        TelefoneController TC = new TelefoneController();
        Scanner scan = new Scanner(System.in);

        int opc = 0;

        while(opc != 9) {
            System.out.print("1 - Inserir número de telefone \n 2 - Consultar ligação \n 3 - Consultar todas as últiams ligações \n 9 - Encerrar \n Escolha uma opção: ");
            opc = scan.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("Insira o número: ");
                    TC.insereLigacao(fila, scan.next());
                    break;
                case 2: TC.consultaLigacoes(fila);
                    break;
                case 3:TC.consultaTodasLigacoes(fila);
                break;
                case 9:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

            }
        }
    }
}
