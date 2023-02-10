package varClasseInstancia;

public class Futebol {
    private String nomeTime; //variáveç de instância
    private static String nomeSelecao;//variável de classe
    public void setTime(String meuTime){ //configurar nome do time
        nomeTime = meuTime;
    }
    public String getTime() {  //ler nome do time
        return nomeTime;
    }
    public void setSelecao(String selecao){
        nomeSelecao = selecao;
    }
    public String getSelecao() {
        return nomeSelecao;
    }
    public void mostraTime() {
        System.out.printf("Seu time do coração é %s\n", getTime());

    }
    public void mostraSelecao() {
        System.out.printf("Sua seleção é %s\n", getSelecao());

    }


}
