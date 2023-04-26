//remove one data in 1.8.2 which is added by 1.11.1 version to check compatibility between 1.8.2 and 1.11.1
import tutorialspoint.com.emp;
import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

public class RemoveAdded {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("/path/to/avrofiles/addfrom1111toremoveomar.avro");
        File outputFile = new File("/path/to/avrofiles/addfrom1111toremoveomar_after_removing.avro");

        DatumReader<emp> empDatumReader = new SpecificDatumReader<>(emp.class);
        DataFileReader<emp> empDataReader = new DataFileReader<>(inputFile, empDatumReader);

        DatumWriter<emp> empDatumWriter = new SpecificDatumWriter<>(emp.class);
        DataFileWriter<emp> empDataWriter = new DataFileWriter<>(empDatumWriter);

        empDataWriter.create(empDataReader.getSchema(), outputFile);

        for (emp record : empDataReader) {
            if (!record.getName().toString().equals("omarfrom1.11.1toremove")) {
                empDataWriter.append(record);
            }
        }

        empDataReader.close();
        empDataWriter.close();
        String version = Schema.class.getPackage().getImplementationVersion();
        System.out.println("Apache Avro version: " + version);
        System.out.println("Data successfully removed from input file and written to output file.");
    }
}
