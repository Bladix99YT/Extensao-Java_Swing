import java.util.List;

public interface IBaseRepositorio<TFakeDB, Tdominio> {

    Tdominio Create(Tdominio instancia);

    Tdominio Read(Long chave);

    List<Tdominio> ReadAll();

    Tdominio Update(Long chave, Tdominio instancia);

    Tdominio Delete(Long chave);
}
