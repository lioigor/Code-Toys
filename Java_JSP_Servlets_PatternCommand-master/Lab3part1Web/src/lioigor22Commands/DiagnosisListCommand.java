package lioigor22Commands;

import javax.servlet.http.HttpServletRequest;

import lioigor22ControllerLogic.ActionCommnad;
import lioigor22ControllerLogic.ConfigurationManager;


public class DiagnosisListCommand implements ActionCommnad {
	
		
		@Override
		public String execute(HttpServletRequest request) {
			
			String page = null;
			
			page = ConfigurationManager.getProperty("path.page.diagnosis");
			return page;
	}


}
