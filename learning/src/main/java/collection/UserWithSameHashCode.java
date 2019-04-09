package collection;

public class UserWithSameHashCode {

	private String name;
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserWithSameHashCode(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		// always return same hashcode
		int result = 1;
		System.out.println("User.hashCode() Called for ID: " + this.id + " hash--" + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			System.out.println(
					"User.equals() Matching current ID:" + this.id + " TO ID: " + ((UserWithSameHashCode) obj).id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserWithSameHashCode other = (UserWithSameHashCode) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
