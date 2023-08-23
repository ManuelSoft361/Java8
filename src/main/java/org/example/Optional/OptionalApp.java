package org.example.Optional;

import java.util.Optional;

public class OptionalApp {
    public void probar(String valor){
       // System.out.println(valor.contains("mito"));
        try {
            Optional op = Optional.empty();
            op.get();
        }catch (Exception e){
            System.out.println("No hay elemento");
        }


    }
    public void orElse(String valor){
        Optional<String> op = Optional.ofNullable(valor);
       String x = op.orElse("Predeterminado");
        System.out.println(x);

    }
    public void orElseThrow(String valor){

    }
    public void isPresent(String valor){

    }

    public static void main(String[] args) {
        OptionalApp app=new OptionalApp();
        //app.probar(null);
        app.orElse(null);
    }
}
