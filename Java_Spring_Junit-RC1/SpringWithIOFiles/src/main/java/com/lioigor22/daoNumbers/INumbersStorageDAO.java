package com.lioigor22.daoNumbers;

import java.io.File;

import com.lioigor22.model.NumbersStorage;

public interface INumbersStorageDAO {

	void write(NumbersStorage storage, File file);

	NumbersStorage read(File file);

}
