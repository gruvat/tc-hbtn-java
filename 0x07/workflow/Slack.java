package workflow;
public class Slack implements CanalNotificacao{

    public void notificar(Mensagem mensagem) {
        System.out.printf("[SLACK] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
