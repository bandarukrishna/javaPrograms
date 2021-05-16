package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("krishna",19,1239522);
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\krish\\ser.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			System.out.println("obj serialised");
			oos.close();
			fos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}


	}

}
