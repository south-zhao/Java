package unit10;
import java.io.*;
import java.util.Arrays;

public class Example10_2 {
    public static void main(String[] args) {
        File dirFile = new File(".");
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        String[] fileName = dirFile.list(fileAccept);
        System.out.println(Arrays.toString(fileName));
        assert fileName != null;
        for (String name:fileName) {
            System.out.println(name);
        }
    }
}

class FileAccept implements FilenameFilter {
    private String extendName;
    public void setExtendName(String s) {
        extendName = "." + s;
    }
    public boolean accept(File dir, String name) {
        return name.endsWith(extendName);
    }
}
