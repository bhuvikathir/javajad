
package com.simplilearn.assessment;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileHandling {
public static void main(String[] args) throws IOException {
String path= "F:\\javajad\\";
System.out.println("Welcome to file handling project"+'\n'+"Done by Bhuvaneswari");
Scanner sc= new Scanner(System.in);
System.out.println("Enter the option that need to be executed");
System.out.println('\n'+"1.List of files"+'\n'+"2.Suboption--> Handling files in Different ways"+'\n'+"3.Exit");
int option= sc.nextInt();
switch(option)
{
case 1:

File f= new File(path);
File filenames[]=f.listFiles();
for(File ff:filenames)
{
System.out.println(ff.getName());
}
break;
case 2:

System.out.println("Enter the option that need to be executed");
System.out.println('\n'+"1.Add a File"+'\n'+"2.Delete a File"+'\n'+"3.Search a file"+'\n'+"4.Exit");
int selection= sc.nextInt();

switch(selection)
{
case 1:
System.out.println("Addition of a file");

System.out.println("enter the file in the directory of "+ path);
String filename=sc.next();
File ad= new File(path+filename);



boolean add= ad.createNewFile();
if(add!=true)
{
System.out.println("file not created");
}
else {
System.out.println("file created in the path"+path);
}




break;
case 2:

System.out.println("Enter the file to be deleted");
String deletefile=sc.next();
File g= new File(path+deletefile);
boolean delete= g.delete();
if(delete==true) {
System.out.println("File has been deleted");

}
else {
System.out.println("File cannot be found");
}
break;
        case 3:

        System.out.println("Enter the file to be found");
        String searchfile=sc.next();
        File a= new File(path);
       
        int flag=0;
        File searchfiles[]=a.listFiles();
        for(File ff:searchfiles)
        {
        if(ff.getName().equals(searchfile)) {
        flag=1;
        break;
        }
        else
        {
        flag=0;
       
        }
        }
        if(flag==1)
        {
        System.out.println("File found on the directory");
        }
        else
        {
        System.out.println("file not found on the directory");
        }
break;

case 4:
System.exit(0);

default:
System.out.println("Enter the correct value");
}
break;

case 3:
System.exit(0);

default:
System.out.println("Enter the correct value");
}
sc.close();



}
}

