package org.sample;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadFile
{
    static JSONParser jsonParser = new JSONParser();

    public static void main(String[] args)
    {
        /*String jsonString =  readFileToString("C:\\Users\\dines\\Desktop\\payload\\freeformatter-out-1kb.json");
        System.out.println(jsonString);*/
        Gson gson = new Gson();
        User userObject = createUserObject("3");
        String userJson = gson.toJson(userObject);
        System.out.println(userJson);
    }

    public static String readFileToString(String filePath){
       String jsonString = null;
        try
        {
            Object object = jsonParser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject)object;
            jsonString=jsonObject.toJSONString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return jsonString;
    }

    public static User createUserObject(String size){
        User user = null;
        user = new User();
        user.setFirstName("Mike");
        user.setLastName("Duke");
        user.setAddress(getAddress());
        user.setHobbies(getHobbies(Integer.parseInt(size)));
        return user;
    }

    private static List<Hobby> getHobbies(int parseInt)
    {
        List<Hobby> hobbyList = new ArrayList<>();

        for(int i = 0;i<parseInt; i++){
            hobbyList.add(getHobby());
        }
        return hobbyList;
    }

    private static Hobby getHobby()
    {
        Hobby hobby = new Hobby();
        hobby.setName("Soccer");
        hobby.setTags(getTags());
        return hobby;
    }

    private static List<String> getTags()
    {
        List<String> listOfTag = new ArrayList<>();
        listOfTag.add("Teamsport");
        listOfTag.add("Ball");
        listOfTag.add("Outdoor");
        listOfTag.add("Championship");
        return listOfTag;
    }

    private static Address getAddress()
    {
        Address address = new Address();
        address.setStreet("Mainstreet");
        address.setStreetNumber("1A");
        address.setCity("New York");
        address.setCountry("USA");
        address.setPostalCode(new Long(1337));
        return address;
    }
}
