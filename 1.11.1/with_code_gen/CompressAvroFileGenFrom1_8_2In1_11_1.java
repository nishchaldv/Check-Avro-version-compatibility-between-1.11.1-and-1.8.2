import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;

import java.io.File;
import java.io.IOException;

public class CompressAvroFileGenFrom1_8_2In1_11_1 {

    public static void main(String[] args) throws IOException {
        // Open the existing Avro file
        File inputFile = new File("/Users/ndv/hadoop/avrofiles/avrofilegeneratedfrom1.8.2tocompressin1.11.1.avro");
        DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(inputFile, new GenericDatumReader<>());

        // Define schema
        Schema schema = dataFileReader.getSchema();

        // Create a new compressed Avro file
        File outputFile = new File("/Users/ndv/hadoop/avrofiles/Compressedavrofilegeneratedfrom1.8.2in1.11.1.avro");
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
    }
}
