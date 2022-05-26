public class Email implements CanalNotificacao{

    @Override
    public void notificacao(Mensagem mensagem) {
        System.out.printf("[EMAIL] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
