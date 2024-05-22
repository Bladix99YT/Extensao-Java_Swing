import java.util.HashMap;

public abstract class BaseRepositorio<TFakeDB, Tdominio> {
    protected TFakeDB fakeDB;
    protected HashMap<Long, Tdominio> dados; // tabela do fake db

}
