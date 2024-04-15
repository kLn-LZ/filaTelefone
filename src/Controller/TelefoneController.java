package Controller;

import br.edu.fateczl.fila.Fila;
import java.lang.String;

public class TelefoneController {

    public TelefoneController() {
        super();
    }

    public void insereLigacao(Fila f, String numeroTelefone) {

        f.insert(numeroTelefone);

        System.out.println("Número: " + numeroTelefone + " Adicionado com sucesso.");

    }

    public void consultaLigacoes(Fila f) throws Exception{
        String numeroTelefone;

        try {

                numeroTelefone = String.valueOf(f.remove());
                System.out.println(numeroTelefone);

        } catch (Exception e) {
            throw new Exception("Não há ligações");
        }

    }

    public void consultaTodasLigacoes(Fila f) throws Exception{
        String numeroTelefone;

        if(f.isEmpty()) {
            throw new Exception("Não há ligações");
        } else {
            while (!f.isEmpty()) {
                numeroTelefone = String.valueOf(f.remove());
                System.out.println(numeroTelefone);

            }
        }
    }

}
