
package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptUpdate {

	
	public static void main(String[] args) {
		Configuration	cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int deptno=5533;
		Query q=s.createQuery("from Department WHERE Deptno= " +deptno);
		List<Department> lstDepartment=q.list();
		Department res=lstDepartment.get(0);
	
		Transaction t=s.beginTransaction();
		res.setDname("Ram Murthy");
		res.setLoc("J2EE");
		res.setCity("Manager");
		res.setHead("9999");
		s.update(res);
		t.commit();
		System.out.println("*****Dept Updated*****");
	}
}
