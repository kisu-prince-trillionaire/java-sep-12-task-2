package com.analysis.player;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PlayerMain {

	public static void main(String[] args) {
		String name;
		long score;
		Map<String,Long> map = new TreeMap<String,Long>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of players : ");
		int noOfPlayers = sc.nextInt();
		for(int i = 1; i<= noOfPlayers;i++) {
			System.out.println("Enter the details of the player " + i);
			System.out.println("Enter the name : ");
			name = sc.next();
			System.out.println("Enter the Score : ");
			score = sc.nextLong();
			map.put(name, score);
		}
		
		System.out.println("The Scorecard given by you is :-----");
		System.out.println(map);
		sc.close();
	}

}
