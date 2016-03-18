package com.company;

/**
 * Created by John on 2/16/2016.
 */
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPostForm
{
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL( "http://www.aaaa.com/xyz.asp" );

            HttpURLConnection hConnection = (HttpURLConnection)
                    url.openConnection();
            HttpURLConnection.setFollowRedirects( true );

            hConnection.setDoOutput( true );
            hConnection.setRequestMethod("POST");

            PrintStream ps = new PrintStream( hConnection.getOutputStream() );
            ps.print("param1=abcd&amp;param2=10341");
            ps.close();

            hConnection.connect();

            if( HttpURLConnection.HTTP_OK == hConnection.getResponseCode() )
            {
                InputStream is = hConnection.getInputStream();
                OutputStream os = new FileOutputStream("output.html");
                int data;
                while((data=is.read()) != -1)
                {
                    os.write(data);
                }
                is.close();
                os.close();
                hConnection.disconnect();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}