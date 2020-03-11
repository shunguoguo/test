package neu.work.first;

public class AddWork {
	int age, id;
	String name;

	AddWork(int age, int id, String name) {
		this.age = age;
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "id=" + id + ";  " + "age=" + age + ";   " + "name=" + name + ";";
		return s;

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof AddWork)) { // instanceof 已经处理了obj = null的情况
			return false;
		}
		AddWork aw = (AddWork) obj;
		if (aw.name.equals(this.name) && aw.id == (this.id) && aw.age == (this.age)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		AddWork aw = new AddWork(1, 2, "ne");
		System.out.println(aw);

		AddWork aw2 = new AddWork(1, 2, "ne");
		System.out.println(aw.equals(aw2));
		
		AddWork aw3 = new AddWork(1, 2, "n");
		System.out.println(aw.equals(aw3));
	}
}
