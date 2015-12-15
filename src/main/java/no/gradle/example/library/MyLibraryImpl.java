package no.gradle.example.library;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class MyLibraryImpl{

    public int doSomeThingSmart() {
        ArrayList<Object> objects = Lists.newArrayList();
        return objects.size();
    }

}
