package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\krish\\ser.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee e=	(Employee) ois.readObject();
			System.out.println("Emp Name: "+e.getEmpName());
			System.out.println("Empid : "+e.getEmpid());
			System.out.println("EmpAge : "+e.getAge());

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
