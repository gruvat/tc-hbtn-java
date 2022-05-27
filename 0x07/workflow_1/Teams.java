package workflow_1;
public class Teams implements CanalNotificacao{

    public void notificar(Mensagem mensagem) {
        System.out.printf("[TEAMS] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
