package cn.coolbbs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("C:\\Users\\29203\\Desktop\\01、钻孔桩.exe");
        FileOutputStream f2 = new FileOutputStream("C:\\Users\\29203\\Desktop\\钻孔桩.mp4");
        int i;
        byte[] bys=new byte[1024];
        while ((i=f1.read(bys))!=-1) {
            f2.write(bys, 0, i);
        }

        f1.close();
        f2.close();
    }
}
