/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main { 
    public static ArrayList<Dueño> listaDueños;
    public static ArrayList<Mascota> listaMascotas;
    public static ArrayList<Auspiciante> listaAspiciantes;
    public static ArrayList<Ciudad> listaCiudades;
    public static ArrayList<Concurso> listaConcursos;


    public static boolean dueñoExiste(String id){
        Dueño busqueda = new Dueño(id);
        return listaDueños.contains(busqueda);
    }

    public static Dueño encontrarDueño(String cedula) {
        for(Dueño dueño : listaDueños) {
            if(dueño.getCedula().equals(cedula)) {
                return dueño;
            }
        }
        return null;
    }

    public static void consultaDueño(String cedula){
        Dueño busqueda =  new Dueño(cedula);

        if (listaDueños.contains(busqueda)){
          int indice = listaDueños.indexOf(busqueda);
          Dueño veh = listaDueños.get(indice);
          System.out.println(veh);
        }else{
          System.out.println("No se encuentra persona con esa cedula");
        }
    }

    public static boolean auspicianteExiste(String codigo){
        Auspiciante busqueda = new Auspiciante(codigo);
        return listaAspiciantes.contains(busqueda);
    }

    public static Auspiciante encontrarAuspiciante(String codigo) {
        for(Auspiciante ausp : listaAspiciantes) {
            if(ausp.getCodigo().equals(codigo)) {
                return ausp;
            }
        }
        return null;
    }

    public static void consultaAuspiciante(String cod){
        Auspiciante busqueda =  new Auspiciante(cod);
        if (listaAspiciantes.contains(busqueda)){
          int indice = listaAspiciantes.indexOf(busqueda);
          Auspiciante auspiciante = listaAspiciantes.get(indice);
          System.out.println(auspiciante);
        } else {
          System.out.println("No se encuentra auspiciante con ese codigo");
        }
    }

    public static boolean concursoExiste(String codigo){
        Concurso busqueda = new Concurso(codigo);
        return listaConcursos.contains(busqueda);
    }

    public static Concurso encontrarConcurso(String codigo) {
        for(Concurso conc : listaConcursos) {
            if(conc.getCodigo().equals(codigo)) {
                return conc;
            }
        }
        return null;
    }

    public static void consultaConcurso(String cod){
        Concurso busqueda =  new Concurso(cod);
        if (listaConcursos.contains(busqueda)){
          int indice = listaConcursos.indexOf(busqueda);
          Concurso conc = listaConcursos.get(indice);
          System.out.println(conc);
        } else {
          System.out.println("No se encuentra concurso con ese codigo");
        }
    }

    public static boolean mascotaExiste(String codigo){
        Mascota busqueda = new Mascota(codigo);
        return listaMascotas.contains(busqueda);
    }

    public static Mascota encontrarMascota(String codigo) {
        for(Mascota pet : listaMascotas) {
            if(pet.getCodigo().equals(codigo)) {
                return pet;
            }
        }
        return null;
    }

    public static void consultaMascota(String cod){
        Mascota busqueda =  new Mascota(cod);
        if (listaMascotas.contains(busqueda)){
          int indice = listaMascotas.indexOf(busqueda);
          Mascota pet = listaMascotas.get(indice);
          System.out.println(pet);
        } else {
          System.out.println("No se encuentra mascota con ese codigo");
        }
    }

    public static Ciudad encontrarCiudad(String nombre) {
        for(Ciudad city : listaCiudades) {
            if(city.getNombre().equals(nombre)) {
                return city;
            }
        }
        return null;
    }

    public static void cargarBaseDatos(){

        Ciudad Quito = new Ciudad("Quito", "Pichincha");
        Ciudad Guayaquil = new Ciudad("Guayaquil", "Guayas");
        Ciudad Cuenca = new Ciudad("Cuenca","Azuay");

        ArrayList<Ciudad> lCities = new ArrayList<>();
        lCities.add(Quito);
        lCities.add(Guayaquil);
        lCities.add(Cuenca);

        listaCiudades = lCities;

        Dueño d1 = new Dueño("0952645646", "Juan Alejandro", "Guadalupe Rosas", "Urb. La Romareda", "0959452918", Quito, "jaguadal@espol.edu.ec");
        Dueño d2 = new Dueño("0929548980", "Christofer Paul", "Espin Huayamabe", "Pradera 2", "0995725182", Guayaquil, "cpespin@espol.edu.ec");
        Dueño d3 = new Dueño("0924452625", "Victor Enrique", "Suarez Suarez", "El Batán", " 0985677532", Cuenca, "vistop_schultz69@gmail.com");
        Dueño d4 = new Dueño("0935827528", "David Emiliano", "Rosselló Higueras", "Cañaribamba", "0934216226", Cuenca, "ejemplo4@gmail.com");
        Dueño d5 = new Dueño("0927482472", "Miguel Paul", "Batlle Rozas", "Guasmo Norte", "0940106033", Guayaquil, "ejemplo5@gmail.com");
        Dueño d6 = new Dueño("0916482748", "Jose Manuel", "Escribano Juliá", "Cotocollao", "0953006438", Quito, "ejemplo6@gmail.com");
        Dueño d7 = new Dueño("0918392840", "Jose Daniel", "Robledo-Aguirre", "Totoracocha", "0913441009", Cuenca, "ejemplo7@gmail.com");
        Dueño d8 = new Dueño("0914272194", "Antonio Jesus", "Quevedo-Pera", "Barrio Cuba", "0953006438", Guayaquil, "ejemplo8@gmail.com");
        Dueño d9 = new Dueño("0982837282", "Abraham Orlando", "Hernandez Calzada", "Yanuncay", "0960704725", Cuenca, "ejemplo9@gmail.com");
        Dueño d10 = new Dueño("0928493859", "Jose Juan", "Sebastián Vazquez", "Urdesa", "0976082153", Guayaquil, "ejemplo10@gmail.com");

        Mascota m1 = new Mascota("Fifi", "Gato", "persa", "25-12-2017", "f1", d1);
        Mascota m2 = new Mascota("Coco", "Perro", "labrador", "15-02-2016", "f2", d2);
        Mascota m3 = new Mascota("Max", "Perro", "golden retriever", "20-05-2016", "f3", d3);
        Mascota m4 = new Mascota("Rocky", "Gato", "siames", "30-12-2019", "f4", d4);
        Mascota m5 = new Mascota("Toby", "Perro", "chihuahua", "20-10-2018", "f5", d5);
        Mascota m6 = new Mascota("Simba", "Gato", "ragdoll", "15-11-2019", "f6", d6);
        Mascota m7 = new Mascota("Leo", "Gato", "bengala", "10-04-2020", "f7", d7);
        Mascota m8 = new Mascota("Lucas", "Perro", "caniche", "05-06-2012", "f8", d8);
        Mascota m9 = new Mascota("Zeus", "Perro", "poodle", "01-07-2014", "f9", d9);
        Mascota m10 = new Mascota("Bruno", "Gato", "munchkin", "01-09-2018", "f10", d10);
        
        ArrayList<Mascota> lM = new ArrayList<>();
        lM.add(m1);
        lM.add(m2);
        lM.add(m3);
        lM.add(m4);
        lM.add(m5);
        lM.add(m6);
        lM.add(m7);
        lM.add(m8);
        lM.add(m9);
        lM.add(m10);

        listaMascotas = lM;

        ArrayList<Dueño> lD = new ArrayList<>();
        lD.add(d1);
        lD.add(d2);
        lD.add(d3);
        lD.add(d4);
        lD.add(d5);
        lD.add(d6);
        lD.add(d7);
        lD.add(d8);
        lD.add(d9);
        lD.add(d10);

        listaDueños = lD;

        Auspiciante auspiciante1 = new Auspiciante("DogChow", "calle1", "0959501881",Quito, "algo@gmial.com", "www.dogchow.com");
        ArrayList<Auspiciante> lA = new ArrayList<>();
        lA.add(auspiciante1);

        listaAspiciantes = lA;

        Premio premio_c1 = new Premio("200 dolares", "100 dolares", "50 dolares", auspiciante1);

        Calendar fechaEvento = new GregorianCalendar(2021, Calendar.NOVEMBER, 7);
        Calendar inicioInscrip = new GregorianCalendar(2021, Calendar.OCTOBER, 25);
        Calendar finInscrip = new GregorianCalendar(2021, Calendar.NOVEMBER, 2);
        Concurso c1  = new Concurso("Top Mascotas",fechaEvento,16,inicioInscrip,finInscrip,Quito,"Estadio local",premio_c1,auspiciante1,"Todos");

        Calendar fc2 = new GregorianCalendar(2021, Calendar.NOVEMBER, 30);
        Calendar fin2 = new GregorianCalendar(2021, Calendar.NOVEMBER, 15);
        Calendar ffin2 = new GregorianCalendar(2021, Calendar.NOVEMBER, 25);
        Concurso c2 = new Concurso("Firulais", fc2, 20, fin2, ffin2, Cuenca, "Casa comunal", premio_c1, auspiciante1, "Gatos");

        ArrayList<Concurso> lConc = new ArrayList<>();
        lConc.add(c1);
        lConc.add(c2);

        listaConcursos = lConc;
    }

    static Scanner todo = new Scanner(System.in);

    public static Premio crearPremio(){
        //Scanner premios = new Scanner(System.in);
        System.out.println("Ingrese el primer premio:");
        String p1 = todo.nextLine();
        System.out.println("Ingrese el segundo premio:");
        String p2 = todo.nextLine();
        System.out.println("Ingrese el tercer premio:");
        String p3 = todo.nextLine();
        Premio p = new Premio(p1, p2, p3);
        //premios.close();
        return p;
    }

    public static void inscribirParticipante(){
        Calendar hoy = Calendar.getInstance();
        System.out.println();
        System.out.println("Concursos disponibles para inscripcion:");
        for (Concurso conc : listaConcursos) {
            if (conc.getFehcaFinInscrip().after(hoy)) {
                System.out.println(conc);
            }
        }
        System.out.println();
        System.out.println("Ingrese el codigo del concurso al que desea inscribirse:");
        String cod = todo.nextLine();
        Concurso objetivo = encontrarConcurso(cod);
        System.out.println();
        System.out.println("Se inscribira al concurso " + objetivo);
        String comparison = objetivo.getDirigido();
        System.out.println("------------------Mascotas Disponibles------------------");
        if (comparison == "Todos") {
            for (Mascota pet : listaMascotas) {
                    System.out.println(pet);
                }
        }
        if (comparison == "Perros") {
            for (Mascota pet : listaMascotas) {
                if (pet.getTipoMascota().equals("Perro")) {
                    System.out.println(pet);
                }
            }         
        }
        if (comparison == "Gatos") {
            for (Mascota pet : listaMascotas) {
                if (pet.getTipoMascota().equals("Gato")) {
                    System.out.println(pet);
                }
            }
        }

        System.out.println();
        System.out.println("Escriba el codigo de su mascota:");
        String mascota_code = todo.nextLine().toUpperCase();
        Mascota pet = encontrarMascota(mascota_code);
        objetivo.inscribirMascota(pet);
        System.out.println("Se ha inscrito a " + pet.getNombre() + " en el concurso " + objetivo.getNombre());
        System.out.println();
        menuPrincipal();
        //int indice = objetivo.getListaConcursantes().indexOf(encontrarMascota(mascota_code));
        //System.out.println(objetivo.getListaConcursantes().get(indice));
    }


    public static void crearConcurso(){
        //Scanner concursos = new Scanner(System.in);
        System.out.println("Ingrese el nombre del concurso:");
        String n = todo.nextLine();
        System.out.println("Ingrese la fecha del concurso(dd/mm/aaaa):");
        String linea = todo.nextLine();
        String[] datos = linea.split("/", 3);
        int dia = Integer.valueOf(datos[0]);
        int mes = Integer.valueOf(datos[1]);
        int anio = Integer.valueOf(datos[2]);
        Calendar f_evento = new GregorianCalendar(anio, mes, dia);
        System.out.println("Ingrese la hora del concurso:");
        String temp = todo.nextLine();
        int hora = Integer.valueOf(temp);
        System.out.println("Ingrese la fecha de inicio de inscripciones(dd/mm/aaaa):");
        String linea2 = todo.nextLine();
        String[] datos2 = linea.split("/", 3);
        int dia2 = Integer.valueOf(datos[0]);
        int mes2 = Integer.valueOf(datos[1]);
        int anio2 = Integer.valueOf(datos[2]);
        Calendar inicioInsc = new GregorianCalendar(anio2, mes2, dia2);
        System.out.println("Ingrese la fecha de fin de inscripciones(dd/mm/aaaa):");
        String linea3 = todo.nextLine();
        String[] datos3 = linea.split("/", 3);
        int dia3 = Integer.valueOf(datos[0]);
        int mes3 = Integer.valueOf(datos[1]);
        int anio3 = Integer.valueOf(datos[2]);
        Calendar finInsc = new GregorianCalendar(anio3, mes3, dia3);
        System.out.println("Las ciudades disponibles son: ");
        for (Ciudad c : listaCiudades) {
            System.out.println(c);
        }
        System.out.println("Ingrese la ciudad donde se realizara el concurso:");
        String city = todo.nextLine();
        Ciudad city_conc = encontrarCiudad(city);
        System.out.println("Ingrese el lugar del evento:");
        String local = todo.nextLine();
        Premio p = crearPremio();
        System.out.println("Los auspiciantes disponibles son:");
        for (Auspiciante ausp : listaAspiciantes) {
            System.out.println(ausp);
        }
        System.out.println("Ingrese el codigo del asupiciante que patrocinara el concurso:");
        String cod_ausp = todo.nextLine();
        Auspiciante ausp_conc = encontrarAuspiciante(cod_ausp);
        System.out.println("A quien estara dirigido el concurso?\nPerros (1)\nGatos (2)\nTodos (3)\nDirigido a: ");
        System.out.println(todo.hasNextLine());
        int entry = todo.nextInt(); // arreglar el enum
        String dirig = "";
        if (entry == 1) {
            dirig = "Perros";
        }
        else if (entry == 2) {
            dirig = "Gatos";
        }
        else if (entry == 3) {
            dirig = "Todos";
        }

        listaConcursos.add(new Concurso(n, f_evento, hora, inicioInsc, finInsc, city_conc, local, p, ausp_conc, dirig));
        System.out.println("Se ha creado el concurso:");
        int ultimo = listaCiudades.size();
        System.out.println(listaConcursos.get(ultimo - 1));
    }
    

    public static void administrarConcurso(){
        System.out.println("------------------Concursos------------------");
        for (Concurso conc : listaConcursos) {
            System.out.println(conc);
        }
        System.out.println();
        System.out.println("Crear concurso (1)\nInscribir participante (2)\nRegresar al Menu Principal(3)\nEliga una de las opciones del menu Concursos:");
        //Scanner input = new Scanner(System.in);
        int entrada_user = todo.nextInt();
        todo.nextLine();
        switch (entrada_user) {
            case 1:
                crearConcurso();
                todo.nextLine();
                break;

            case 2:
                inscribirParticipante();
                todo.nextLine();
                //System.out.println(cod);
                break;

            case 3:
                regresarMenuPrincipal();
                break;
        }
        //input.close();
    }

    public static void menuPrincipal(){
        System.out.println("------------------Menu Principal------------------\nAdministrar concursos (1)\nAdministrar dueños (2)\nAdministrar mascotas (3)\nEliga una de las opciones del Menu Principal:");
        int seleccion = todo.nextInt();
        switch (seleccion) {
            case 1:
                administrarConcurso();
                break;
            //case 2:
            //    administrarDueños();
            //    break;
            //case 3:
            //    administrarMascotas();
            //    break;
        }
    }

    public static void regresarMenuPrincipal() {
        menuPrincipal();
    }

    public static void main(String[] args){
        cargarBaseDatos();
        //System.out.println(dueñoExiste("0601783715"));
        //consultaPersona("0927482472");

        //System.out.println("Iteracion de lista de mascotas");
        //for (Mascota pet : listaMascotas) {
        //    System.out.println(pet);
        //}

        menuPrincipal();
        //System.out.println(listaConcursos.get(0).getFehcaFinInscrip());
        //System.out.println();
        //System.out.println(Calendar.getInstance());
        //System.out.println();
        //System.out.println(listaConcursos.get(1).getFehcaFinInscrip().after(Calendar.getInstance()));

        
        //System.out.println(listaConcursos.get(0).getPremios());
        

        

        //d1.editarDueño();

        //System.out.println(listaDueños.get(0));

        //c1.inscribirParticipante(d, m);
        //implementar la inscripcion de nuevos dueños con sus mascotas
    }
}
