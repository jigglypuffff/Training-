package com.cg.training.service;

import com.cg.training.model.ATM;
import com.cg.training.model.AtmWrapper;

public interface AtmService {

	 /**
	 * @param atm
	 * @return
	 */
	ATM createAtm(AtmWrapper atm);
	
	 /**
	 * @return
	 */
	int addMoneyFromBank();
	
	 /**
	 * @return
	 */
	String withdrawMoney();
}
