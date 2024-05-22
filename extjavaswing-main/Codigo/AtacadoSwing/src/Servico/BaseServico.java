package Servico;

import java.util.ArrayList;

// <> Camadas de cima pra baixo que usam no servico
public abstract class BaseServico<Trepositorio, Tdominio> {
    protected Trepositorio repo;

    // BREAD
    public abstract ArrayList<Tdominio> Browse();

    public abstract Tdominio Read(Long chave);

    public abstract Tdominio Edit(Long chave, Tdominio instancia);

    public abstract Tdominio Add(Tdominio instancia);

    public abstract Tdominio Delete(Long chave);

}
