package by.jonline.module04.simple_class.task03;

import java.util.Random;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, 
 * номер группы, успеваемость (массив из пяти элементов). Создайте массив 
 * из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		int[] progress;

		Random rnd = new Random();

		for (int i = 0; i < students.length; i++) {
			progress = new int[Student.getCountOfExam()];
			for (int j = 0; j < progress.length; j++) {
				progress[j] = rnd.nextInt(3) + 8;
			}
			students[i] = new Student("Студент" + (i + 1), "" + (rnd.nextInt(2) + 1), progress);
		}

		System.out.println("Все студенты:");
		outInConsole(students);

		System.out.println("Студенты-отличники:");
		System.out.println("Имя студента|Группа");
		for (int i = 0; i < students.length; i++) {
			if (students[i].hasBestStudents()) {
				System.out.printf("%-13s", students[i].getName());
				System.out.printf("%-6s", students[i].getGroup());
				System.out.println();
			}
		}
	}

	public static void outInConsole(Student st[]) {
		System.out.println("Имя студента|Группа|Оценки  ");
		for (int i = 0; i < st.length; i++) {
			System.out.printf("%-13s", st[i].getName());
			System.out.printf("%-6s", st[i].getGroup());
			for (int j = 0; j < st[i].getProgress().length; j++) {
				System.out.printf("%3d", st[i].getProgress()[j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
