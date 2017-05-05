package Marina;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		ReadingInInformation ri = new ReadingInInformation();
		
		//System.out.println(ri.bufferedCopy("stage_5_input.txt"));
		
		
		String[] MarinaBoatPersonArray = ri.bufferedCopy("stage_5_input.txt").split("&");//text file edited
		//System.out.println(MarinaBoatPersonArray[0]);
		
		String[] MarinaArray=MarinaBoatPersonArray[0].split("/");
		//System.out.println(MarinaArray[0]);
		
		String[] MarinaArray1=MarinaArray[0].split("\n");
		//System.out.println(MarinaArray1[1]);
		
		int boatcap1= Integer.parseInt(MarinaArray1[3]);
		Marina m1 = new Marina(MarinaArray1[1],MarinaArray1[2],boatcap1);
		
		String[] MarinaArray2=MarinaArray[1].split("\n");
		//System.out.println(MarinaArray1[1]);
		
		int boatcap2= Integer.parseInt(MarinaArray2[3]);
		Marina m2 = new Marina(MarinaArray2[1],MarinaArray2[2],boatcap1);
		
		String[] BoatArray=MarinaBoatPersonArray[1].split("/");
		//System.out.println(BoatArray[0]);
		
		String[] Boat1Array=BoatArray[0].split("\n");
		
		float boatsize1 = Float.parseFloat(Boat1Array[3]);
		Boat b1 = new Boat(Boat1Array[1],Boat1Array[2],boatsize1);
		
		String[] Boat2Array=BoatArray[1].split("\n");
		
		float boatsize2 = Float.parseFloat(Boat2Array[3]);
		Boat b2 = new Boat(Boat2Array[1],Boat2Array[2],boatsize2);
		
		String[] Boat3Array=BoatArray[2].split("\n");
		
		float boatsize3 = Float.parseFloat(Boat3Array[3]);
		Boat b3 = new Boat(Boat3Array[1],Boat3Array[2],boatsize3);
		
		String[] Boat4Array=BoatArray[3].split("\n");
		
		float boatsize4 = Float.parseFloat(Boat4Array[3]);
		Boat b4 = new Boat(Boat4Array[1],Boat4Array[2],boatsize4);
		
		String[] PersonArray=MarinaBoatPersonArray[2].split("£");
		System.out.println(PersonArray[0]);
		
		String[] Person1Array=PersonArray[0].split("\n");
		
		String[] Person1NameArray = Person1Array[1].split(" ");
		Person p1 = new Person (Person1NameArray[0],Person1NameArray[1],Person1Array[2],Person1Array[3]);
		
		String[] Person2Array=PersonArray[1].split("\n");
		
		String[] Person2NameArray = Person2Array[1].split(" ");
		Person p2 = new Person (Person2NameArray[0],Person2NameArray[1],Person2Array[2],Person2Array[3]);
		
		String[] Person3Array=PersonArray[2].split("\n");
		
		String[] Person3NameArray = Person3Array[1].split(" ");
		Person p3 = new Person (Person3NameArray[0],Person3NameArray[1],Person3Array[2],Person3Array[3]);
		
		String[] Person4Array=PersonArray[3].split("\n");
		
		String[] Person4NameArray = Person4Array[1].split(" ");
		Person p4 = new Person (Person4NameArray[0],Person4NameArray[1],Person4Array[2],Person4Array[3]);
		
		String[] Person5Array=PersonArray[4].split("\n");
		
		String[] Person5NameArray = Person5Array[1].split(" ");
		Person p5 = new Person (Person5NameArray[0],Person5NameArray[1],Person5Array[2],Person5Array[3]);
		
		String[] Person6Array=PersonArray[5].split("\n");
		
		String[] Person6NameArray = Person6Array[1].split(" ");
		Person p6 = new Person (Person6NameArray[0],Person6NameArray[1],Person6Array[2],Person6Array[3]);
		
		String[] Person7Array=PersonArray[6].split("\n");
		
		String[] Person7NameArray = Person7Array[1].split(" ");
		Person p7 = new Person (Person7NameArray[0],Person7NameArray[1],Person7Array[2],Person7Array[3]);
		
		String[] Person8Array=PersonArray[7].split("\n");
		
		String[] Person8NameArray = Person8Array[1].split(" ");
		Person p8 = new Person (Person8NameArray[0],Person8NameArray[1],Person8Array[2],Person8Array[3]);
		
		String[] Person9Array=PersonArray[8].split("\n");
		
		String[] Person9NameArray = Person9Array[1].split(" ");
		Person p9 = new Person (Person9NameArray[0],Person9NameArray[1],Person9Array[2],Person9Array[3]);
		
		String[] Person10Array=PersonArray[9].split("\n");
		
		String[] Person10NameArray = Person10Array[1].split(" ");
		Person p10 = new Person (Person10NameArray[0],Person10NameArray[1],Person10Array[2],Person10Array[3]);
	
	}


}
