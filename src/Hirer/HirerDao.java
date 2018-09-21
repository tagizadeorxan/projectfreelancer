/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hirer;

import Model.Freelancer;
import Model.Hirer;
import java.util.List;

/**
 *
 * @author tagiz
 */
public interface HirerDao {
    List<Hirer> getHirerList() throws Exception;
    
    public boolean addNewHirer(Hirer hirer) throws Exception;
}
