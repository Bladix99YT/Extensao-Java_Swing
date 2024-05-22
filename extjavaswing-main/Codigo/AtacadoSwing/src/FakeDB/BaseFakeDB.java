import java.util.HashMap;

public class BaseFakeDb {
   public abstract class BaseFakeDb<Tdominio> {

    protected HashMap<Long, Tdominio> tabela;

    public abstract HashMap<Long, Tdominio> getTabela();

    public BaseFakeDb(){
        this.tabela = new HashMap<>();
    }
   protected abstract void CarregarDados();
    
   }

}

