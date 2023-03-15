package Ch17_CollectionFramework;

import java.util.Comparator;

public class ComparatorId implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.id.compareTo(o2.id);
	}

}
