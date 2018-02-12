package lioigor22Commands;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;

public class EmptyCommand implements ActionCommnad {
	
	@Override
	public String execute(HttpServletRequest request) {
		
	String page = ConfigurationManager.getProperty("path.page.index");
	return page;
	
	}

}
