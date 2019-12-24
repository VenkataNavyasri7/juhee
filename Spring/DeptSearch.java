
package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DeptSearch {

	public static void main(String[] args) {
		Configuration	cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int deptno=1;
		Query q=s.createQuery("from Department WHERE Deptno= " +deptno);
		List<Department> lstDepartment=q.list();
		Department e=lstDepartment.get(0);
		System.out.println("Deptno " +e.getDeptno());
		System.out.println("DName " +e.getDname());
		System.out.println("Loc " +e.getLoc());
		System.out.println("City " +e.getCity());
		System.out.println("Head " +e.getHead());
	}
}
