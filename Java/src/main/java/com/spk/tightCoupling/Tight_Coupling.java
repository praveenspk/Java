package com.spk.tightCoupling;
/**
 * @author Praveen
 *
 */
public class Tight_Coupling {
	public static void main(String[] args) {
		SmartWork sw = new SmartWork();
		LazyWork lw = new LazyWork();
		ExtraordinaryWorker ew=new ExtraordinaryWorker();
		Manager mn = new Manager(sw, lw,ew);
		mn.ManageWork();

	}

}
