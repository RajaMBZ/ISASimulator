package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {
    public static void main(String[] args) {
        int memoryAddress[];
        memoryAddress = new int[16];
        int registersArray[];
        registersArray = new int[16];
        
        //For dummy memory addresses allocation
        for (int temp = 10, count = 0; temp<=160; temp+=10, ++count){
            memoryAddress[count] = temp;
        }
        //for registers
        for (int temp = 10, count = 0; temp<=160; temp+=10, ++count){
            registersArray[count] = 0;
        }
        
        Scanner input = new Scanner (System.in);
        System.out.println("How many instructions would you like to give? (Input an integer value)");
        int total = input.nextInt();
        input.nextLine();
        
        for(int counting = 0; counting<total; ++counting){

            System.out.println("\nEnter instruction no."+(counting+1)+" type: 'Load', 'Add', or 'Store'...");
            String ask = input.nextLine();

            if ("Load".equals(ask)){
                System.out.print("Operand # 1: Register Number R");
                int regNo = input.nextInt();
                System.out.print("\nOperand # 2: Memory Address M");
                int memAdd = input.nextInt();
                System.out.println("************ISA Simulator************");
                System.out.println("************Cycle #1************");
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("1\t"+regNo+"\t"+memAdd);
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
            
                System.out.println("\n\n************Cycle #2************");
            
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("1\t"+regNo+"\t"+memAdd+"\t\tLOAD R"+regNo+" with M"+memAdd);
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
                System.out.println("\n\n************Cycle #3************");
                registersArray[regNo] = memoryAddress[memAdd];
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("1\t"+regNo+"\t"+memAdd+"\t\tLOAD R"+regNo+" with M"+memAdd+"\t\t\t Register updated!");
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
                System.out.println("");
                }
            else if("Add".equals(ask)){
                System.out.print("Operand # 1: Register Number R");
                int regNo = input.nextInt();
                System.out.print("\nOperand # 2: Register Number R");
                int regNoTwo = input.nextInt();
            
                System.out.println("************ISA Simulator************");
                System.out.println("************Cycle #1************");

                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("1\t"+regNo+"\t"+regNoTwo);
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }

                System.out.println("\n\n************Cycle #2************");

                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("1\t"+regNo+"\t"+regNoTwo+"\t\tADD R"+regNo+" with R"+regNoTwo);
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
                System.out.println("\n\n************Cycle #3************");
                registersArray[regNo] = registersArray[regNo]+registersArray[regNoTwo];
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("1\t"+regNo+"\t"+regNoTwo+"\t\tADD R"+regNo+" with R"+regNoTwo+"\t\t\t Register updated!");
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
                System.out.println("");
            }
            else if("Store".equals(ask)){
                System.out.print("Operand # 1: Register Number R");
                int regNo = input.nextInt();
                System.out.print("\nOperand # 2: Memory Address M");
                int memAdd = input.nextInt();
                System.out.println("************ISA Simulator************");
                System.out.println("************Cycle #1************");
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("3\t"+regNo+"\t"+memAdd);
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
            
                System.out.println("\n\n************Cycle #2************");
            
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("3\t"+regNo+"\t"+memAdd+"\t\tLOAD R"+regNo+" with M"+memAdd);
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
                System.out.println("\n\n************Cycle #3************");
                memoryAddress[memAdd] = registersArray[regNo];
                System.out.println("Fetch Instruction\t\tDecode Instruction\t\tExecute Instruction");
                System.out.println("3\t"+regNo+"\t"+memAdd+"\t\tLOAD R"+regNo+" with M"+memAdd+"\t\t\t Memory updated!");
                System.out.println("Register No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(registersArray[count]+"\t");
                }
                System.out.println("\n###############################################################################################################################");
                System.out.println("Memory No:");
                for (int count = 0; count<16; ++count){
                    System.out.print(memoryAddress[count]+"\t");
                }
                System.out.println("");
            }
            input.nextLine();
    }
        
/*        System.out.println("1. Binary to decimal\n2. Hexadecimal to decimal\n3. Decimal to base 2\n4. Decimal to base 16\n5. Binary fraction to decimal\n6. Decimal fraction to binary");
        
        Scanner input = new Scanner (System.in);
        
        int choice = input.nextInt();
        input.nextLine();  // Consume newline left-over
        
        if (choice==1)  {
        
        System.out.println("Enter a number in binary: ");
        
        int currentDigit=0, currentNumber, sum = 0, userInput = input.nextInt();    //taking input of numbers

        char temp;
        
        for (int total = (String.valueOf(userInput).length())-1; total!=-1; --total){    //total numbers entered
            
            temp = (String.valueOf(userInput)).charAt(currentDigit);  //checking which digit is the first one in the number
            currentNumber = Character.getNumericValue(temp);    //converting the first digit into integer type            
            sum = sum + (int) (currentNumber*(Math.pow(2, total))); 
            ++currentDigit;
            
        }
        
        System.out.println("Binary number ("+userInput+")\u2082 is equivalent to "+sum+" in decimal");
        }
        
        if (choice == 2)    {
            
            System.out.println("Enter a number in hexadecimal: ");
            String userStringInput = input.nextLine();    //taking input of numbers
            int currentDigit=0, currentNumber, sum = 0; 
            String temp;
            for (int total = (userStringInput.length())-1; total!=-1; --total){    //total numbers entered
                temp = ""+userStringInput.charAt(currentDigit);  //checking which digit is the first one in the number
                currentNumber = Integer.parseInt(temp, 16);
                sum = sum + (int) (currentNumber*(Math.pow(16, total))); 
                ++currentDigit;            
            }
            System.out.println("Hexadecimal number "+userStringInput+" is equivalent to "+sum+" in decimal");
        }
        
        if (choice==3)  {
            System.out.println("Enter the number in decimal:");
            int x = input.nextInt();
            int remainder, b=x;
           
            String store = "";
        
            while(b>0){

                remainder = b%2;
                b=b/2;
                store = remainder + store;                
            }
            System.out.println("Decimal number "+x+" is equivalent to ("+store+")\u2082 in binary");
        }

        if (choice==4)  {
            System.out.println("Enter the number in decimal:");
            int x = input.nextInt();
            int remainder = 0;
            int b = x;
            String store = "";

        
            while(b>0){

                remainder = b%16;
                //System.out.println("rem:"+remainder);
                //System.out.println(b/2);
                b=b/16;
                
                if (remainder < 10){
                    store = remainder + store;
                } else {
                    switch (remainder){
                        case 10:
                            store = "A" + store;
                            break;
                        case 11:
                            store = "B" + store;
                            break;
                        case 12:
                            store = "C" + store;
                            break;
                        case 13:
                            store = "D" + store;
                            break;
                        case 14:
                            store = "E" + store;
                            break;
                        case 15:
                            store = "F" + store;
                            break;
                    }
                }
            }
            
            System.out.println("Decimal number "+x+" is equivalent to "+store+" in hexadecimal");
            
        }
        
        if (choice == 5)    {
            System.out.println("Enter a 0.x number in binary: ");
            double userInput = input.nextDouble();
            String s = ""+ userInput;
            String temp;
            int tempInt;
            double sum = 0;
            for (int n = s.length()-2, count = 2; n!=0; --n, ++count){
                temp = ""+s.charAt(count);
                tempInt = Integer.parseInt(temp);
                sum = sum + (tempInt*(Math.pow(0.5, count-1)));
            }
            System.out.println("Binary number ("+userInput+")\u2082 is equivalent to "+sum+" in decimal");
        }
        
        if (choice == 6){
            System.out.println("Enter a 0.x number in decimal: ");

            int currentNumber;

            String save = "0.";

            double userInput = input.nextDouble();    //taking input of numbers

            System.out.println("Upto what decimal place?");

            //int n = input.nextInt();

            for (int n = input.nextInt(); n!=0; --n){
                
                if (userInput<1){
                    //System.out.println("less than 1");
                    userInput = userInput * 2;
                } else {
                    //System.out.println("more than 1");
                    userInput = (userInput-1)*2;
                }
                
                currentNumber = (int) (userInput);
                save = save + currentNumber;

            }
            System.out.println(save);
        }
          
        /*        URL url = null;
        try {
            url = new URL("https://www.mannschaftsfoto-nrw.de/rpc/captcha/Ddc3Lp5eOshwmzWfpgL4cNCTnZTcOU2T");
          InputStream in = new BufferedInputStream(url.openStream());
          ByteArrayOutputStream out = new ByteArrayOutputStream();
          byte[] buf = new byte[1024];
          int n = 0;
          while (-1!=(n=in.read(buf)))
          {
            out.write(buf, 0, n);
          }
          out.close();
          in.close();
          byte[] response = out.toByteArray();
          FileOutputStream fos = new FileOutputStream("C://captcha.jpg");
          fos.write(response);
          fos.close();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        System.out.println("");
        String e = "CAPTCHA solving";
        System.out.println(e);
     */   
    }
}

/*
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class JavaApplication29 {

    static String urls = "http://cms.comsats.edu.pk:8092/Assignments/DownloadFile/0048";

    public static void main(String[] args) throws IOException{
        URL url = verify(urls);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream in = null;
        String filename = url.getFile();
        filename = filename.substring(filename.lastIndexOf('/') + 1);
        FileOutputStream out = new FileOutputStream("C:\\Users\\Raja\\Desktop" + File.separator + filename);
        in = connection.getInputStream();
        int read = -1;
        byte[] buffer = new byte[4096];
        while((read = in.read(buffer)) != -1){
            out.write(buffer, 0, read);
            System.out.println("[SYSTEM/INFO]: Downloading file...");
        }
        in.close();
        out.close();
        System.out.println("[SYSTEM/INFO]: File Downloaded!");
    }
    private static URL verify(String url){
        if(!url.toLowerCase().startsWith("http://")) {
            return null;
        }
        URL verifyUrl = null;

        try{
            verifyUrl = new URL(url);
        }catch(Exception e){
            e.printStackTrace();
        }
        return verifyUrl;
    }
}*/
