## Check Avro version compatibility between version 1.11.1 and version 1.8.2

### In serialization and deserialization 
Serialize the Serialize.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and deserailize using deserailize.java file in 1.11.1/with_code_gen folder. 

Serialize the Serialize.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and deserailize using deserailize.java file in 1.8.2/with_code_gen folder. 

### In adding and removing data 
Add the data in Addtoremove.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and remove the data using RemoveAdded.java file in 1.11.1/with_code_gen folder. 

Add the data in Addtoremove.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and remove the data using RemoveAdded.java file in 1.8.2/with_code_gen folder.

### In adding and readding data 
Add the data in AddData.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and readd the data using ReAddData.java file in 1.11.1/with_code_gen folder. 

Add the data in AddData.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and readd the data using ReAddData.java file in 1.8.2/with_code_gen folder.

### In Schema evolution 
Add the data in SchemaEvolCheckfrom8_2.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and change the schema using SchemaEvolCheckin11_1from8_2.java file in 1.11.1/with_code_gen folder. 

Add the data in SchemaEvolCheckfrom11_1.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and change the schema using SchemaEvolCheckin8_2from11_1.java file in 1.8.2/with_code_gen folder.

### In converting avro file to json

Generate the avro file using GenAvroFileToConToJsonIn1_8_2.java file in 1.8.2/with_code_gen folder and output file avro will be saved in avrofiles folder take that avrofile and convert it to json using ConvertAvrofrom1_8_2tojsonin1_11_1.java file in 1.11.1/with_code_gen folder. 

Generate the avro file using GenAvroFileToConToJsonIn1_11_1.java file in 1.11.1/with_code_gen folder and output file avro will be saved in avrofiles folder take that avrofile and convert it to json using ConvertAvrofrom1_11_1tojsonin1_8_2.java file in 1.8.2/with_code_gen folder.

### In Compressing avro file

Generate the avro file using GenAvroFileIn1_8_2ToCompressin1_11_1.java file in 1.8.2/with_code_gen folder and output file avro will be saved in avrofiles folder take that avrofile and compress the generated avro file using CompressAvroFileGenFrom1_8_2In1_11_1.java file in 1.11.1/with_code_gen folder. 

Generate the avro file using GenAvroFileIn1_11_1ToCompressin1_8_2.java file in 1.8.2/with_code_gen folder and output file avro will be saved in avrofiles folder take that avrofile and compress the generated avro file using CompressAvroFileGenFrom1_11_1In1_8_2.java file in 1.11.1/with_code_gen folder. 

