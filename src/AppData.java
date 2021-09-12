import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;
    public void setHeader(String[] header) {
        this.header = header;
    }
    public void setData(int[][] data) {
        this.data = data;
    }

    //Метод создания заголовка csv файла в виде массива из байт
    private byte[] createCsvHeader () {
        String csvHeader = "";
        for (int i=0; i<header.length; i++)
            if (i != header.length - 1)
                csvHeader += header[i] + ";";
            else
                csvHeader += header[i] + "\n";
        return csvHeader.getBytes();
    }
    //Метод создания данных csv файла в виде массива из байт
    private String[] createCsvData () {
        String[] dataArr = new String[data.length];
        for (int i =0; i < data.length; i++)
            dataArr[i] = "";

        for (int i =0; i<data.length; i++)
            for (int j=0; j<data[i].length; j++) {
                if (j != data[i].length-1)
                    dataArr[i] += data[i][j] + ";";
                else
                    dataArr[i] += data[i][j] + "\n";
            }
        return dataArr;
    }
    //Метод записи в файл
     public void writeToFile() {
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream("test.csv")))
        {
            out.write(createCsvHeader());
            for (int i = 0; i< createCsvData().length; i++) {
                out.write(createCsvData()[i].getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Метод чтения из файла
    public void readFromFile() {
        try (InputStream in = new BufferedInputStream(new FileInputStream("test.csv"))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
