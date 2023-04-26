import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import tutorialspoint.com.emp;

public class ConvertAvrofrom1_8_2tojsonin1_11_1 {

    public static void main(String[] args) {
        // Open the Avro file
        File avroFile = new File("/Users/ndv/hadoop/avrofiles/AvroFileGenIn1_8_2ToConvertToJsonin1_11_1.avro");
        DatumReader<emp> empDatumReader = new SpecificDatumReader<>(emp.class);
        DataFileReader<emp> dataFileReader;
        try {
            dataFileReader = new DataFileReader<>(avroFile, empDatumReader);
        } catch (IOException e) {
            System.err.println("Failed to open Avro file: " + e.getMessage());
            return;
        }
        
        // Convert each record to JSON and write it to a file
        emp empRecord;
        try {
            FileWriter writer = new FileWriter("/Users/ndv/hadoop/avrofiles/JsonGeneratedFromAvro1_8_2filein1_11_1.json");
            while (dataFileReader.hasNext()) {
                empRecord = dataFileReader.next();
                writer.write(empRecord.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Failed to write JSON file: " + e.getMessage());
            return;
        }
        
        // Close the Avro file
        try {
            dataFileReader.close();
        } catch (IOException e) {
            System.err.println("Failed to close Avro file: " + e.getMessage());
        }
        String version = Schema.class.getPackage().getImplementationVersion();
        System.out.println("Apache Avro version: " + version);
    }
}

