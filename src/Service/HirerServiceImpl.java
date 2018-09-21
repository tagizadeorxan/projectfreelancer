/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Hirer.HirerDao;
import Model.Hirer;
import java.util.List;

/**
 *
 * @author tagiz
 */
public class HirerServiceImpl implements HirerService {
    
    private HirerDao hirerdao;

    public HirerServiceImpl (HirerDao hirerdao) {
        super();
        this.hirerdao = hirerdao;
    }
    @Override
    public List<Hirer> getHirerList() throws Exception {
return hirerdao.getHirerList();
    }

    @Override
    public boolean addNewHirer(Hirer hirer) throws Exception {
return hirerdao.addNewHirer(hirer);
    }
    
}
