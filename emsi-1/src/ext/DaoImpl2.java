package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version Capteurs");
        double temp=600;
        return temp;
    }
}
