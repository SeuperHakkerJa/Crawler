import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class Bot {
  String start_url;


  public Bot(String start_url) {

    setUrl(start_url);


  }

  public void start() {

    String html = getHTML(getStart_url());
    System.out.println(html);

  }

  private String getHTML(String url) {

    URL u;


    try {
      u = new URL(url);

      URLConnection urlConnection = u.openConnection();

      //urlConnection.setRequestProperty("User-Agent", "BOT/1.0");
      //urlConnection.setRequestProperty("Accept-Charset", "UTF-8");
      InputStream input = urlConnection.getInputStream();
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));

      String line;
      String html = "";

      while ((line = reader.readLine()) != null){
        html += line + "" + "\n";

      }

      html = html.trim();
      return  html;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }


  private void setUrl(String url) {

    this.start_url = url;

  }


  public String getStart_url() {

    return this.start_url;

  }


}
