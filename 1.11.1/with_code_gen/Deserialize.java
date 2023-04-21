//Deserialize the data in 1.11.1 version which is serialized in 1.8.2 version to check compatibility between 1.8.2 and 1.11.1
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
         File("/path/to/avrofiles/serializedfrom1.8.2.avro"), empDatumReader);
      emp em=null;
		
      while(dataFileReader.hasNext()){
      
         em=dataFileReader.next(em);
         System.out.println(em);
      }
   }
}