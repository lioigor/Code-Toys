package lioigor22ControllerLogic;

import lioigor22Commands.AcceptCommand;
import lioigor22Commands.CardNumberIntervalListCommand;
import lioigor22Commands.DiagnosisListCommand;
import lioigor22Commands.ExistingPatientListCommand;
import lioigor22Commands.ViewCardNumberListCommand;
import lioigor22Commands.ViewDiagnosisListCommand;

public enum CommandEnum {

	ACCEPT {
		{
			this.command = new AcceptCommand();
		}
	},
	DIAGNOSISLIST {
		{
			this.command = new DiagnosisListCommand();
		}
	},
	CARDNUMBERINTERVALLIST {
		{
			this.command = new CardNumberIntervalListCommand();
		}

	},
	EXISTINGPATIENTLIST {
		{
			this.command = new ExistingPatientListCommand();
		}
	},
	VIEWDIAGNOSISLIST{
		{
			this.command = new ViewDiagnosisListCommand();
		}
	},
	VIEWCARDNUMBERLIST{
		{
			this.command = new ViewCardNumberListCommand();
		}
	};

	ActionCommnad command;

	public ActionCommnad getCurrentCommand() {

		return command;
	}
}
