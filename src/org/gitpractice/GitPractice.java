package org.gitpractice;

public class GitPractice {

	public static void main(String[] args) {
		
		String s = "java program";
		
		int length = s.length();
		System.out.println(length);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = s.indexOf('g');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		boolean equals = s.equals("java program");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("JAVA PROGRAM");
		System.out.println(equalsIgnoreCase);
		
		boolean contains = s.contains("java");
		System.out.println(contains);
		
		String replace = s.replace("java program", "selenium");
		System.out.println(replace);
		
		boolean startsWith = s.startsWith("ava");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("ram");
		System.out.println(endsWith);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String trim = s.trim();
		System.out.println(trim);
	}
	


}
