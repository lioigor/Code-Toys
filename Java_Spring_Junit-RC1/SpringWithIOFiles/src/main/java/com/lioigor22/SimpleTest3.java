package com.lioigor22;

import java.io.File;

import com.lioigor22.daoNumbers.INumbersStorageDAO;
import com.lioigor22.daoNumbers.NumbersStorageDAOFileBin;
import com.lioigor22.model.NumbersStorage;

public class SimpleTest3 extends SimpleTest {

	public SimpleTest3(File fileinput) {

		super(fileinput, null);

	}

	@Override
	public void doTask() {

		NumbersStorage storage = new NumbersStorage();

		System.out.println("			***Implement task from one source binary file by running rewriting the place***");
		storage.fillRandom(100);

		System.out.println("random: " + storage.getArray().toString());
		System.out.println("Start writing random bin file...");

		INumbersStorageDAO dao = new NumbersStorageDAOFileBin();
		dao.write(storage, fileinput);

		System.out.println("\nRead file " + fileinput.getName() + " : ");
		System.out.println(dao.read(fileinput));

		System.out.println("\nResult implementation task by mulNumFirstNegative method: ");

		storage = new NumbersStorage(dao.read(fileinput).getArray());

		storage.mulNumFirstNegative();

		System.out.println(storage.getArray().toString());

		dao.write(storage, fileinput);
		System.out.println();

		new NumbersStorageDAOFileBin().printConsole(fileinput);

		System.out.println("			****************************************END****************************************");
	}

}
