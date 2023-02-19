package it.euris.academy2023.annotations;


import com.sun.istack.internal.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Animale animale=new Animale();

        Method[] metodi = animale.getClass().getDeclaredMethods();
        for(int i=0; i<metodi.length;i++){
            if(metodi[i].isAnnotationPresent(VeryImportant.class)){
                metodi[i].invoke(animale);
            }
        }


    }
}