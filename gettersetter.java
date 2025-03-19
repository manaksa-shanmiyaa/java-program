package oops;
class Data1{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("Invalid name1");
        }
		}
	}

public class gettersetter {
public static void main(String[] args) {
	Data1 s1=new Data1();
	s1.setName("manaksa");
	System.out.println("Student name is" +s1.getName());
	}
}
