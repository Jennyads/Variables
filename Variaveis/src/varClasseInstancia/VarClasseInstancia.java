package varClasseInstancia;

import java.util.Scanner;

public class VarClasseInstancia {
    public static void main(String[] args) {
        String time;
        String selecao;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("Para qual time você torce?");
        time = texto.nextLine();
        System.out.println("Para qual seleção você torce?");
        selecao = texto.nextLine();

        torcida.setTime(time);
        torcida.setSelecao(selecao);
        torcida.mostraTime();
        torcida.mostraSelecao();

        Futebol torcida2 = new Futebol();
        torcida2.mostraTime();
        torcida2.mostraSelecao();

        torcida2.setSelecao(("japonesa"));
        torcida.mostraSelecao();

    }

}
//Static indica que a variável é de classe!
//torcida2 fica null pq não existe time armazenado, já em seleção vai para a torcida2 pq a variável é de classe e é disponível para todos os objetos.
//Não importa em qual objeto faz a alteração da variável de classe, o valor será refletido em todos os outros objetos que derivam dessa mesma classe
