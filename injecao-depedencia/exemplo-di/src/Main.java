import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcos", "marcosviniciohd@hotmmail.com", "349912561293");
        Cliente cliente2 = new Cliente("Antonio", "antonio@hotmmail.com", "3491556699");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(cliente1);
        ativacaoClienteService.ativar(cliente2);
    }
}