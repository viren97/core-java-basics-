import java.io.IOException;
import java.io.*;

import org.apache.commons.net.ftp.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPConnectionClosedException; 
class FinalProject 
{
	public static void main(String args[]) throws IOException
  {  
  try
     {
	  
	  String usrname,pwd,host;
	  FTPClient ftpClient=new FTPClient ();
	  boolean status;
	  int choice=0;
      InputStreamReader obj=new InputStreamReader(System.in);
	  BufferedReader din=new BufferedReader(obj);
	  System.out.println("******WELCOME******");
	  System.out.println("");
	   System.out.println("");
	  System.out.println("Enter login details to proceed:");
	  System.out.println("Enter host name:");
	  host=(String)din.readLine();
	  System.out.println("Enter username:");
	  usrname=(String)din.readLine();
	  System.out.println("Enter password:");
	  pwd=(String)din.readLine();
	  
                        ftpClient.connect(host);
						status = ftpClient.login(usrname, pwd);
						if (status == true) 
						{
                                System.out.println("User logged in successfully !");
								
								
                        } 
						else 
						{
                                System.out.println("Login failed !");
                                return;
                        }
	   
	   while(choice!=10)
	   {
	   System.out.println("");
	   System.out.println("");
	   System.out.println("******MENU******");
	   System.out.println("1) Check All Files and Directories on your Server");
	   System.out.println("2) Check Size (in bytes) of all Files and Directories on your Server ");
	   System.out.println("3) Create a Directory/Folder on your Server");
	   System.out.println("4) Delete a Directory/Folder on your Server");
	   System.out.println("5) Delete a file present on your Server");
	   System.out.println("6) Rename a file present on your Server");
	   System.out.println("7) Check if a particular File is present on your Server");
	   System.out.println("8) Upload a file on Server from your Machine");
	   System.out.println("9) Download a file from your Server to Machine");
	   System.out.println("10) EXIT");
	   System.out.println("");
	   System.out.println("");
	   System.out.println("Kindly Enter any choice from above options:");
	   choice=Integer.parseInt(din.readLine());
	   
	   switch(choice)
	   {
		   case 1:
		         System.out.println("");
	              System.out.println("");
		        FTPFile[] files = ftpClient.listFiles();
                System.out.println("Files and directories on Ftp Server directory : ");
                for (FTPFile file : files) 
                {
                        System.out.println(file.getName());
	            }
				break;
		   case 2:
		                 System.out.println("");
	                     System.out.println("");
		                 files = ftpClient.listFiles();
                        System.out.println("Files and their size on Ftp Server : ");
                        for (FTPFile file : files) 
						{
                       
                             System.out.print("File name : " + file.getName());
                             System.out.print("  size : " + file.getSize() + " Bytes");
                             System.out.println();
                        
                        }
						break;
		   case 3:
		          System.out.println("");
	              System.out.println("");
				  System.out.println("");
	              System.out.println("");
		         files = ftpClient.listFiles();
                System.out.println("Files and directories on Ftp Server directory : ");
                for (FTPFile file2 : files) 
                {
                        System.out.println(file2.getName());
	            }
		         System.out.println("Enter name of the Directory you want to create on your server:");
				 String newdir=din.readLine();
		         status = ftpClient.makeDirectory(newdir);
				 if (status == true) 
				 {
					 System.out.println("New Directory is created on Ftp Server!");
                 }
			    else
			     {
                        System.out.println("Unable to create new directory!");
                 }
				 break;
		  case 4:
		               System.out.println("");
	                   System.out.println("");
					   System.out.println("");
	              System.out.println("");
		         files = ftpClient.listFiles();
                System.out.println("Files and directories on Ftp Server directory : ");
                for (FTPFile file3 : files) 
                {
                        System.out.println(file3.getName());
	            }
		               System.out.println("Enter name of the directory you wish to delete:");
					   String dirToRemove = din.readLine();
					   boolean deleted = ftpClient.removeDirectory(dirToRemove);
                        if (deleted)
					    {
                        System.out.println("The directory was removed successfully.");
                        } 
						else 
						{
                                System.out.println("File cannot be deleted.");
                        }
						break;
		  case 5:
		           System.out.println("");
	               System.out.println("");
				   System.out.println("");
	              System.out.println("");
		      files = ftpClient.listFiles();
                System.out.println("Files and directories on Ftp Server directory : ");
                for (FTPFile file4 : files) 
                {
                        System.out.println(file4.getName());
	            }
		           System.out.println("Enter the name of file you want to delete:");
				   String fileToRemove = din.readLine();
				   deleted = ftpClient.deleteFile(fileToRemove);
                        if (deleted) 
						{
                                System.out.println("File is removed successfully.");
                        } else 
						{
                                System.out.println("File does not exist.");
                        }
						break;
		 case 6:
		                System.out.println("");
	                    System.out.println("");
						System.out.println("");
	              System.out.println("");
		        files = ftpClient.listFiles();
                System.out.println("Files and directories on Ftp Server directory : ");
                for (FTPFile file5 : files) 
                {
                        System.out.println(file5.getName());
	            }
						System.out.println("Enter the name of file you wish to rename");
						String oldname=din.readLine();
						System.out.println("Enter the new name of the file:");
						String newname=din.readLine();
					    status = ftpClient.rename(oldname,newname);
                        if (status == true)
                        {
                                System.out.println("File renamed !");
                        } 
                        else
                        {
                                System.out.println("File renaming failed ");
                        }
						break;
		case 7:
		         System.out.println("");
	             System.out.println("");
		        files = ftpClient.listFiles();
                int flag = 0;
				System.out.println("Enter the file name you wish to search:");
                String checkFile = din.readLine();
                System.out.println("Checking file existence on the server ... ");
                for (FTPFile file : files) {
                        String fileName = file.getName();
                        if (fileName.equals(checkFile)) 
						{
                                flag = 1;
                                break;
                        } 
						else
					    {
                                flag = 0;
                        }
                }

                if (flag == 1) {
                        System.out.println("File exists on FTP server. ");
                } 
                else 
				{
                System.out.println("Sorry! your file is not presented on Ftp server.");
                }
				break;
		case 8:
		               System.out.println("");
					   System.out.println("");
					   ftpClient.changeWorkingDirectory("/");
					   System.out.println("Kindly Enter the adress of the file to be upoaded:..for ex file named tcs.text exists on desktop thus C:/Users/Umang/Desktop/tcs.txt ");
					   String upldfile=din.readLine();
					   File file = new File(upldfile);
                       String testName = file.getName();
                       FileInputStream fis = new FileInputStream(file);
					   // Upload file to the ftp server
                       status= ftpClient.storeFile(testName, fis);

                        if (status == true)
						{
                                System.out.println("File is uploaded successfully");
                        } 
						else 
						{
                                System.out.println("File uploading failed");
                        }  
						break;
		case 9:
		        System.out.println("");
	            System.out.println("");
		        files = ftpClient.listFiles();
                System.out.println("Files and directories on Ftp Server directory : ");
                for ( FTPFile file1 : files) 
                {
                        System.out.println(file1.getName());
	            }
				 System.out.println("Kindly enter file name you wish to download:");
				 String fileName = din.readLine();;
                 FileOutputStream fos = new FileOutputStream(fileName);

                 // Download file from the ftp server
                        status = ftpClient.retrieveFile(fileName, fos);

                        if (status == true) {
                                System.out.println("File downloaded successfully !");
                        } 
						else 
						{
                                System.out.println("File downloading failed !");
                        }
						break;
		 case 10:
		          System.exit(0);
	     default:
		         System.out.println("");
				 System.out.println(""); 
		         System.out.println("Enter valid choice");
		}
	}
}
catch (FTPConnectionClosedException e)
	   {
                        System.err.println(e);
       } 
	  finally
				{
                        try 
						{
							    FTPClient ftpClient=new FTPClient ();
							    
                                ftpClient.disconnect();
                        }
						catch (FTPConnectionClosedException e) 
						{
                                System.err.println(e);
                        }
                }
}
}