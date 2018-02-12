package com.lioigor22;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.lioigor22.daoString.IStringStorageDAO;
import com.lioigor22.daoString.StringStorageDAOFileBin;
import com.lioigor22.model.StringStorage;

public class Task2SimpleTest {

	protected File fileinput;
	protected File fileout;

	public Task2SimpleTest(File fileinput, File fileout) {
		this.fileinput = fileinput;
		this.fileout = fileout;

	}

	public void doTask() {

		System.out.println("			***Enter a sequence of lines from the keyboard in the * .dat file***");

		String input = "";
		String removingLine = "";

		ArrayList<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter sequence of lines (separated by a new line point): ");
		input = scan.nextLine();

		for (String s : input.split("\\.")) {
			list.add(s);
		}
		System.out.println("You entered the following lines: " + list.toString());
		System.out.println("Set the string to remove: ");
		removingLine = scan.nextLine();

		StringStorage storage = new StringStorage();
		storage.setText(list);
		IStringStorageDAO dao = new StringStorageDAOFileBin();

		System.out.println("Start writing input file...");
		dao.write(storage, fileinput);

		StringStorage storage2 = new StringStorage();
		storage2 = dao.read(fileinput);
		storage2.setDeleteString(removingLine);

		storage2.removeDeleteString();
		System.out.println("\nResult implementation task by removeDeleteString method: ");
		System.out.println(storage2.getText().toString());

		dao.write(storage2, fileout);

		System.out.println();

		new StringStorageDAOFileBin().printConsole(fileout);

		System.out.println("			****************************************END****************************************");

	}

}
