package org.example.dao;

import org.example.repo.Request;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class LogsFileReader {
    public static LinkedList<Request> makeUserList() throws IOException {
        LinkedList<Request> list = new LinkedList<>();
        FileReader fR = new FileReader("C:/covidlogs/text.txt");
        Scanner sc = new Scanner(fR);
        int i = 1;
        while (sc.hasNextLine()) {
            String arr[] = sc.nextLine().split(" ");
            list.add(new Request(arr[0], arr[1], arr[2]));
            i++;
        }
        fR.close();
        return list;
    }
}
