package com.lioigor22.hibernate;

import java.util.List;

import com.lioigor22.electrical.*;

public class ElectricalAppliancesDAO extends DAO {

	private static final String SQL_QUERY_SORT = "FROM ElectricalAppliance ORDER BY amperage";

	public List<ElectricalAppliance> getSortedList() {

		List<ElectricalAppliance> appliances;

		begin();
		appliances = getSession().createQuery(SQL_QUERY_SORT).getResultList();

		commit();
		return appliances;
	}

	public List<ElectricalAppliance> getForIntervalAmperage(double min, double max) {

		List<ElectricalAppliance> appliances;

		begin();
		appliances = getSession()
				.createQuery("FROM ElectricalAppliance WHERE amperage < " + max + " AND amperage > " + min)
				.getResultList();

		commit();
		return appliances;
	}

}
