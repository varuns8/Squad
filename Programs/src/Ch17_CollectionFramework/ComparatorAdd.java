package Ch17_CollectionFramework;

import java.util.Comparator;

public class ComparatorAdd implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.add.compareToIgnoreCase(o2.add);
	}

}
