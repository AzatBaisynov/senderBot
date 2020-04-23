package org.example.dao;

import org.example.repo.Request;

import java.io.IOException;
import java.util.*;

public class Sorter {
    public static void getAllRequests() throws IOException {
        LinkedList<Request> reqs =  LogsFileReader.makeUserList();
        reqs.forEach(x -> System.out.println(x));
    }

    public static List<String> sortById() throws IOException {
        LinkedList<Request> reqs =  LogsFileReader.makeUserList();
        List<String> list = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        reqs.forEach(x -> set.add(x.getId()));
        int i = 1;
        for (String s : set){
            System.out.println(i++ + ") " + s);
            list.add(s);
        }
        return list;
    }

    public static void sortByLastDate() throws IOException {
        LinkedList<Request> reqs =  LogsFileReader.makeUserList();
        HashMap<String, String> map = new HashMap<>();
        reqs.forEach(x -> map.put(x.getId(), x.getTime()));
        Set<String> hashKeys = map.keySet();
        int i = 1;
        for (String id : hashKeys){
            System.out.println(i + ") " + id + " " + map.get(id));
            i++;
        }
    }
}
