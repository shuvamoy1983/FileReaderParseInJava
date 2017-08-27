/**
 * Created by shuvamoymondal on 8/26/17.
 */

import com.fileReader.*;

public class MainExe {

    public static void main(String args[]) {

        FileJsonReader fl=new FileJsonReader("/Users/shuvamoymondal/jsonReader.json");
        System.out.println("File Name: " + fl.getFileName());
        System.out.println(fl.getFileCompletion());
    }
}
