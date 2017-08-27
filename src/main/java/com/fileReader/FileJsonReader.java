package com.fileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by shuvamoymondal on 8/26/17.
 */
public class FileJsonReader implements Serializable {


    String file;
    String msg;
    FileJsonReader() {

    }
       public  FileJsonReader(String file) {
          this.file =file;
          JsonFileParser(this.file);

          }

         public String getFileName() {
          return file;
         }

         public void setFileName(String file) {

          this.file=file;
         }

         public String getFileCompletion() {
         return msg;
         }

         public void setFileCompletion(String msg) {
          this.msg=msg;
         }


         public void JsonFileParser(String s) {

            JSONParser parser = new JSONParser();

             try {
                 //Read the JSON file and parse
                 Object obj =parser.parse(new FileReader(this.file));
                 //Converted to JSON data type
                 JSONObject jsonObject= (JSONObject) obj;

                 String Name = (String) jsonObject.get("Name");
                 String Author= (String) jsonObject.get("Author");
                 System.out.println(jsonObject);
                 System.out.println(Name);
                 JSONArray list = (JSONArray) jsonObject.get("Company List");

                 Iterator<String> itr =list.iterator();
                 while(itr.hasNext()) {
                     System.out.println(itr.next());
                 }
             }
             catch (Exception e) {
                 e.printStackTrace();
             }

          this.file=s;




          setFileCompletion("File Read and Parse are done");


         }

}
