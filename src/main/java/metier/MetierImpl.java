package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("Dao")
    private IDao dao;//couplage faible
    @Override
    public double calcul() {
        double data = dao.getData();
        double result = data * 23;
        return result;
    }
    //permettre  d'injecter dans la variable dao l'objet DaoImpl
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
