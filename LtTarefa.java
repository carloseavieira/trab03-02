import java.util.ArrayList;
import java.util.List;

public class LtTarefa {
    public List<String> NumLista(){
        List<String> lista = new ArrayList<>();
        for(int i = 1; i < 21; i++){
            lista.add("Lavar Carro "+i);
        }
        return lista;
    }
}
