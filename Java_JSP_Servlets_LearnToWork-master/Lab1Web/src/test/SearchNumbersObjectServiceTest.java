package test;

import org.junit.*;

import lio.model.SearchNumbers;

public class SearchNumbersObjectServiceTest {

	@Test
	public void checkCorrectWorkFindNumToNewArray(){
		
		SearchNumbers sn = new SearchNumbers();
		sn.addElement(5);
		sn.addElement(-67);
		sn.addElement(-20);
		
		Assert.assertTrue(sn.findNumToNewArray().isEmpty());
	}
}
