package org.example;

import java.util.Arrays;
import org.example.IPersona;
public class MeRefApp {

    public static void referenciarMetodoStatico(){
        System.out.println("Metodo referido statico");

    }

    public void referenciarMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"Mito","Code", "Jaime"};
        /*Arrays.sort(nombre, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

         */
       /* Arrays.sort(nombre,(s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(nombre));
        */
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }
    public void referenciaMetodoInstanciaObjetoParticular(){
        System.out.println("Metodo Referido Instancia de un objeto particular");


    }

    /*public void  referenciaConstructor() {
        IPersona iPersona = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        Persona persona = iPersona.crear(1, "Mito");
    }

     */
    public void  referenciaConstructor() {

      IPersona iPersona=new IPersona() {
           @Override
           public Persona crear(int id, String nombre) {
               return new Persona(id, nombre);

           }
       };
        Persona persona3= iPersona.crear(1,"Mitocode");
        System.out.println(persona3.getId()+"- "+ persona3.getNombre());

    IPersona iPersona1 = (x,y)->(new Persona(x,y));
    Persona per= iPersona1.crear(1,"Mitocode");
        System.out.println(per.getId()+"- "+ per.getNombre());

        IPersona iPersona2 = Persona::new;
      Persona persona=  iPersona.crear(1,"MishoCode");
        System.out.println(persona.getId()+"- "+ persona.getNombre());
    }






    public static void main(String[] args) {
        MeRefApp app= new MeRefApp();
        //app.operar();
        //app.referenciarMetodoInstanciaObjetoArbitrario();
        Operacion op = app::referenciaConstructor;
        op.saludar();

    }
}