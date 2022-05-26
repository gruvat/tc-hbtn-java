public class Slack implements CanalNotificacao{

    @Override
    public void notificacao(Mensagem mensagem) {
        System.out.printf("[SLACK] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
