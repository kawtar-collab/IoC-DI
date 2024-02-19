package Dao;

import org.springframework.stereotype.Component;

@Component("Dao")

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Getting data from the database");
        double data = 10.0;
        return data;
    }
}
