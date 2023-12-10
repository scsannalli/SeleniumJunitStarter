package util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DriverManager {
    public  static WebDriver driver ;
    public  DriverManager()
    {
    }
    public  void setup() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject urlConfJson = (JSONObject) jsonParser.parse(new FileReader( "src/main/config/urls.json"));
        driver = new ChromeDriver();
        driver.get(urlConfJson.get("BASE_URL").toString());
    }
}
