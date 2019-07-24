package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchEngineFacadeTestSuite {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    SearchEngineFacade searchEngineFacade;

    @Test
    public void testSearchEmployeeFacade(){
        try{
            searchEngineFacade.findEmployee("a");
        }catch (SearchEngineException e){
        }
    }

    @Test
    public void testSearchCompanyFacade() {
        try {
            searchEngineFacade.findCompany("a");
        } catch (SearchEngineException e) {
        }
    }
}
