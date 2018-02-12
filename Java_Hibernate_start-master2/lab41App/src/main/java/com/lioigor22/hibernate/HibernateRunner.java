package com.lioigor22.hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;
import com.lioigor22.planes.*;
import com.lioigor22.electrical.*;

public class HibernateRunner {

	private static Logger logger = Logger.getLogger(HibernateRunner.class.getName());

	public static void main(String[] args) {

		String input = "";

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		String name = "";

		try {
			while (!(input.equals("0"))) {
				System.out.println("1. Planes");
				System.out.println("2. Electrical appliances");
				System.out.println("0. Exit");

				input = in.readLine();

				if ("1".equals(input)) {

					try {
						System.out.print("Input plane name: ");
						name = in.readLine();
						PlaneDAO planeDAO = new PlaneDAO();
						Plane plane = planeDAO.createPlane(name);
						System.out.println("Plane was created. Name: " + plane.getName());
					} catch (Exception e) {
						System.out.println("Plane " + name + " already exsist.");
					}
				} else if ("2".equals(input)) {
					String action = "";

					while (!(action.equals("5"))) {
						System.out.println("1. Add TV");
						System.out.println("2. Add microwave");
						System.out.println("3. Sort appliances");
						System.out.println("4. Find appliances for interval");
						System.out.println("5. Exit");
						System.out.println("0. Exit to main menu");

						input = in.readLine();

						if ("1".equals(input)) {
							try {
								System.out.print("Input TV name: ");
								name = in.readLine();
								TvDAO tvDAO = new TvDAO();
								Tv tv = tvDAO.createTv(name);
								System.out.println("Tv was created. Name: " + tv.getName());
							} catch (Exception e) {
								System.out.println("Tv " + name + " already exsist.");
							}

						} else if ("2".equals(input)) {
							try {
								System.out.print("Input microwave name: ");
								name = in.readLine();
								MicrowaveDAO microwaveDAO = new MicrowaveDAO();
								Microwave microwave = microwaveDAO.createMicrowave(name);
								System.out.println("Microwave was created. Name: " + microwave.getName());
							} catch (Exception e) {
								System.out.println("MicrowavePlane " + name + " already exsist.");
							}

						} else if ("3".equals(input)) {
							ElectricalAppliancesDAO edao = new ElectricalAppliancesDAO();
							ArrayList<ElectricalAppliance> apps = new ArrayList<ElectricalAppliance>();
							apps.addAll(edao.getSortedList());

							for (ElectricalAppliance app : apps) {
								System.out.println("ID=" + app.getId() + ", pluggedIn=" + app.getPluggedIn()
										+ ", amperage=" + app.getAmperage() + ", voltage=" + app.getVoltage());
							}

						} else if ("4".equals(input)) {
							System.out.print("Input min: ");
							String min = in.readLine();
							System.out.print("Input max: ");
							String max = in.readLine();

							ElectricalAppliancesDAO edao = new ElectricalAppliancesDAO();
							ArrayList<ElectricalAppliance> apps = new ArrayList<ElectricalAppliance>();
							apps.addAll(edao.getForIntervalAmperage(Double.parseDouble(min), Double.parseDouble(max)));

							for (ElectricalAppliance app : apps) {
								System.out.println("ID=" + app.getId() + ", pluggedIn=" + app.getPluggedIn()
										+ ", amperage=" + app.getAmperage() + ", voltage=" + app.getVoltage());
							}

						} else if ("5".equals(input)) {
							break;
						}
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Error! " + e.getMessage());
		}

	}
}
