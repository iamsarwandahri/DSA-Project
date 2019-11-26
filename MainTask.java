import java.util.*;
class Room{
    String name;
	String sex;
	int age;
	int rno;

	public void customer(String n,String s,int a,int r){
	 ArrayList<Integer> q =new ArrayList<Integer>();
	 System.out.print("Available Rooms");
	 q.add(101);
	 q.add(102);
	 q.add(103);
	 q.add(104);
     System.out.println(q);
	 //System.out.println(q.get(0));
	 int size = q.size();
	 System.out.println("Size: "+size);  
		  
		  
		  name =n;
		  sex = s;
		  age = a;
	      rno=r;
          for(int i=0; i<5;i++){	  
    	  if(rno == q.get(i)){
		  System.out.print("Room No "+q.get(i)+" Booked");
		  break;
		  }
		  else
		  { System.out.print("Room Not Available"); }
		  }	  
 }
}
class MainTask{
	public static void main(String []args){
	Room room = new Room();
	room.customer("Ahmed Ali","Female",18,101);
	}
	}