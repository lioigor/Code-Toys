package com.lioigor22.daoNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.lioigor22.model.NumbersStorage;

public class NumbersStorageDAOFileTxt implements INumbersStorageDAO {

	// @Override
	// public void writeString(ArrayList<String> list, File file) {
	//
	// try {
	// PrintWriter pw = new PrintWriter(file);
	//
	// try {
	// for (int i = 0; i < list.size(); i++) {
	// pw.println(list.get(i));
	// }
	// } finally {
	// pw.close();
	// }
	// System.out.println("File " + file.getName() + " successfully written!");
	// } catch (IOException io) {
	// System.out.println(io.getMessage());
	//
	// }
	// }

	@Override
	public void write(NumbersStorage storage, File file) {

		ArrayList<Integer> list = new ArrayList<Integer>(storage.getArray());

		try {
			PrintWriter pw = new PrintWriter(file);

			try {
				for (int i = 0; i < list.size(); i++) {
					pw.println(list.get(i));
				}
			} finally {
				pw.close();
			}
			System.out.println("File " + file.getName() + " successfully written!");
		} catch (IOException io) {
			System.out.println(io.getMessage());

		}
	}

	// @Override
	// public ArrayList<String> readString(File file) {
	//
	// ArrayList<String> list = new ArrayList<>();
	// try {
	// FileReader fr = new FileReader(file);
	// BufferedReader reader = new BufferedReader(fr);
	//
	// try {
	//
	// String line = reader.readLine();
	// while (line != null) {
	// list.add(line);
	//
	// line = reader.readLine();
	// }
	//
	// } finally {
	// fr.close();
	// }
	// System.out.println("File " + file.getName() + " successfully read!");
	// } catch (IOException io) {
	// System.out.println(io.getMessage());
	//
	// }
	// return list;
	//
	// }

	@Override
	public NumbersStorage read(File file) {

		NumbersStorage storage = new NumbersStorage();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);

			try {

				String line = reader.readLine();
				while (line != null) {
					storage.addNumber(Integer.parseInt(line));

					line = reader.readLine();
				}

			} finally {
				fr.close();
			}
			System.out.println("File " + file.getName() + " successfully read!");
		} catch (IOException io) {
			System.out.println(io.getMessage());

		}
		return storage;

	}

}
