package org.example.controller;

import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

//import java.util.List;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import static org.example.controller.BotButtons.setButtons;
import static org.example.controller.BotUpdate.runUpdate;

public class Bot extends TelegramLongPollingBot {

//    public void sendMsgWithAdv(Message message, String text) throws FileNotFoundException {
//        String parsedSmile = EmojiParser.parseToUnicode(":point_right:");
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.enableMarkdown(true);
//        sendMessage.setChatId(message.getChatId().toString());
//        sendMessage.setText(text);
//        SendPhoto msg = new SendPhoto().setPhoto("место для Вашей рекламы!", new FileInputStream(new File("classes/rec.jpg")));
//        msg.setChatId(message.getChatId().toString());
//        SendMessage sendMessage1 = new SendMessage();
//        sendMessage1.setText("Только грамотные треки в стиле кайфа " + parsedSmile+ parsedSmile
//                + parsedSmile+ parsedSmile+ " @musicaproanima");
//        sendMessage1.setChatId(message.getChatId().toString());
//        sendMessage1.enableMarkdown(true);
//        try {
//            execute(msg);
//            execute(sendMessage1);
//            execute(sendMessage);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }

    public void sendMsgNoReplyNoButtons(String id, String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(id);
        sendMessage.setText(text);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }



    public void onUpdateReceived(Update update) {
        try {
            runUpdate(update);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//    public void onUpdatesReceived(List<Update> updates) {
//
//    }

    public String getBotUsername() {
        return "Covid_statistics";
    }

    public String getBotToken() {
        return "1160635009:AAEGZxCC1n_kpbfsP199AAJs609y6U4Q2wc";
    }
}
