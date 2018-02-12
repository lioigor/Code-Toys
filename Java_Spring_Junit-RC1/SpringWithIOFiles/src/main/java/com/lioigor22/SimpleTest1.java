package com.lioigor22;

import java.io.File;

import com.lioigor22.daoNumbers.INumbersStorageDAO;
import com.lioigor22.daoNumbers.NumbersStorageDAOFileTxt;
import com.lioigor22.model.NumbersStorage;

public class SimpleTest1 extends SimpleTest {

	public SimpleTest1(File fileinput, File fileout) {

		super(fileinput, fileout);

	}

	@Override
	public void doTask() {

		INumbersStorageDAO dao = new NumbersStorageDAOFileTxt();

		NumbersStorage storage = new NumbersStorage();
		storage.fillRandom(100);

		System.out.println("			***Implement task with text files***");
		System.out.println("Start writing random file...");
		dao.write(storage, fileinput);

		System.out.println("\nRead file " + fileinput.getName() + " : ");
		System.out.println(dao.read(fileinput));

		System.out.println("\nResult implementation task by mulNumFirstNegative method: ");

		storage = new NumbersStorage(dao.read(fileinput).getArray());
		storage.mulNumFirstNegative();
		System.out.println(storage.getArray().toString());

		dao.write(storage, fileout);

		System.out.println("			****************************************END****************************************");
	}

}
