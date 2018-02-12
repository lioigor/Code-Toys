package lioigor22ControllerLogic;

import javax.servlet.http.HttpServletRequest;

import lioigor22Commands.EmptyCommand;

public class ActionFactory {

	public ActionCommnad defineCommand(HttpServletRequest request) {

		ActionCommnad current = new EmptyCommand();

		String action = request.getParameter("command");
		if (action == null || action.isEmpty()) {

			return current;
		}

		try {
			CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());

			current = currentEnum.getCurrentCommand();

		} catch (IllegalArgumentException e) {
			request.setAttribute("wrongAction", action + MessageManager.getProperty("message.wrongaction"));
		}
		return current;
	}

}
