package unit10;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�) {@code @Date:2022/12/10 9:41}
 * @File: S2.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
import java.io.*;

public class S2 {

    public static void main(String[] args) {

        File file=new File("src\\unit10\\S2.java");

        File tempFile=new File("src\\unit10\\temp.txt");

        try{
            FileReader  inOne=new FileReader(file);

            BufferedReader inTwo= new BufferedReader(inOne);

            FileWriter  tofile=new FileWriter(tempFile);

            BufferedWriter out= new BufferedWriter(tofile);

            String s=null;

            int i=0;

            s=inTwo.readLine();

            while(s!=null) {

                i++;

                out.write(i+" "+s);

                out.newLine();

                s=inTwo.readLine();

            }

            inOne.close();

            inTwo.close();

            out.flush();

            out.close();

            tofile.close();

        }

        catch(IOException ignored){}

    }

}
