package com.lioigor22;

import java.io.File;

public abstract class SimpleTest {

	protected File fileinput;
	protected File fileout;

	public SimpleTest(File fileinput, File fileout) {
		this.fileinput = fileinput;
		this.fileout = fileout;

	}

	public abstract void doTask();

}
