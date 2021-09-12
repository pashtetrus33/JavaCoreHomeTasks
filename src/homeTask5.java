import java.io.*;
import java.util.Arrays;

public class homeTask5 {
    public static void main(String[] args) {
        AppData csvData = new AppData();
        csvData.setHeader(new String[]{"Value1","Value2","Value3","Value4","Value5"});
        csvData.setData(new int[][]{{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45},{51,52,53,54,55}});
        csvData.writeToFile();
        csvData.readFromFile();
        }
}







