package com.jdbc.dao;

import com.jdbc.entity.Emp;

public interface EmpDao {

    void insert(Emp emp);

    void delete(Emp emp);

    void update(Emp emp);

    Emp getEmpByEmpno(Integer empno);

    Emp getEmpByEname(String ename);
}
