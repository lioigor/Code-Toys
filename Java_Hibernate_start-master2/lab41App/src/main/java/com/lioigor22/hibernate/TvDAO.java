package com.lioigor22.hibernate;

import org.hibernate.HibernateException;

import com.lioigor22.electrical.*;

public class TvDAO extends DAO {

	public Tv createTv(String name) throws Exception {
		try {
			begin();
			Tv tv = new Tv(name);
			getSession().save(tv);
			commit();
			return tv;
		} catch (HibernateException e) {
			rollback();
			throw new Exception("Could not create TV " + name, e);
		}
	}

}
