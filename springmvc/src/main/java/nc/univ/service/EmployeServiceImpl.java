package nc.univ.service;

import java.util.ArrayList;
import java.util.List;

import nc.univ.model.Employe;

public class EmployeServiceImpl implements IEmployeService {

    @Override
    public List<Employe> getAllEmployes() {
        List<Employe> employeList = new ArrayList<Employe>();

        employeList.add(new Employe(1, "John", "Doe"));
        employeList.add(new Employe(2, "Crazy", "Frog"));

        return employeList;
    }
    
}
