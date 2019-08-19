package interviwe;

import java.io.*;
import java.util.Scanner;

/**
 * @author Jackwon
 * @date 2019/8/15-8:50
 */
public class encryption {




        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.print("Input file: ");
                String inFile = in.next();
                System.out.print("Output file: ");
                String outFile = in.next();
                System.out.print("Encryption key: ");
                int key = in.nextInt();
                Encryptor crypt = new Encryptor(key);
                crypt.encryptFile(inFile, outFile);

            } catch (IOException e) {
                System.out.println("Error processing file : " + e);
            }

        }
    }
/*
 * 凯撒密码的实现
 */


class Encryptor {
    private int key;

    public Encryptor(int aKey) {
        key = aKey;
    }

    public void encryptFile(String inFile, String outFile) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(inFile);
            out = new FileOutputStream(outFile);
            encrypStream(in,out);
        }
        finally {
            if(in != null ) in.close();
            if(out != null ) out.close();
        }
    }
    public void encrypStream(InputStream in, OutputStream out) throws IOException {
        boolean done = false;
        while (!done) {
            int next = in.read();
            if (next == -1) done = true;
            else {
                byte b = (byte) next;
                byte c = encrypt(b);
                out.write(c);

            }
        }
    }
    public byte encrypt(byte b) {
        return (byte) (b + key);

    }
}

