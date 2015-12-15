package no.gradle.example.library;

import com.google.common.collect.Lists;
import net.webservicex.GetWeather;

import java.util.ArrayList;

public class MyLibraryImpl{

    public int doSomeThingSmart() {
        new GetWeather().getCityName();
        ArrayList<Object> objects = Lists.newArrayList();
        return objects.size();
    }

}
