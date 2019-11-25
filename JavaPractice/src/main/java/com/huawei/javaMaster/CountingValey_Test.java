package com.huawei.javaMaster;

import java.io.IOException;

public class CountingValey_Test {
	public static void main(String[] args) throws IOException {
		System.out.println(solve("UDDDUDUU"));
	}
	
	static int solve(String steps) {
		int valleyNum = 0;
		int level = 0;
		for (char step : steps.toCharArray()) {
			if (level == -1 && step == 'U') {
				valleyNum++;
			}
			
			
			if (step == 'U') {
				level++;
			} else {
				level--;
			}
		}
		return valleyNum;

	}

}
