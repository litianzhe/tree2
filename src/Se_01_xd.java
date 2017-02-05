import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2017/1/28.
 */
public class Se_01_xd {
    public static void main(String[] arg){
        Date date1=null;
        String str="2017-01-01";
        Date date2=null;
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
            date1=df.parse(str);
            System.out.println(date1);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        String str1="2017-01-01";
        try {
            date2=(Date) date1.clone();//df.parse(str1);

            System.out.println(date2);

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(date1.equals(date2));
        System.out.println(date1==date2);
       // System.out.println(date);
        String str3="Hello";
        String str4="Hello World";
        str4="Hello";
        System.out.println(str3.equals(""));
        System.out.println(str3==str4);

    }
}
