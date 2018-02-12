package com.lioigor22.daoNumbers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.lioigor22.model.NumbersStorage;

public class NumbersStorageDAOFileBin implements INumbersStorageDAO {

	@Override
	public void write(NumbersStorage storage, File file) {

		ArrayList<Integer> list = new ArrayList<Integer>(storage.getArray());

		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

			try {
				for (int i = 0; i < list.size(); i++) {
					dos.writeInt(list.get(i));
				}

			} finally {
				dos.close();
			}
			System.out.println("File " + file.getName() + " successfully written!");
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}

	}

	@Override
	public NumbersStorage read(File file) {

		NumbersStorage storage = new NumbersStorage();

		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(file));

			try {

				while (dis.available() > 0) {

					storage.addNumber(dis.readInt());
				}

			} finally {
				dis.close();
			}
		} catch (IOException io) {
			System.out.println(io.getMessage());

		}

		return storage;

	}

	public void printConsole(File file) {

		NumbersStorage storage = new NumbersStorage();

		storage = read(file);

		System.out.println("File " + file.getName() + " contains: ");

		System.out.println(storage.getArray().toString());

	}

}
