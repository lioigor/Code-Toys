package com.lioigor22.electrical;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ElectricalSaver {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Tv tv = new Tv();
		tv.setPluggedIn(true);
		tv.setAmperage(1.5);
		tv.setVoltage(220);
		tv.setTurnONTv(true);

		Microwave microwave = new Microwave();
		microwave.setPluggedIn(true);
		microwave.setAmperage(2.4);
		microwave.setVoltage(220);
		microwave.setTimerMillis(150050);
		microwave.setRotate(true);

		Transaction tx = session.beginTransaction();
		session.save(tv);
		session.save(microwave);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}

}