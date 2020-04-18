package org.example.controller;

import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.List;

public class BotUpdate {
    public static void runUpdate(Update update) throws FileNotFoundException {
        Bot bot = new Bot();
        if(update.hasCallbackQuery()){

            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            User user = callbackQuery.getFrom();

        }
    }
}
