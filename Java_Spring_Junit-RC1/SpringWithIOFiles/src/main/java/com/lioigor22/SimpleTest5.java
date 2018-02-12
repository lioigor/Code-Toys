package com.lioigor22;

import java.io.File;

import com.lioigor22.daoNumbers.INumbersStorageDAO;
import com.lioigor22.daoNumbers.NumbersStorageDAOFileBin;
import com.lioigor22.daoNumbers.NumbersStorageDAOFileTxt;
import com.lioigor22.model.NumbersStorage;

public class SimpleTest5 extends SimpleTest {

	public SimpleTest5(File fileinput, File fileout) {

		super(fileinput, fileout);

	}

	@Override
	public void doTask() {

		NumbersStorage storage = new NumbersStorage();

		System.out.println("			***Implement task, if the input file is a binary and output - text***");
		storage.fillRandom(100);

		System.out.println("random: " + storage.getArray().toString());
		System.out.println("Start writing random bin file...");

		INumbersStorageDAO daoBin = new NumbersStorageDAOFileBin();
		daoBin.write(storage, fileinput);

		System.out.println("\nRead file " + fileinput.getName() + " : ");
		System.out.println(daoBin.read(fileinput));

		// ----------------------------------------------------------------------------------------------------------------------------

		System.out.println("\nResult implementation task by mulNumFirstNegative method: ");

		INumbersStorageDAO daoTxt = new NumbersStorageDAOFileTxt();

		storage = new NumbersStorage(daoBin.read(fileinput).getArray());
		storage.mulNumFirstNegative();

		System.out.println(storage.getArray().toString());

		daoTxt.write(storage, fileout);

		System.out.println("			****************************************END****************************************");
	}

}
