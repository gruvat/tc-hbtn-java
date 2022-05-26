public class Email implements CanalNotificacao{

    public void notificar(Mensagem mensagem) {
        System.out.printf("[EMAIL] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
