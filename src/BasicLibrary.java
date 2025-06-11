import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;

public class BasicLibrary {
    public static void main(String[] args) throws Throwable {
        URL url = new URI("https://news.google.com/home?hl=ja&gl=JP&ceid=JP:ja").toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder content = new StringBuilder();

        while ((line = in.readLine()) != null) {
            content.append(line);
        }

        in.close();
        conn.disconnect();

        System.out.println(content.substring(0, Math.min(500, content.length())));
    }
}
