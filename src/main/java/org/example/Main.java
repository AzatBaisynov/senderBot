package org.example;

import org.example.controller.Bot;
import org.example.dao.Sorter;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        while (1 > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Добро пожаловать\n" +
                    "1 - все юзеры\n" +
                    "2 - последний запрос\n" +
                    "3 - все запросы\n");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {

                case 1: Sorter.sortById();
                break;
                case 2: Sorter.sortByLastDate();
                break;
                case 3: Sorter.getAllRequests();
                break;
            }
        }

//        ApiContextInitializer.init();
//        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
//        try {
//            Bot bot = new Bot();
//            bot.sendMsgNoReplyNoButtons("1063515718", "test");
//            telegramBotsApi.registerBot(bot);
//        } catch (TelegramApiRequestException e) {
//            e.printStackTrace();
//        }

    }
}
