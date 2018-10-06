package edu.utfpr.cp.sa.business;

import edu.utfpr.cp.sa.dao.CountryDAO;
import edu.utfpr.cp.sa.entity.Country;
import java.util.Set;

public class CountryBusiness {
    
    private CountryDAO dao;

    public CountryBusiness() {
        dao = new CountryDAO();
        
    }
    
    public void create(Country country) throws Exception {
        dao.create(country);

    }

    public Set<Country> read() {
        return dao.read();

    }

}
