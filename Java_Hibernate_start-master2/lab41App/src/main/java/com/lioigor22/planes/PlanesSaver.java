package com.lioigor22.planes;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class PlanesSaver {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Plane plane = new Plane();
		plane.setAscensionalPower(466.7);
		plane.setDestination("New York");
		plane.setName("Boeng");
		plane.setSize(364.7);

		Wing wing = new Wing();
		wing.toFly();

		try {
			plane.setChassis(new Chassis(34.6));

			Transaction tx = session.beginTransaction();
			session.save(plane);

			System.out.println("Object saved successfully.....!!");
			tx.commit();
			session.close();
			factory.close();
		} catch (WrongChassisRadiusException e) {
			System.out.println(e.getMessage());
		}

	}

}