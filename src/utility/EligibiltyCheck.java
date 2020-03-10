package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{


<<<<<<< HEAD
	
	public boolean checkQuizAnswer(String points) {
		
		return true;
	}

	public boolean checkUser(User user) {
		
		return true;
	}
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user))
			return true;
		else
=======
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
>>>>>>> da8f0c69a72dfe8a808533ee4696ced020ff116d
		return false;
	}


	

}







