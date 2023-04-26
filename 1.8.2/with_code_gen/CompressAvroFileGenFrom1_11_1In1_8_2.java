import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;

import java.io.File;
import java.io.IOException;

public class CompressAvroFileGenFrom1_11_1In1_8_2 {

    public static void main(String[] args) throws IOException {
        // Open the existing Avro file
        File inputFile = new File("/Users/ndv/hadoop/avrofiles/avrofilegeneratedfrom1.11.1tocompressin1.8.2.avro");
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(inputFile, new GenericDatumReader<>());

        // Define schema
        Schema schema = dataFileReader.getSchema();

        // Create a new compressed Avro file
        File outputFile = new File("/Users/ndv/hadoop/avrofiles/CompressedAvroFileGeneratedFrom1.11.1in1.8.2.avro");
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(new GenericDatumWriter<>());
        dataFileWriter.setCodec(CodecFactory.snappyCodec()); // Use snappy compression
        dataFileWriter.create(schema, outputFile);

        // Copy data from input file to output file
        for (GenericRecord record : dataFileReader) {
            dataFileWriter.append(record);
        }

        // Close both files
        dataFileReader.close();
        dataFileWriter.close();
        System.out.println("avro file compressed");
        String version = Schema.class.getPackage().getImplementationVersion();
        System.out.println("Apache Avro version: " + version);
    }
}
