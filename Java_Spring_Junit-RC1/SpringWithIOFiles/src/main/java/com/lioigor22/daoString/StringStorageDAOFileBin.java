package com.lioigor22.daoString;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.lioigor22.model.StringStorage;

public class StringStorageDAOFileBin implements IStringStorageDAO {

	@Override
	public void write(StringStorage storage, File file) {

		ArrayList<String> list = new ArrayList<String>(storage.getText());

		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

			try {
				for (int i = 0; i < list.size(); i++) {
					dos.writeUTF(list.get(i));
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
	public StringStorage read(File file) {

		StringStorage storage = new StringStorage();

		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(file));

			try {

				while (dis.available() > 0) {

					storage.addLine(dis.readUTF());
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

		StringStorage storage = new StringStorage();

		storage = read(file);

		System.out.println("File " + file.getName() + " contains: ");

		System.out.println(storage.getText().toString());

	}

}
