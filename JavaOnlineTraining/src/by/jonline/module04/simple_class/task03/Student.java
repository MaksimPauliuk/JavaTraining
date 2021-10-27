package by.jonline.module04.simple_class.task03;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, 
 * номер группы, успеваемость (массив из пяти элементов). Создайте массив 
 * из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
	private String name;
	private String group;
	private final static int countOfExam = 5;
	private int[] progress;

	public Student() {
		name = null;
		group = null;
		progress = new int[countOfExam];
	}

	public Student(String name, String group, int[] progress) {
		super();
		this.name = name;
		this.group = group;
		this.progress = progress;
	}

	public boolean hasBestStudents() {
		for (int i = 0; i < progress.length; i++) {
			if (progress[i] < 9) {
				return false;
			}
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public static int getCountOfExam() {
		return countOfExam;
	}
	
	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}

}
