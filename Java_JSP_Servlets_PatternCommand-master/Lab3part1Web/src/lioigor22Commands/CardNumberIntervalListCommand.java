package lioigor22Commands;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;

public class CardNumberIntervalListCommand implements ActionCommnad {

	@Override
	public String execute(HttpServletRequest request) {

		String page = null;
		
		page = ConfigurationManager.getProperty("path.page.card");
		return page;
	}

}
