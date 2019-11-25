package com.huawei.inheritance;

class CPU {
	double price;

	class Processor {
		double cores;
		String manufacturer;

		double getCache() {
			return 4.3;
		}
	}

	protected class RAM {
		double memory;
		String manufacturer;

		double getClockSpeed() {
			return 5.5;
		}
	}

	static class USB {
		int usb2 = 2;
		int usb3 = 1;

		int getTotalPorts() {
			return usb2 + usb3;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = " + processor.getCache());
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());
		CPU.USB usb = new CPU.USB();
		System.out.println("Total ports : " + usb.getTotalPorts());

	}
}