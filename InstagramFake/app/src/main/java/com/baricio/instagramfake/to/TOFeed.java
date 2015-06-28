package com.baricio.instagramfake.to;

import java.util.List;

/**
 * Created by Fabricio on 21/06/2015.
 */
public class TOFeed extends TOBase{
    private boolean sucesso;
    private List<TOPublicacao> lista;

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public List<TOPublicacao> getLista() {
        return lista;
    }

    public void setLista(List<TOPublicacao> lista) {
        this.lista = lista;
    }
}
