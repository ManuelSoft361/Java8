package org.example;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collecion {
private List<String> lista;
public void llenarLista(){
    lista= new ArrayList<>();
    lista.add("Mitocode");
    lista.add("Mito");
    lista.add("Code");
}

public void usarForEach(){
    lista.forEach(x-> System.out.println(x));
    lista.forEach(System.out::println);
}
public void usarRemoveIf() {
    Iterator<String> it = lista.iterator();
    while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("Code")) {
                it.remove();
            }

    }

    lista.removeIf(x->x.equalsIgnoreCase("Code"));

}

public  void  usarSort(){
    //Collections.sort(lista);
    lista.sort((x,y)->x.compareTo(y));
}
    public static void main(String[] args) {
Collecion app = new Collecion();
app.llenarLista();
//app.usarRemoveIf();
        app.usarSort();
app.usarForEach();

    }
}
