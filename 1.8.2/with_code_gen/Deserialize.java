//deserialize the data of 1.8.2 version serialized data to check compatibility between 1.8.2 and 1.11.1
import tutorialspoint.com.emp;
import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;

public class Deserialize {
   public static void main(String args[]) throws IOException{
	
      //DeSerializing the objects
      DatumReader<emp> empDatumReader = new SpecificDatumReader<emp>(emp.class);
		
      //Instantiating DataFileReader
      DataFileReader<emp> dataFileReader = new DataFileReader<emp>(new
         File("/path/to/avrofiles/serializedfilefrom1.11.1.avro"), empDatumReader);
      emp em=null;
		
      while(dataFileReader.hasNext()){
      
         em=dataFileReader.next(em);
         System.out.println(em);
      }
      String version = Schema.class.getPackage().getImplementationVersion();
      System.out.println("Apache Avro version: " + version);
   }
}
