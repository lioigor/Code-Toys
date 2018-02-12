package com.lioigor22.hibernate;

import org.hibernate.HibernateException;

import com.lioigor22.electrical.*;

public class MicrowaveDAO extends DAO {

	public Microwave createMicrowave(String name) throws Exception {
		try {
			begin();
			Microwave microwave = new Microwave(name);
			getSession().save(microwave);
			commit();
			return microwave;
		} catch (HibernateException e) {
			rollback();
			throw new Exception("Could not create microwave " + name, e);
		}
	}

}
