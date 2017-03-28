package Lesson10.by.rdcentre.javatr.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/**
 * Created by Denis on 27.03.2017.
 */
public class FileReaderRegExp {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String sLine = "";
        String sXML = "";

        try {
            fr = new FileReader("d:\\source10.xml"); // put XML file there before running the app
            br = new BufferedReader(fr);

            while ((sLine = br.readLine()) != null) {
                sXML = sXML + sLine;
            }
            //System.out.println(sXML);

            Pattern regex = Pattern.compile("<([^<>]+)>([^<>]+)</([^<>]+)>|<([a-z-\\s=\\d\"]+)>|</([a-z]+)>");
            Matcher matcher = regex.matcher(sXML);
            List<String> list = new ArrayList();

            while (matcher.find()) {
              //  System.out.println(" 1:" + matcher.group(1) +
              //          " 2:" + matcher.group(2) +
              //          " 3:" + matcher.group(3) +
              //          " 4:" + matcher.group(4) +
              //          " 5:" + matcher.group(5)
               // );
                if (matcher.group(1) != null){
                    //System.out.println(matcher.group(1));
                    list.add(matcher.group(1));
                }
                if (matcher.group(2) != null){
                    //System.out.println(matcher.group(2));
                    list.add(matcher.group(2));
                }
                if (matcher.group(3) != null){
                    //System.out.println(matcher.group(3));
                    list.add(matcher.group(3));
                }
                if (matcher.group(4) != null){
                    //System.out.println(matcher.group(4));
                    list.add(matcher.group(4));
                }
                if (matcher.group(5) != null){
                    //System.out.println(matcher.group(5));
                    list.add(matcher.group(5));
                }
            }
            for(String node : list){
                System.out.println(node);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }

