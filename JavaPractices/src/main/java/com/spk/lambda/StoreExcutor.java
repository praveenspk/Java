package com.spk.lambda;

import java.util.function.Consumer;

public class StoreExcutor {

	public static void main(String[] args) {
	Computer com=new Computer(1-570, "Acer");	
	RepairShop rep=new RepairShop();
	//Using Anonymous class
		com.excute(com, new Consumer<Computer>() {
		
		@Override
		public void accept(Computer t) {
		rep.fix(t);	
		}
	});
	
	//Lambda Expressions
		
	Computer computer=new Computer(123, "Dell");
	computer.excute(computer, c->rep.fix(computer));
	//Lambda Method reference
	Computer computer1=new Computer(785,"HP");
	computer.excute(computer1, rep::fix);
	}

}
