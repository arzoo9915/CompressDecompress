/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ARZOO GOYAL
 */
public class Compress {
    public static void method(File file) throws IOException
    {
        String fileDirectory=file.getParent();//get directory to get path
        System.out.println(fileDirectory);
       
        FileInputStream fis=new FileInputStream(file); //taking input file
        FileOutputStream fos=new FileOutputStream(fileDirectory+"\\Compressedfile.gz"); //new file
        
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos); //compress and output
        byte[] buffer=new byte[1024];  
        int len;
        while((len=fis.read(buffer))!=-1)  //read and tranfer to buffer array
        {
            gzipOS.write(buffer, 0, len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
       
    }
    public static void main(String[] args) throws IOException{
       File path=new File("C:\\Users\\ARZOO GOYAL\\Documents\\NetBeansProjects\\compressDecompres\\src\\project\\testfile.txt");
       method(path);
    }
}
