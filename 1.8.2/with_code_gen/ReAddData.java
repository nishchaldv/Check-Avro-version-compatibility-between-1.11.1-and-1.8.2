//Read the data in the 1.8.2 version, which contains the data added by the 1.11.1 version in the Avro files to check compatibility between 1.8.2 and 1.11.1
import tutorialspoint.com.emp;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.Schema;

public class ReAddData {
   public static void main(String args[]) throws IOException {
	
      // Creating values according to the schema
      emp e1 = new emp();
      e1.setName("omarfrom1.8.2");
      e1.setAge(21);
      e1.setSalary(30000);
      e1.setAddress("Hyderabadfrom1.8.2");
      e1.setId(001);
	
      emp e2 = new emp();
      e2.setName("ramfrom1.8.2");
      e2.setAge(30);
      e2.setSalary(40000);
      e2.setAddress("Hyderabadfrom1.8.2");
      e2.setId(002);
	
      emp e3 = new emp();
      e3.setName("robbinfrom1.8.2");
      e3.setAge(25);
      e3.setSalary(35000);
      e3.setAddress("Hyderabadfrom1.8.2");
      e3.setId(003);

      // Instantiating DatumWriter class
      DatumWriter<emp> empDatumWriter = new SpecificDatumWriter<emp>(emp.class);
      DataFileWriter<emp> empFileWriter = new DataFileWriter<emp>(empDatumWriter);

      File file = new File("/path/to/avrofiles/addingfrom1.11.1.avro");
      empFileWriter.appendTo(file);
	
      // Write new data to the file
      empFileWriter.append(e1);
      empFileWriter.append(e2);
      empFileWriter.append(e3);
	
      empFileWriter.close();
      String version = Schema.class.getPackage().getImplementationVersion();
      System.out.println("Apache Avro version: " + version);
      System.out.println("data successfully serialized in 1.8.2");
   }
}
