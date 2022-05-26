public class Teams implements CanalNotificacao{

    @Override
    public void notificacao(Mensagem mensagem) {
        System.out.printf("[TEAMS] {%s} - %s\n", mensagem.getTipoMensagem().toString(), mensagem.getTexto());
    }
}
