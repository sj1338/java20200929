package chap14.lecture.api.comparator;

public class Member { // 왼쪽 위 source 클릭
	private int id;
	private String name;

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
