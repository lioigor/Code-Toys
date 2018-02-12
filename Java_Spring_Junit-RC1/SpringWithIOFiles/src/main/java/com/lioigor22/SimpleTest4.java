package com.lioigor22;

import java.io.File;

import com.lioigor22.daoNumbers.INumbersStorageDAO;
import com.lioigor22.daoNumbers.NumbersStorageDAOFileBin;
import com.lioigor22.daoNumbers.NumbersStorageDAOFileTxt;
import com.lioigor22.model.NumbersStorage;

public class SimpleTest4 extends SimpleTest {

	public SimpleTest4(File fileinput, File fileout) {

		super(fileinput, fileout);

	}

	@Override
	public void doTask() {

		INumbersStorageDAO daoTxt = new NumbersStorageDAOFileTxt();

		NumbersStorage storage = new NumbersStorage();
		storage.fillRandom(100);

		System.out.println("			***Implement task, if the input file is a text and output - binary***");
		System.out.println("Start writing random file...");
		daoTxt.write(storage, fileinput);

		System.out.println("\nRead file " + fileinput.getName() + " : ");
		System.out.println(daoTxt.read(fileinput));

		System.out.println("\nResult implementation task by mulNumFirstNegative method: ");

		// -------------------------------------------------------------------------------------------------------------

		INumbersStorageDAO daoBin = new NumbersStorageDAOFileBin();

		storage = new NumbersStorage(daoTxt.read(fileinput).getArray());

		storage.mulNumFirstNegative();

		System.out.println(storage.getArray().toString());

		daoBin.write(storage, fileout);
		System.out.println();

		new NumbersStorageDAOFileBin().printConsole(fileout);

		System.out.println("			****************************************END****************************************");

	}

}
