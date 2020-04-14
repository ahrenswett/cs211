package cs211;
/*
Ahren Swett 4/13/2020
thought the "(null != (str.readLine())" was a cool bit of code had to think about it for a minute
Struggling with yes/no loop something is amiss in the way it is reading the "choice" string or the comparator "Y" or "N"
GitHub
https://github.com/ahrenswett/cs211/blob/master/src/main/java/cs211/ReadingURLJSON.java
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadingURLJSON {
//    class var to decide if it should ask user for more input
    private static Boolean askForMoreInput = true;
    private static String country="";
    private static ArrayList<String> countryList;


    private static String prompt(BufferedReader reader, ArrayList<String> list) throws IOException {
        System.out.println("Please enter a country whose Covid19 information you would like to view.");
        String input = reader.readLine();
        if(!list.contains(input)){
           System.out.println("please check your spelling/punctuation no country found");
        }
        return input;
    }


    public static void main(String[] args) throws Exception {
        StringBuilder builder = new StringBuilder();
        countryList = new ArrayList<>();
        //              get user input
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            URL url = new URL("https://pomber.github.io/covid19/timeseries.json");

            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str = "";
            while (null != (str = br.readLine())) {
                builder.append(str + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        Read each line of the country text and save it to the ArrayList
        BufferedReader countryReader = new BufferedReader(new FileReader("country.txt"));
//        make sure the next line is not null then add the country to the ArrayList
        while (null != (country = countryReader.readLine())) {
            countryList.add(country);
        }


//        figure out what country to query

        while (askForMoreInput == true) {
            country = prompt(userInput, countryList);
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(builder.toString());
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray virus = (JSONArray) jsonObject.get(country);

            System.out.println(country);

            if (virus != null) {
                Iterator it = virus.iterator();
                int tot = 0;
                while (it.hasNext()) {
                    JSONObject daily = (JSONObject) it.next();
                    System.out.println();
                    System.out.println("date: " + daily.get("date"));
                    System.out.println("confirmed: " + daily.get("confirmed"));
                    System.out.println("deaths: " + daily.get("deaths"));
                    System.out.println("recovered: " + daily.get("recovered"));
                }
            }
//            askAgain();
        }
    }


    private static void askAgain() throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Would you like information on another country? please enter Y or N");
        String choice = userInput.readLine();

//        TODO: Figure out why this is an endless loop
        while(!choice.equalsIgnoreCase("Y") || !choice.equalsIgnoreCase("N")){
            System.out.println("Would you like information on another country? please enter Y or N");
            choice = userInput.readLine().toUpperCase();
        }

//        take care of the users choice
        if (choice.toUpperCase() == "Y"){
            prompt(userInput,countryList);
        }else{
            askForMoreInput = false;
        }
    }

}
