package pkg30daysofcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sysvenkatesh
 */
public class Day8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> mapob = new HashMap<String, Integer>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) 
                {
			String name = sc.next();
			int phone = sc.nextInt();
			mapob.put(name, phone);
		}

		while (sc.hasNext()) {
			String name = sc.next();
			if (mapob.containsKey(name)) {
				System.out.println(name + "=" + mapob.get(name));
			} else {
				System.out.println("Not found");
			}
		}

		sc.close();
	}
}
