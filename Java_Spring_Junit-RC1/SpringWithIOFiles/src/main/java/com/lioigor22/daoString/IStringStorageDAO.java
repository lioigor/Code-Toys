package com.lioigor22.daoString;

import java.io.File;

import com.lioigor22.model.StringStorage;

public interface IStringStorageDAO {

	void write(StringStorage storage, File file);

	StringStorage read(File file);

}
