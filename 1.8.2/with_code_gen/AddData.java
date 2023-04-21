//To check compatibility with adding data in version 1.11.1, data is added in version 1.8.2, and then added again in version 1.11.1.
import tutorialspoint.com.emp;
import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

public class AddData {
   public static void main(String args[]) throws IOException{
	
      //Instantiating generated emp class
      emp e1=new emp();
	
      //Creating values according the schema
      e1.setName("omarfrom1.8.2");
      e1.setAge(21);
      e1.setSalary(30000);
      e1.setAddress("Hyderabadfrom1.8.2");
      e1.setId(001);
	
      emp e2=new emp();
	
      e2.setName("ramfrom1.8.2");
      e2.setAge(30);
      e2.setSalary(40000);
      e2.setAddress("Hyderabadfrom1.8.2");
      e2.setId(002);
	
      emp e3=new emp();
	
      e3.setName("robbinfrom1.8.2");
      e3.setAge(25);
      e3.setSalary(35000);
      e3.setAddress("Hyderabadfrom1.8.2");
      e3.setId(003);
	
      //Instantiate DatumWriter class
      DatumWriter<emp> empDatumWriter = new SpecificDatumWriter<emp>(emp.class);
      DataFileWriter<emp> empFileWriter = new DataFileWriter<emp>(empDatumWriter);
	
      empFileWriter.create(e1.getSchema(), new File("/path/to/avrofiles/addedfrom182.avro"));
	
      empFileWriter.append(e1);
      empFileWriter.append(e2);
      empFileWriter.append(e3);
	
      empFileWriter.close();
      System.out.println("data successfully serialized");
   }
}