package com.paymentsystem;

abstract class payment {
	public int amount ;
	public  payment(int amount) {
        this. amount = amount;
    }
	abstract  void paymentprocess();
}
class creditcardpayment extends payment{
	public creditcardpayment(int amount) {
		super(amount);
	}
	void paymentprocess () {
		System.out.println("creditcardpayment Done by creditcardpayment"+amount);
		
	}
	
}
class upipayment extends payment{
	public  upipayment(int amount) {
		super(amount);
	}
	
	void paymentprocess () {
		System.out.println("upipayment This payment done by upi"+amount);
	}
}


