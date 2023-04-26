## Check Avro version compatibility between version 1.11.1 and version 1.8.2

### Check compatibility between serialization and deserialization between version 1.11.1 and version 1.8.2 
Serialize the Serialize.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and deserailize using deserailize.java file in 1.11.1/with_code_gen folder. 

Serialize the Serialize.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and deserailize using deserailize.java file in 1.8.2/with_code_gen folder. 

### Check compatibility in adding and removing data between version 1.11.1 and version 1.8.2 
Add the data in Addtoremove.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and remove the data using RemoveAdded.java file in 1.11.1/with_code_gen folder. 

Add the data in Addtoremove.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and remove the data using RemoveAdded.java file in 1.8.2/with_code_gen folder.

### Check compatibility in adding and readding data between version 1.11.1 and version 1.8.2 
Add the data in AddData.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and readd the data using ReAddData.java file in 1.11.1/with_code_gen folder. 

Add the data in AddData.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and readd the data using ReAddData.java file in 1.8.2/with_code_gen folder.

### Check compatibility in Schema evolution between version 1.11.1 and version 1.8.2 
Add the data in SchemaEvolCheckfrom8_2.java file in 1.8.2/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and change the schema using SchemaEvolCheckin11_1from8_2.java file in 1.11.1/with_code_gen folder. 

Add the data in SchemaEvolCheckfrom11_1.java file in 1.11.1/with_code_gen folder and output file will be saved in avrofiles folder take that avrofile and change the schema using SchemaEvolCheckin8_2from11_1.java file in 1.8.2/with_code_gen folder.

### Check compatibility for converting avro file to json between version 1.11.1 and version 1.8.2 

Generate the avro file using schema in GenAvroFileToConToJsonIn1_8_2.java file in 1.8.2/with_code_gen folder and output file avro will be saved in avrofiles folder take that avrofile and convert it to json using ConvertAvrofrom1_8_2tojsonin1_11_1.java file in 1.11.1/with_code_gen folder. 

Generate the avro file using schema in GenAvroFileToConToJsonIn1_11_1.java file in 1.11.1/with_code_gen folder and output file avro will be saved in avrofiles folder take that avrofile and convert it to json using ConvertAvrofrom1_11_1tojsonin1_8_2.java file in 1.8.2/with_code_gen folder.
