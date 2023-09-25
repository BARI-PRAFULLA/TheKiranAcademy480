package CorejavaProject;

public class Hotal {
         static int price=2000;
	      int id;
	      String name;
	      long mob_no;
	     int stay;
	     

	 	public void Method (int id,String name,long mob_no,int stay) {
	 		
	 		
	 		
	 		this.id=id;
            this.name = name;
	 		this.mob_no=mob_no;
	 		this.stay=stay;
	 	}
	 		
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public long getMob_no() {
				return mob_no;
			}
			public void setMob_no(long mob_no) {
				this.mob_no = mob_no;
			}
			public int getStay() {
				return stay;
			}
			public void setStay(int stay) {
				this.stay = stay;
			}
	 	
}
