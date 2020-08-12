package objectopernz;

public class Student {

	String name;
	int rollno;

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj instanceof Student) {
			Student s1 = (Student) obj;
			if (name.equals(s1.name) && rollno == s1.rollno)
				return true;
			else
				return false;
		} else
			return false;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[name=" + name + ", rollno=" + rollno + "]";
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}


	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}
