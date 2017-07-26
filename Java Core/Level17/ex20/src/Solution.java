
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
	public static volatile List<Person> allPeople = new ArrayList<Person>();

	static {
		allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
		allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
	}

	private static void addPerson(String name, String sex, String bd) {

		SimpleDateFormat    dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		Date                date = new Date();

		try {
			date = dateFormat.parse(bd);
		}
		catch (Exception e) {}

		if (sex.equals("м"))
			allPeople.add(Person.createMale(name, date));
		else if (sex.equals("ж"))
			allPeople.add(Person.createFemale(name, date));
		System.out.println(allPeople.size() - 1);
	}

	private static void updatePerson(int id, String name, String sex, String bd) {
		SimpleDateFormat    dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		Date                date = new Date();

		try {
			date = dateFormat.parse(bd);
		}
		catch (Exception e) {}

		if (sex.equals("м")) {
			allPeople.get(id).setBirthDay(date);
			allPeople.get(id).setName(name);
			allPeople.get(id).setSex(Sex.MALE);
		}
		else if (sex.equals("ж")) {
			allPeople.get(id).setBirthDay(date);
			allPeople.get(id).setName(name);
			allPeople.get(id).setSex(Sex.FEMALE);
		}
	}

	private static void deletePerson(int id) {

		allPeople.get(id).setSex(null);
		allPeople.get(id).setName(null);
		allPeople.get(id).setBirthDay(null);
	}

	private static void printPerson(int id) {

		SimpleDateFormat    simpleDateFormat = new SimpleDateFormat();
		char                gender = '?';

		if (allPeople.get(id).getSex() == Sex.MALE)
			gender = 'м';
		else if (allPeople.get(id).getSex() == Sex.FEMALE)
			gender = 'ж';

		simpleDateFormat.applyPattern("dd-MMM-YYYY");

		simpleDateFormat.format(allPeople.get(id).getBirthDay());
		System.out.println(allPeople.get(id).getName() + " " + gender + " " + simpleDateFormat.format(allPeople.get(id).getBirthDay()));
	}

	public static void  main(String[] args) {

		int     i = 0;

		switch (args[0]) {
			case "-c" : synchronized (allPeople) {while (i < args.length - 1) {addPerson(args[i + 1], args[i + 2], args[i + 3]);i += 3;}}
				break;
			case "-u" : synchronized (allPeople) {while (i < args.length - 1) {updatePerson(Integer.parseInt(args[i + 1]), args[i + 2], args[i + 3], args[i + 4]);i += 4;}}
				break;
			case "-d" : synchronized (allPeople) {while (i < args.length - 1) {deletePerson(Integer.parseInt(args[i + 1]));i++;}}
				break;
			case "-i" : synchronized (allPeople) {while (i < args.length - 1) {printPerson(Integer.parseInt(args[i + 1]));i++;}}
				break;
		}
	}
}
