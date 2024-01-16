package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	ArrayList<String> students = new ArrayList<>();

	public Random randomiser;

	public Main() {
		this.randomiser = new Random();
		File file = new File("assets/students.txt");
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				students.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public String randomStudent() {
		return students.get(randomiser.nextInt(students.size()));
	}

	public String pairStudents() {
		StringBuilder sb = new StringBuilder();
		boolean[] pickedStudents = new boolean[students.size()];
		for (int i = 0; i < students.size(); i++) {

			int student = randomiser.nextInt(students.size());
			while (pickedStudents[student]) {
				student = randomiser.nextInt(students.size());
			}
			sb.append(students.get(student));
			pickedStudents[student] = true;
			if (i % 2 == 0) {
				sb.append(", ");
			} else {
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	public String peerStudents() {
		StringBuilder sb = new StringBuilder();
		boolean[] pickedStudents = new boolean[students.size()];
		for (int i = 0; i < students.size(); i++) {

			int student = randomiser.nextInt(students.size());
			while (pickedStudents[student]) {
				student = randomiser.nextInt(students.size());
			}
			sb.append(students.get(student));
			pickedStudents[student] = true;
			if ((i + 1) % 3 == 0) {
				sb.append("\n");
			} else {
				sb.append(", ");
			}
		}
		return sb.toString();
	}

	public String showStudents() {
		StringBuilder sb = new StringBuilder();
		for (String s : students) {
			sb.append(s);
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	public String showMenue(){
		return "Options:\n1: Random student.\n2: Pair students.\n3: Peer students.\n4: List students\nq: Quit.";
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		System.out.println(main.showMenue());
		String input;
		do {
			input = sc.nextLine();
			switch (input){
				case "1": System.out.println(main.randomStudent()); break;
				case"2": System.out.println(main.pairStudents()); break;
				case"3": System.out.println(main.peerStudents());break;
				case"4": System.out.println(main.showStudents());break;
				default: System.out.println();
			}
			System.out.println();
			System.out.println(main.showMenue());
		}
		while(!input.equals("q"));
	}
}
