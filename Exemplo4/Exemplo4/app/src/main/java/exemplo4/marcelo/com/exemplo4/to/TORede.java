package exemplo4.marcelo.com.exemplo4.to;

import java.util.List;

/**
 * Created by Administrador on 16/05/2015.
 */
public class TORede extends  TOBase {

    private List<TOAmigo> lista;

    public  List<TOAmigo> getLista() {

        return lista;

    }

    public void setLista(List<TOAmigo> lista){
        this.lista = lista;

    }

}
