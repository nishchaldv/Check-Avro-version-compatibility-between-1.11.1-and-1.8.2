import tutorialspoint.com.emp;
import java.io.File;
import java.io.IOException;
import org.apache.avro.Schema;
import org.apache.avro.Protocol;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

public class GenAvroFileIn1_8_2ToCompressin1_11_1 {
   public static void main(String args[]) throws IOException{
	
      //Instantiating generated emp class
      emp e1=new emp();
	
      //Creating values according the schema
      e1.setName("omar");
      e1.setAge(21);
      e1.setSalary(30000);
      e1.setAddress("Hyderabad");
      e1.setId(001);
	
      emp e2=new emp();
	
      e2.setName("ram");
      e2.setAge(30);
      e2.setSalary(40000);
      e2.setAddress("Hyderabad");
      e2.setId(002);
	
      emp e3=new emp();
	
      e3.setName("robbin");
      e3.setAge(25);
      e3.setSalary(35000);
      e3.setAddress("Hyderabad");
      e3.setId(003);

      emp e4=new emp();
      e4.setName("omar2");
      e4.setAge(21);
      e4.setSalary(300002);
      e4.setAddress("Hyderabad2");
      e4.setId(001);
	
      emp e5=new emp();
	
      e5.setName("ram2");
      e5.setAge(32);
      e5.setSalary(400002);
      e5.setAddress("Hyderabad2");
      e5.setId(002);
	
      emp e6=new emp();
	
      e6.setName("robbin2");
      e6.setAge(25);
      e6.setSalary(350002);
      e6.setAddress("Hyderabad2");
      e6.setId(003);
	
      //Instantiate DatumWriter class
      DatumWriter<emp> empDatumWriter = new SpecificDatumWriter<emp>(emp.class);
      DataFileWriter<emp> empFileWriter = new DataFileWriter<emp>(empDatumWriter);
	
      empFileWriter.create(e1.getSchema(), new File("/path/to/avrofiles/avrofilegeneratedfrom1.8.2tocompressin1.11.1.avro"));
	
      empFileWriter.append(e1);
      empFileWriter.append(e2);
      empFileWriter.append(e3);
      empFileWriter.append(e4);
      empFileWriter.append(e5);
      empFileWriter.append(e6);
	
      empFileWriter.close();
      String version = Schema.class.getPackage().getImplementationVersion();
      System.out.println("Apache Avro version: " + version);
      System.out.println("avro file generated succesfully");
   }
}
