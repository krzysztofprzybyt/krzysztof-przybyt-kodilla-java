package com.kodilla.testing.topListStudent;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		final Map<Integer, Student> students = generateStudentsMap(100);
		final Map<Integer, Result> results = generateResultMap(100);

		Integer topStudentScore = topStudentScore(results);
		System.out.println("Ocena najlepszego studenta: " + topStudentScore);

		String topStudentName = topStudentName(students, results);
		System.out.println("Imie(nazwa) najlepszego studenta: " + topStudentName);

		List<Result> correctedGrades = correctGrades(results);
		System.out.println(correctedGrades);

		List<Student> studentsWithScoreHigherThen50 = getStudentsWithScoreHigherThan50(students, results);
		System.out.println(studentsWithScoreHigherThen50);

		List<String> studentsWithGrades = getStudentsWithGrades(students, results);
		System.out.println(studentsWithGrades);
	}
	
	static List<String> getStudentsWithGrades(Map<Integer, Student> students, Map<Integer, Result> results) {
		List<String> list = new ArrayList<>();

		return list;
	}


	static List<Result> correctGrades(Map<Integer, Result> results) {
		Collection<Result> values = results.values();
		//każda ocena niezależnie od wartości (score), posiada grade = 'A'
		//popraw grade w następujący sposób:
		//score 0 - 20 -> grade E
		//score 21 - 40 -> grade D
		//score 41 - 60 -> grade C
		//score 61 - 80 -> grade B
		//score 81 - 100 -> grade A
		return new ArrayList<>(values);
	}

	static Integer topStudentScore(Map<Integer, Result> results) {
		int score = results.values().stream()
				.map(t -> t.score)
				.mapToInt(i -> i)
				.max()
				.getAsInt();
		return score;
	}

	static String topStudentName(Map<Integer, Student> students, Map<Integer, Result> results) {
		String name = "nie znaleziono studenta";
		Result best = new Result(0,0,0,"A");
		for(Result stId: results.values()) {
			if(stId.score>best.score) {
				best = stId;
			}
		}
		if(students.containsKey(best.studentId)) {
			return students.get(best.studentId).name;
		}
		//zwróc imie studenta, który uzyskał najwyższą ocenę
		return name;
	}

	static List<Student> getStudentsWithScoreHigherThan50(Map<Integer, Student> students, Map<Integer, Result> results) {
		List<Student> list = new ArrayList<>();
		//zwróc listę studentów z ocenami wyższymi od 50
		return list;
	}

	static Map<Integer, Student> generateStudentsMap(int size) {
		Map<Integer, Student> students = new HashMap<>(size);
		Random generator = new Random();
		while (size > 0) {
			int studentId = generator.nextInt(100);
			String name = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
			String university = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
			students.put(studentId, new Student(studentId, name, university));
			size--;
		}
		return students;
	}

	static Map<Integer, Result> generateResultMap(int size) {
		Map<Integer, Result> results = new HashMap<>(size);
		Random generator = new Random();
		while (size > 0) {
			int studentId = generator.nextInt(100);
			int resultId = generator.nextInt(100);
			int score = generator.nextInt(100);
			results.put(studentId, new Result(studentId, resultId, score, "A"));
			size--;
		}
		return results;
	}
}
