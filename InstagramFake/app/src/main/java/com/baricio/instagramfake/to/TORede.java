package com.baricio.instagramfake.to;

import java.util.List;

/**
 * Created by Fabricio on 21/06/2015.
 */
public class TORede extends TOBase {

    private List<TOPublicacao> lista;

    public List<TOPublicacao> getLista() {
        return lista;
    }

    public void setLista(List<TOPublicacao> lista) {
        this.lista = lista;
    }
}
