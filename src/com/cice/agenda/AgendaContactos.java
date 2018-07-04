package com.cice.agenda;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Scanner;

public class AgendaContactos {

    //variable local de la clase
    private HashMap<Long,String> agenda= new HashMap<>();
    private Scanner sc=new Scanner(System.in);
    private int opcion=0;


    public void  iniciarApp(){

        do {
            showMenu();
            comprobarOpcion(opcion);

        }while (opcion!=4);

    }


    private void showMenu(){


        System.out.println("================");
        System.out.println("1.Nuevo contacto");
        System.out.println("2.Elimnar contacto");
        System.out.println("3.Mostrar contactos");
        System.out.println("4. Salir del programa");
        System.out.println();
        opcion= sc.nextInt();
        System.out.println("Elige una opcion: ");

    }

    private void comprobarOpcion(int opcion){

        switch (opcion){

            case 1:
                nuevoContacto();
                break;

            case 2:
                eliminarContacto();
                break;

            case 3:
                mostrarContacto();
                break;
            case 4:
                //salimos del programa
                break;

            default:
                System.out.println("La opcion elegida no es valida.");


        }

    }

    private void nuevoContacto (){

        System.out.println("Introduce su DNI: ");
        long dni =sc.nextLong();
        sc.nextLine();
        System.out.println("Introduce su nombre: ");
        String nombre=sc.nextLine();

        agenda.put(dni,nombre);

        agenda.forEach((a,b)-> System.out.println(a + "-" + b));

    }

    private void eliminarContacto(){

        System.out.println("introduce el dni: ");
        long dni=sc.nextLong();

        if (agenda.containsKey(dni)){
            agenda.remove(dni);
            System.out.println("El dni ha sido eliminado.");
        }
        else{
            System.out.println("El dni introducido no existe en la agenda.");
        }

    }

    private void mostrarContacto(){

        agenda.forEach((a,b)-> System.out.println(a + "-" + b));
    }

}