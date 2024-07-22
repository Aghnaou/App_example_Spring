package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    private IDao dao;


    // constructeur par defaut
    //public MetierImpl(){
    //}

    // l'injection des dependance en utilisant un constructeur
    public MetierImpl(@Qualifier("dao2") IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*25;
        return res;
    }

    // using a setter :
    public void setDao(IDao dao){
        this.dao=dao;
    }
}
