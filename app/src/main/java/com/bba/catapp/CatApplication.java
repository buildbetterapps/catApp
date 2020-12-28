package com.bba.catapp;

import android.app.Application;

import com.bba.catapp.beans.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatApplication extends Application {

    private static List<Cat> cats = new ArrayList<>();

    //Initialize list
    static{
        cats.add(new Cat("Мурзик", "Очень ласковый, нуждается в заботе, любит рыбу", "белый|короткошерстный|ласковый"));
        cats.add(new Cat("Мяу", "Игривый, любит вискас, неприхотливый", "серыйпушистый|тигровы|игривый|независимый"));
        cats.add(new Cat("Рассвет", "Очень активный, может играть часами", "серый|тигровый|активный"));
        cats.add(new Cat("Тоша", "Ловит мышей. Очень самостоятельный", "рыжий|тигровый|дикий"));
        cats.add(new Cat("Кыш", "Любит играть с мячиком. Ест выскас и рыбу.", "пятнистий|черный|белый|ласковый|игривый"));
        cats.add(new Cat("Муха", "Любит отдыхать на коленях. Очень тихая и ласковая кошечка", "черная|спокойная|гладкошерстная"));
    }

    public static List<Cat> getCats() {
        return cats;
    }
}
