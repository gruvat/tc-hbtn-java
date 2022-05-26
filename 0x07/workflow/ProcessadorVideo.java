import java.util.List;
import java.util.ArrayList;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for(CanalNotificacao canal : this.canais) {
            String message = String.format("%s - %s", video.getArquivo(), video.getFormato());
            canal.notificar(new Mensagem(message, TipoMensagem.LOG));
        }
    }
}
