package pres;

import Dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);//injection des dépendances


        System.out.println("res="+metier.calcul());;
    }
}
