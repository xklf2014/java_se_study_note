package com.jdbc;

import com.jdbc.dao.BatchDao;
import com.jdbc.dao.EmpDao;
import com.jdbc.dao.impl.BatchDaoImpl;
import com.jdbc.dao.impl.EmpDaoImpl;
import com.jdbc.dao.impl.EmpDaoImpl2;
import com.jdbc.entity.Emp;


public class EmpTest {
    public static void main(String[] args) {
        EmpDao empDao = new EmpDaoImpl();
        //Emp emp = new Emp(1111,"oracle","SALES",null,"2020-06-06",2000.0,0.0,10);
        //empDao.insert(emp);
        //empDao.delete(emp);

        //Emp emp = new Emp(1111,"test","SALES",null,"2020-06-06",2000.0,0.0,10);
        //empDao.update(emp);
        //System.out.println(empDao.getEmpByEmpno(1111));

        //System.out.println(empDao.getEmpByEname("'SMITH' or 1=1"));
        //Emp emp = new Emp(2222,"haha","SALES",1111,"2020-06-06",2000.0,0.0,10);
        //EmpDao empDao2 = new EmpDaoImpl2();
        //System.out.println(empDao2.getEmpByEname("'SCOTT' or 1=1"));
        //System.out.println(empDao2.getEmpByEmpno(1111));
        //empDao2.update(emp);
        //empDao2.insert(emp);
        //empDao2.delete(emp);


        BatchDao batchDao = new BatchDaoImpl();
        batchDao.batchInsert();

    }
}
