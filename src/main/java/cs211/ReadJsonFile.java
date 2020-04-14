package ReadJsonFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class ReadJsonFile {
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        String country="Hungary";

        try {
            Object obj = jsonParser.parse(new FileReader("covid19.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray virus = (JSONArray)jsonObject.get(country);
            System.out.println(country);

            if (virus!=null) {
                Iterator it = virus.iterator();
                while (it.hasNext()) {
                    JSONObject daily = (JSONObject)it.next();
                    System.out.println("date: "+daily.get("date"));
                    System.out.println("confirmed: "+daily.get("confirmed"));
                    System.out.println("deaths: "+daily.get("deaths"));
                    System.out.println("recovered: "+daily.get("recovered"));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
    }




}
