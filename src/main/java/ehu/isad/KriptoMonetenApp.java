package ehu.isad;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class KriptoMonetenApp {

    public static float zenbatBalioDu(String pTxanpon){

        float zenbatBalioDu = 0;
        String inputLine = "";
        URL coinmarket;


        try{
            coinmarket = new URL( "https://api.gdax.com/products/"
                    + pTxanpon + "-eur/ticker");
            URLConnection yc = coinmarket.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()) );
            inputLine = in.readLine();
            //System.out.println(inputLine);
            Gson gson = new Gson();
            Txanpona txanpona = gson.fromJson(inputLine, Txanpona.class);
            in.close();
            zenbatBalioDu = txanpona.price;
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch (IOException e){

            e.printStackTrace();
        }

        return zenbatBalioDu;
    }
}
