package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchEngineFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchEngineFacade.class);

    public void findEmployee(final String arg) throws SearchEngineException {
        boolean wasError = false;

        List<Employee> employeesFound = employeeDao.searchForEmployee("%"+arg+"%");
        if(employeesFound.size()==0){
            LOGGER.error(SearchEngineException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            throw new SearchEngineException(SearchEngineException.ERR_EMPLOYEE_NOT_FOUND);
        }
        try {
            for (Employee foundEmployees : employeesFound){
                LOGGER.info("Maching employee found " + foundEmployees.getFirstname() + " " +  foundEmployees.getLastname() + " for string " + arg);
            }
        } finally {
            if (wasError){
                LOGGER.info("No matching employees for string " + arg);
            }
        }
    }

    public void findCompany(final String arg) throws SearchEngineException {
        boolean wasError = false;

        List<Company> companiesFound = companyDao.searchForCompany("%"+arg+"%");
        if(companiesFound.size()==0){
            LOGGER.error(SearchEngineException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            throw new SearchEngineException(SearchEngineException.ERR_COMPANY_NOT_FOUND);
        }
        try {
            for (Company foundCompanies : companiesFound){
                LOGGER.info("Maching company found " + foundCompanies.getName() + " for string " + arg);
            }
        } finally {
            if (wasError){
                LOGGER.info("No matching companies for string " + arg);
            }
        }
    }
}
