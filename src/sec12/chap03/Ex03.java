package sec12.chap03;

import java.io.*;

public class Ex03 {
    public static void main(String[] args) {
        String DATA_PATH = "src/sec12/chap03/data.bin";
        try (FileOutputStream fos = new FileOutputStream(DATA_PATH);
             DataOutputStream dos = new DataOutputStream(fos)
        ){
            dos.writeBoolean(true);
            dos.writeInt(123);
            dos.writeDouble(3.14);
            dos.writeChar('A');
            dos.writeUTF("헬로헬로염");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        boolean read1;
        int read2;
        double read3;
        char read4;
        String read5;
        try (FileInputStream fis = new FileInputStream(DATA_PATH);
             DataInputStream dis = new DataInputStream(fis))
        {
            read1 = dis.readBoolean();
            read2 = dis.readInt();
            read3 = dis.readDouble();
            read4 = dis.readChar();
            read5 = dis.readUTF();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
