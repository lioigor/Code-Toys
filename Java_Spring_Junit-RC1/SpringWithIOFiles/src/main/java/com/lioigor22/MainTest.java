package com.lioigor22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		String input = "";

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		try {
			while (!(input.equals("0"))) {
				System.out.println("1. Implement task with text files");
				System.out.println("2. Implement task with binary files. For check result write a output method a binary file on the screen");
				System.out.println("3. Implement task from one source binary file by running rewriting the place");
				System.out.println("4. Implement task, if the input file is a text and output - binary");
				System.out.println("5. Implement task, if the input file is a binary and output - text");
				System.out.println("--------------------------------");
				System.out.println("6. Enter a sequence of lines from the keyboard in the * .dat file");
				System.out.println("0. Exit");

				input = in.readLine();

				if ("1".equals(input)) {

					SimpleTest task1 = (SimpleTest) context.getBean("task1");
					task1.doTask();

				} else if ("2".equals(input)) {
					SimpleTest task2 = (SimpleTest) context.getBean("task2");
					task2.doTask();

				} else if ("3".equals(input)) {

					SimpleTest task3 = (SimpleTest) context.getBean("task3");
					task3.doTask();

				} else if ("4".equals(input)) {

					SimpleTest task4 = (SimpleTest) context.getBean("task4");
					task4.doTask();

				} else if ("5".equals(input)) {

					SimpleTest task5 = (SimpleTest) context.getBean("task5");
					task5.doTask();

				} else if ("6".equals(input)) {

					Task2SimpleTest job2 = (Task2SimpleTest) context.getBean("job2task");
					job2.doTask();

				}
			}
		} catch (Exception e) {
			System.out.println("Error! " + e.getMessage());
		}
	}
}
