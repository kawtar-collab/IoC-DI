package Dao;

import org.springframework.stereotype.Component;

@Component("DaoV2")

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Getting data from the database V2");
        double data = 10.0;
        return data;
    }
}
