package workflow_1;
public class Sms implements CanalNotificacao{

    public void notificar(Mensagem mensagem) {
        System.out.printf("[SMS] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
