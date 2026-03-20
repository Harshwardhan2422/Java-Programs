import java.util.*;
import java.io.*;

class Program401
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Choice");
        System.out.println("1 : Packing");
        System.out.println("2 : Unpacking");

        int choice = sobj.nextInt();
        sobj.nextLine();

        // ================= PACKING =================
        if(choice == 1)
        {
            System.out.println("Enter The Directory That You Want To Open");
            String DirName = sobj.nextLine();

            System.out.println("Enter The Name of Packed File That You Want To Create");
            String PackName = sobj.nextLine();

            File fobj = new File(DirName);
            File pobj = new File(PackName);

            if(!fobj.exists() || !fobj.isDirectory())
            {
                System.out.println("Directory is not Present");
                return;
            }

            File Arr[] = fobj.listFiles();
            FileOutputStream fos = new FileOutputStream(pobj);

            if(Arr != null)
            {
                for(int i = 0; i < Arr.length; i++)
                {
                    if(Arr[i].isFile() && Arr[i].getName().endsWith(".txt"))
                    {
                        String header = Arr[i].getName() + " " + Arr[i].length() + "\n";
                        header = header.trim();

                        fos.write(header.getBytes());

                        FileInputStream fis = new FileInputStream(Arr[i]);
                        byte buffer[] = new byte[1024];
                        int byteRead = 0;

                        while((byteRead = fis.read(buffer)) != -1)
                        {
                            fos.write(buffer, 0, byteRead);
                        }

                        fis.close();
                    }
                }
            }

            fos.close();
            System.out.println("Packing Created Successfully");
        }

        // ================= UNPACKING =================
        else if(choice == 2)
        {
            System.out.println("Enter Packed File Name");
            String PackName = sobj.nextLine();

            FileInputStream fis = new FileInputStream(PackName);

            File folder = new File("Unpacked");
            folder.mkdir();

            while(true)
            {
                String header = "";
                int ch;

                while((ch = fis.read()) != -1)
                {
                    if(ch == '\n')
                    {
                        break;
                    }
                    header = header + (char)ch;
                }

                if(header.length() == 0)
                {
                    break;
                }

                header = header.trim();

                String parts[] = header.split(" ");

                String fileName = parts[0];
                String sizeString = parts[1];

                sizeString = sizeString.trim();


                int fileSize = Integer.parseInt(sizeString);

                byte buffer[] = new byte[fileSize];
                fis.read(buffer, 0, fileSize);

                FileOutputStream fos = new FileOutputStream("Unpacked/" + fileName);
                fos.write(buffer);
                fos.close();
            }

            fis.close();
            System.out.println("Unpacking Completed Successfully");
        }
    }
}