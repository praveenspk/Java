package com.spk.tightCoupling;

class Manager {

	SmartWork sw;
	LazyWork lw;
	ExtraordinaryWorker ew;

	public Manager(SmartWork sw, LazyWork lw , ExtraordinaryWorker ew) {
		
		this.sw = sw;
		this.lw = lw;
		this.ew=ew;
	}

	public void ManageWork() {
		sw.work();
		lw.work();
		ew.work();
	}

}