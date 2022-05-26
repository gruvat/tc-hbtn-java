public class Sms implements CanalNotificacao{

    @Override
    public void notificacao(Mensagem mensagem) {
        System.out.printf("[SMS] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
