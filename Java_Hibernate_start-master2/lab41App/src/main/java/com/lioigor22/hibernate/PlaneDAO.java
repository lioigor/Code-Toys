package com.lioigor22.hibernate;

import org.hibernate.HibernateException;
import com.lioigor22.planes.*;

public class PlaneDAO extends DAO {

	public Plane createPlane(String name) throws Exception {
		try {
			begin();
			Plane plane = new Plane(name);
			getSession().save(plane);
			commit();
			return plane;
		} catch (HibernateException e) {
			rollback();
			throw new Exception("Could not create user " + name, e);
		}
	}
}
