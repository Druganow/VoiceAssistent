package com.example.voiceassistent;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class ParsingHtmlService{
    private static final String URL = "http://mirkosmosa.ru/holiday/2020";
    public static ArrayList<String> getHoliday(String date)throws Exception {
        Document document = Jsoup.connect(URL).get();
        Element body = document.body();
        Element day =  body.getElementsContainingOwnText(date).first();
        Elements holidays = day.parent().parent().select("li");
        ArrayList<String> holidays_str = new ArrayList<>();
        for (Element element:
                holidays) {
            holidays_str.add(element.selectFirst("a").text());
        }
        return  holidays_str;
    }

}
