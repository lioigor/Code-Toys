package com.lioigor22.model;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class StringStorageObjectServiceTest {

	@Test
	public void checkRemoveDeleteString() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("www john wwrr");
		list.add("rty johnoper");
		StringStorage storage = new StringStorage(list, "john");
		storage.removeDeleteString();

		Assert.assertEquals(true, storage.getText().toString().equals("[www  wwrr, rty oper]"));
		Assert.assertEquals(false, storage.getText().toString().equals("[wwwwwrr, rtyoper]"));

	}

}
