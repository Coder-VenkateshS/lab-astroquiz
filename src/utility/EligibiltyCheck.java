package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{


	public boolean basicEligibilityCheck(User user,String answers) {
		if(checkUser(user) && checkQuizAnswer(answers))
			return true;
		else
		return false;
	}

	public boolean checkQuizAnswer(String answers) {
		return false;
	}

	public boolean checkUser(User user) {
		return false;
	}


	

}







