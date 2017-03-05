
import javax.net.ssl.HttpsURLConnection;
import java.io.*;

import java.net.URL;
import java.net.URLConnection;

class Machine {

    private String rawStats;

    Machine()
    {
        rawStats = "";
    }

    //updates raw stats and returns them
    String updateStats(String userName, String userID ) {
        try {
            BufferedReader in;

            URL url = new URL(constructURL(userName, userID));
            URLConnection uc = url.openConnection();
            uc.addRequestProperty("User-Agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
            HttpsURLConnection con = (HttpsURLConnection) uc;

            in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            rawStats = in.readLine();
        }
		
        catch(IOException e){
            //check this is right
            System.out.println("There is no such a userID. Sorry");
			// System.out.println();
            // e.printStackTrace();
        }
		
        return rawStats;
    }

    String getRawStats() {
        return rawStats;
    }

    private String constructURL(String userName, String userID )
    {
        return "https://owapi.net/api/v3/u/" + userName + "-" + userID + "/stats";
    }


}
