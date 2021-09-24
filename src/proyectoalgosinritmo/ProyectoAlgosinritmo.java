package proyectoalgosinritmo;
import java.util.Scanner;

public class ProyectoAlgosinritmo {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int op1,op2,op3,op3sub = 0,op3anterior;//variables de los diferentes menus
       int re1,re2,regama; //Declaracion de variables para los menus y su interconexion
       int reame;//define la repeticion de las amenidades
       String ame = null;//variable que define si se agregaran amenidades o no
       String AutoN = null;
       Double AutoP = null;
       String AccesorioN = null;
       double AccesorioP;
       String adorno = null;//variable de espera para los enters jaja
       String CollectorN=""; //variables que almacenan los datos de la iteracion entre amenidades
       double CollectorP = 0;
       double Total=0;//la inicializacion de variables, es por parte del interprete
       String Agregamenidades;
       int array[] = new int[7];
       int g=0;//pal vector
       int incongruencia=0;
        do {
           
            op1=0;
            System.out.println("Bienvenido a la concesionaria");
            System.out.println("Menu Principal");
            System.out.println("1) Seleccionar Automovil");
            System.out.println("2) Salir");
            op1=s.nextInt();
            switch(op1){
                case 1:
                    regama=0;//inicializacion de la variable que permite regresar al menu de autos, facilita el trabajo xd
                    do {
                     g=0;//inicializo el contador del vector
                    System.out.println("Menu de autos");
                    System.out.println("Bienvenido a la seleccion de gama de vehiculos");
                    System.out.println("1) Sedán Económico");
                    System.out.println("2) Sedán");
                    System.out.println("3) Deportivo");
                    System.out.println("4) Híbrido");
                    System.out.println("5) Coupe");
                    System.out.println("6) Coupe Deportivo");
                    System.out.println("7) Compacto");
                    System.out.println("8) Hachibaku");
                    System.out.println("9) Económico versión Rally");
                    System.out.println("10) Regresar a menú Principal");
                    op2=s.nextInt();
                        switch(op2){//asigna el nombre y precio a la eleccion
                            case 1:
                                AutoN = "Sedan Economico";
				AutoP= 18940.00;
                            break;
                            case 2:
                                AutoN = "Sedan";
                                AutoP= 23570.00;
                            break;
                            case 3:
                                AutoN = "Deportivo";
				AutoP= 24100.00;
                            break;
                            case 4:
                                AutoN = "Híbrido";
				AutoP= 25100.00;
                            break;
                            case 5:
                                AutoN = "Coupe";
				AutoP= 19350.00;
                            break;
                            case 6:
                                AutoN = "Coupe Deportivo";
				AutoP= 24100.00;
                            break;
                            case 7:
                                AutoN = "Compacto";
				AutoP= 16190.00;
                            break;
                            case 8:
                                AutoN = "Hachibaku";
				AutoP= 20150.00;
                            break;
                            case 9:
                                AutoN = "Económico versión Rally";
				AutoP= 34700.00;
                            break;
                            case 10:
                                op1=1;
                            break;
                        }
                       if (op2==10) {//filtra el case 10 para evitar problemas con el do while
                         regama=0;//para evitar un conflicto con una posible iteracion, se filtra e inicializa en 0
                       }
                       else if(op2<1 || op2 > 10){
                           System.out.println("error 404");
                           op1=0;
                       }
                        else{
                                   System.out.println("Concesionario De Automoviles");
                                   System.out.println("Seleccion De Gama De Vehiculos \n");
                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                   System.out.println("Desea Agregar Amenidades? (s/n) ");
                                   ame=s.next();
                                   if ("S".equals(ame) || "s".equals(ame) ) {
                                       reame=0;
                                       AccesorioN = null;
                                       AccesorioP = 0;
                                       do {//menu de amenidades
                                           
                                           incongruencia=0;//se inicializa al mismo tiempo que la nueva instancia
                                           reame=0;//reinicio de la variable por problemas de iteracion entre el regreso a amenidades
                                           System.out.println("Menu de Amenidades`\n");
                                           System.out.println("Ha Seleccionado La Gama: " + AutoN + "\n");
                                           System.out.println("Tipos De Amenidades: \n");
                                           System.out.println("1) Tipo de Transmision ");
                                           System.out.println("2) Color de pintura exterior");
                                           System.out.println("3) Aros");
                                           System.out.println("4) Accesorios exteriores");
                                           System.out.println("5) Accesorios interiores");
                                           System.out.println("6) Accesorios electronicos");
                                           System.out.println("7) Color de Tapiceria");
                                           System.out.println("8) Regresar a selección de gama de vehículo ");
                                           op3 = s.nextInt();
                                           for (int i = 0; i < array.length; i++) {
                                               if (op3==array[i]) {
                                               incongruencia=1;//variable que mide si hay repetidos
                                                   System.out.println(array[i]);
                                           }//fin del if del array

                                           }//fin del for
                                           if (incongruencia==1) {
                                               System.out.println("Error 404, hay incongruencias");
                                               reame=1;
                                           }
                                           else{
                                           switch(op3){
                                               case 1:
                                                   System.out.println("Seleccion de tipo de transmision \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Tipos de transmisión: \n");
                                                   System.out.println("1) Manual - US 0.00");
                                                   System.out.println("2) CVT - US 800.00");
                                                   System.out.println("3) Manual con Turbo - US 0.00");
                                                   System.out.println("4) CVT con Turbo - US 800.00");
                                                   System.out.println("5) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese la transmision que desee");
                                                   op3sub=s.nextInt();
                                                   switch(op3sub){
                                                       case 1:
                                                          AccesorioN="Tipo De Transmision: Manual";
                                                          AccesorioP=0.00;
                                                       break;
                                                       case 2:
                                                          AccesorioN="Tipo De Transmision: CVT";
                                                          AccesorioP=800.00;
                                                       break;
                                                       case 3:
                                                          AccesorioN="Tipo De Transmision: Manual con Turbo";
                                                          AccesorioP=0.00;
                                                       break;
                                                       case 4:
                                                          AccesorioN="Tipo De Transmision: CVT con Turbo";
                                                          AccesorioP=800.00;
                                                       break;
                                                       case 5:
                                                           reame=1;//fuerza la repeticion del ciclo 
                                                       break;//marca el regreso
                                                   }//fin del switch subinterno
                                               break;//fin case transmision
                                               
                                               case 2:
                                                   AccesorioP=0.00;
                                                   System.out.println("Seleccion de pintura exterior \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Colores a elegir: \n");
                                                   System.out.println("La pintura no tiene un costo agregado \n");
                                                   System.out.println("1)  Cosmic Blue");
                                                   System.out.println("2)  Burgundy Night");
                                                   System.out.println("3) Rallye Red");
                                                   System.out.println("4) Crystal Black");
                                                   System.out.println("5) Modern Steel");
                                                   System.out.println("6) Taffeta White");
                                                   System.out.println("7) Energy Green");
                                                   System.out.println("8) Kona coffee");
                                                   System.out.println("9) Orange Fury");
                                                   System.out.println("10) Helios Yellow");
                                                   System.out.println("11) Sonic Gray");
                                                   System.out.println("12) Polished Metal");
                                                   System.out.println("13) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese la pintura que desee");
                                                   op3sub=s.nextInt();
                                                        switch(op3sub){
                                                            case 1:
                                                                AccesorioN="Color de Pintura Exterior: Cosmic Blue";
                                                            break;
                                                            case 2:
                                                                AccesorioN="Color de Pintura Exterior: Burgundy Night";
                                                            break;
                                                            case 3:
                                                                AccesorioN="Color de Pintura Exterior: Rallye Red";
                                                            break;
                                                            case 4:
                                                                AccesorioN="Color de Pintura Exterior: Crystal Black";
                                                            break;
                                                            case 5:
                                                                AccesorioN="Color de Pintura Exterior: Modern Steel";
                                                            break;
                                                            case 6:
                                                                AccesorioN="Color de Pintura Exterior: Taffeta White";
                                                            break;
                                                            case 7:
                                                                AccesorioN="Color de Pintura Exterior: Energy Green";
                                                            break;
                                                            case 8:
                                                                AccesorioN="Color de Pintura Exterior: Kona coffee";
                                                            break;
                                                            case 9:
                                                                AccesorioN="Color de Pintura Exterior: Orange Fury";
                                                            break;
                                                            case 10:
                                                                AccesorioN="Color de Pintura Exterior: Helios Yellow";
                                                            break;
                                                            case 11:
                                                                AccesorioN="Color de Pintura Exterior: Sonic Gray";
                                                            break;
                                                            case 12:
                                                                AccesorioN="Color de Pintura Exterior: Polished Metal";
                                                            break;
                                                            case 13:
                                                                 reame=1;//fuerza la repeticion del ciclo es un constante
                                                            break;
                                                        }//fin del switch de pintura   
                                               break;//fin case de pintura
                                               case 3:
                                                   System.out.println("Seleccion de Aros \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Tipos de Aros: \n");
                                                   System.out.println("1) 15 pulgadas - US 00.00");
                                                   System.out.println("2) 16 pulgadas - US 00.00");
                                                   System.out.println("3) 17 pulgadas - US 1688.00");
                                                   System.out.println("4) 18 pulgadas - US 1700.00");
                                                   System.out.println("5) 19 pulgadas - US 3011.00");
                                                   System.out.println("6) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese Los Aros que desee");
                                                   op3sub=s.nextInt();
                                                   switch(op3sub){
                                                       case 1:
                                                          AccesorioN="Tipo De Aro: 15 pulgadas";
                                                          AccesorioP=0.00;
                                                       break;
                                                       case 2:
                                                          AccesorioN="Tipo De Aro: 16 pulgadas";
                                                          AccesorioP=0.00;
                                                       break;
                                                       case 3:
                                                          AccesorioN="Tipo De Aro: 17 pulgadas";
                                                          AccesorioP=1688.00;
                                                       break;
                                                       case 4:
                                                          AccesorioN="Tipo De Aro: 18 pulgadas";
                                                          AccesorioP=1700.00;
                                                       break;
                                                       case 5:
                                                           AccesorioN="Tipo De Aro: 19 pulgadas";
                                                           AccesorioP=3011.0000;
                                                       break;
                                                       case 6:
                                                           reame=1;//fuerza la repeticion del ciclo 
                                                       break;//marca el regreso
                                                   }//fin del switch case 3
                                               break;//fin Case de Aros
                                               case 4:
                                                   System.out.println("Seleccion de Accesorios Externos \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Tipos de Accesorios Exteriores: \n");
                                                   System.out.println("1)  Body Side Molding - 217.00");
                                                   System.out.println("2)  Car Cover - 230.00");
                                                   System.out.println("3) Decklid Spoiler - 299.99");
                                                   System.out.println("4) Door Edge Film - 42.00");
                                                   System.out.println("5) Door Edge Guards - 84.00");
                                                   System.out.println("6) Door Trim Chrome - 285.00");
                                                   System.out.println("7) Door Visor - 185.00");
                                                   System.out.println("8) Front Fender Emblems - 50.00");
                                                   System.out.println("9) Rear Bumper Applique - 70.00");
                                                   System.out.println("10) Fog Lights - 325.00");
                                                   System.out.println("11) Nose Mascs - 158.00");
                                                   System.out.println("12) Moonrof Viso - 138.00");
                                                   System.out.println("13) Splash Guard Set - 104.00");
                                                   System.out.println("14) Dust Cover - 350.00");
                                                   System.out.println("15) Door Mirror Cover - Carbon Fiber - 520.00");
                                                   System.out.println("16) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese el Accesorio Externo que desea: ");
                                                   op3sub=s.nextInt();
                                                   switch(op3sub){
                                                       case 1:
                                                           AccesorioN="Accesorio Exterior: Body Side Molding";
                                                           AccesorioP= 217.00;
                                                       break;
                                                       case 2:
                                                           AccesorioN="Accesorio Exterior: Car Cover";
                                                           AccesorioP=230.00;
                                                       break;
                                                       case 3:
                                                           AccesorioN="Accesorio Exterior: Decklid Spoiler";
                                                           AccesorioP=299.99;
                                                       break;
                                                       case 4:
                                                           AccesorioN="Accesorio Exterior: Door Edge Film";
                                                           AccesorioP=42.00;
                                                       break;
                                                       case 5:
                                                           AccesorioN="Accesorio Exterior: Door Edge Guards ";
                                                           AccesorioP=84.00;
                                                       break;
                                                       case 6:
                                                           AccesorioN="Accesorio Exterior: Door Trim Chrome";
                                                           AccesorioP=285.00;
                                                       break;
                                                       case 7:
                                                           AccesorioN="Accesorio Exterior: Door Visor";
                                                           AccesorioP=185.00;
                                                       break;
                                                       case 8:
                                                           AccesorioN="Accesorio Exterior: Front Fender Emblems";
                                                           AccesorioP=50.00;
                                                       break;
                                                       case 9:
                                                           AccesorioN="Accesorio Exterior: Rear Bumper Applique";
                                                           AccesorioP=70.00;
                                                       break;
                                                       case 10:
                                                           AccesorioN="Accesorio Exterior: Fog Lights";
                                                           AccesorioP=325.00;
                                                       break;
                                                       case 11:
                                                           AccesorioN="Accesorio Exterior: Nose Mascs";
                                                           AccesorioP=158.00;
                                                       break;
                                                       case 12:
                                                           AccesorioN="Accesorio Exterior: Moonrof Viso";
                                                           AccesorioP=138.00;
                                                       break;
                                                       case 13:
                                                           AccesorioN="Accesorio Exterior: Splash Guard Set";
                                                           AccesorioP=104.00;
                                                       break;
                                                       case 14:
                                                           AccesorioN="Accesorio Exterior: Dust Cover";
                                                           AccesorioP=350.00;
                                                       break;
                                                       case 15:
                                                           AccesorioN="Accesorio Exterior: Door Mirror Cover - Carbon Fiber";
                                                           AccesorioP=520.00;
                                                       break;
                                                       case 16:
                                                           reame=1;
                                                       break;
                                                   }
                                               break;//fin case 4
                                               case 5:
                                                   System.out.println("Seleccion de Accesorios Interiores \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Tipos de Accesorios Interiores: \n");
                                                   System.out.println("1) All-Seasons Floor Mats - 142.00");
                                                   System.out.println("2) Automatic-Dimming Mirror - 219.00");
                                                   System.out.println("3) Cargo Hook - 12.00");
                                                   System.out.println("4) Cargo Net - 49.00");
                                                   System.out.println("5) Console Illumination - 250.00");
                                                   System.out.println("6) Cargo Organizer - 87.00");
                                                   System.out.println("7) Door Panel Protector - 149.00");
                                                   System.out.println("8) Armrest Compartiment - 337.00");
                                                   System.out.println("9) Door Sill Trim-Illuminated - 290.00");
                                                   System.out.println("10) Cargo Cover - 166.00");
                                                   System.out.println("11) Cargo Liner - 187.00");
                                                   System.out.println("12) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese El Accesorio Interior que desea");
                                                   op3sub=s.nextInt();
                                                   switch(op3sub){
                                                       case 1:
                                                           AccesorioN="Accesorio Interior: All-Seasons Floor Mats";
                                                           AccesorioP= 142.00;
                                                       break;
                                                       case 2:
                                                           AccesorioN="Accesorio Interior: Automatic-Dimming Mirror";
                                                           AccesorioP=219.00;
                                                       break;
                                                       case 3:
                                                           AccesorioN="Accesorio Interior: Cargo Hook";
                                                           AccesorioP=12.00;
                                                       break;
                                                       case 4:
                                                           AccesorioN="Accesorio Interior: Cargo Net";
                                                           AccesorioP=49.00;
                                                       break;
                                                       case 5:
                                                           AccesorioN="Accesorio Interior: Console Illumination";
                                                           AccesorioP=250.00;
                                                       break;
                                                       case 6:
                                                           AccesorioN="Accesorio Interior: Cargo Organizer";
                                                           AccesorioP=87.00;
                                                       break;
                                                       case 7:
                                                           AccesorioN="Accesorio Interior: Door Panel Protector";
                                                           AccesorioP=149.00;
                                                       break;
                                                       case 8:
                                                           AccesorioN="Accesorio Interior: Armrest Compartiment";
                                                           AccesorioP=337.00;
                                                       break;
                                                       case 9:
                                                          AccesorioN="Accesorio Interior: Door Sill Trim-Illuminated ";
                                                           AccesorioP=290.00;
                                                       break;
                                                       case 10:
                                                           AccesorioN="Accesorio Interior: Cargo Cover";
                                                           AccesorioP=166.00;
                                                       break;
                                                       case 11:
                                                           AccesorioN="Accesorio Interior: Cargo Liner";
                                                           AccesorioP=187.00;
                                                       break;
                                                       case 12:
                                                           reame=1;
                                                       break;
                                                   }
                                               break;//fin case 5
                                               case 6:
                                                   System.out.println("Seleccion de Accesorios Electricos \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Tipos de Accesorios Electricos: \n");
                                                   System.out.println("1) Wireless Phone Charger - US 305.00");
                                                   System.out.println("2) USB Charger - 2.1 Amp - US 120.00");
                                                   System.out.println("3) Puddle Light - US 185.00");
                                                   System.out.println("4) Parking Sensors - US 514.00");
                                                   System.out.println("5) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese el Accesorio Electrico que desee");
                                                   op3sub=s.nextInt();
                                                   switch(op3sub){
                                                       case 1:
                                                          AccesorioN="Accesorio Electrico: Wireless Phone Charger";
                                                          AccesorioP=305.00;
                                                       break;
                                                       case 2:
                                                          AccesorioN="Accesorio Electrico: USB Charger - 2.1 Amp";
                                                          AccesorioP=120.00;
                                                       break;
                                                       case 3:
                                                          AccesorioN="Accesorio Electrico: Puddle Light";
                                                          AccesorioP=185.00;
                                                       break;
                                                       case 4:
                                                         AccesorioN="Accesorio Electrico: Parking Sensors ";
                                                          AccesorioP=14.00;
                                                       break;
                                                       case 5:
                                                           reame=1;//constante dije :u 
                                                       break;
                                                   }//fin del switch   
                                               break;//fin case 6
                                               case 7:
                                                   AccesorioP=0.00;
                                                   System.out.println("Seleccion de Color De Tapiceria \n");
                                                   System.out.println("Usted Ha Seleccionado: " + AutoN);
                                                   System.out.println("Colores pal tapiz : \n");
                                                   System.out.println("1) Gray Cloth - US 0.00");
                                                   System.out.println("2) Black Cloth - US 0.00");
                                                   System.out.println("3) Black/Gray Cloth - US 0.00");
                                                   System.out.println("4) Red/Black Suede Effect-Fabric - US 0.00");
                                                   System.out.println("5) Regresar a selección de amenidades");
                                                   System.out.println("Ingrese el color que desee");
                                                   op3sub=s.nextInt();
                                                   switch(op3sub){
                                                       case 1:
                                                           AccesorioN="Color De Tapiceria: Gray Cloth";
                                                       break;
                                                       case 2:
                                                           AccesorioN="Color De Tapiceria: Black Cloth";
                                                       break;
                                                       case 3:
                                                           AccesorioN="Color De Tapiceria: Black/Gray Cloth";
                                                       break;
                                                       case 4:
                                                           AccesorioN="Color De Tapiceria: Red/Black Suede Effect-Fabric";
                                                       break;
                                                       case 5:
                                                          reame=1;
                                                       break;
                                                   }    
                                               break;//Fin caso 7
                                               case 8:
                                               regama=1;    
                                               break;
                                           }//fin del switch del menu de amenidades
                                           
                                           }//fin del else de las incongruencias
                                           if(op3==8){//filtro para el case 8
                                           
                                           }
                                           else if(reame==1){//filtro para el case constante, fuerza el repetidor xd
                                           
                                           }
                                           else if(op3>8 || op3<1 || incongruencia == 1){
                                               System.out.println("error 404");
                                               op1=0;
                                               reame=0;
                                               regama=0;
                                           }
                                           
                                           else{
                                               if(!"".equals(CollectorN)){
                                               CollectorN=CollectorN+ "," +AccesorioN + " - " + "USD" + AccesorioP;
                                               }
                                               else{
                                               CollectorN=CollectorN+AccesorioN+" - "+"USD"+AccesorioP;
                                               }
                                               CollectorP=CollectorP+AccesorioP;
                                               Total=AutoP+CollectorP;
                                               String[] split = CollectorN.split(",");
                                               System.out.println("Ha seleccionado la gama: " + AutoN + " - " +" USD " + AutoP);
                                               System.out.println("Amenidades: ");
                                               for (int i = 0; i < split.length; i++) {
                                                 System.out.println(split[i]); 
                                                }
                                               System.out.println("Total: " + Total);
                                               System.out.println("Desea agregar alguna otra amenidad mas? (s/n");
                                               Agregamenidades=s.next();
                                               if ("S".equals(Agregamenidades) || "s".equals(Agregamenidades)) {
                                                   reame=1;
                                                   array[g]=op3;//almacena las opciones previas para evitar sufragio xd
                                                   if(g>7){
                                                   g=g;
                                                   }
                                                   else{
                                                   g=g+1;//espacio para el vector
                                                   }
                                                   
                                                 
                                               }
                                               else{
                                               System.out.println("Ha seleccionado la gama: " + AutoN + " - " +" USD " + AutoP);
                                               System.out.println("Amenidades: ");
                                               for (int i = 0; i < split.length; i++) {//esta onda corta a la variable recolectora y los imprime
                                                 System.out.println(split[i]); 
                                                }
                                               System.out.println("Total: " + Total);
                                                   System.out.println("presione 1 para menu principal");
                                                   adorno= s.next();
                                                   if ("1".equals(adorno)) {
                                                       regama=0;
                                                       op1=1;
                                                   }
                                                           
                                               }   
                                           }//esta es la ejecucion evitando bugs       
                                        } while (reame==1);//ciclo de amenidades
                                       
                                       if (op1==1) {//juzga el adorno cuando es 1, para que se repita el ciclo
                                                  
                                       }
                                       else{
                                       op1=0; //anula el ciclo de menu principal
                                       }  
                                   }
                                   else if("N".equals(ame) || "n".equals(ame) ){
                                       System.out.println("Gama Seleccionada: "+ AutoN + " USD " + AutoP);
                                       System.out.println("Total: " + AutoP);
                                       System.out.println("Ingrese 1 para regresar al menu principal");
                                       adorno=s.next();
                                       op1=1;
                                   }   
                                   else{
                                       System.out.println("error 404");
                                       op1=0; //anula el ciclo de menu principal 
                                   }
                        }  
                    } while (regama==1);
                    break;//break del menu de autos            
                case 2:
                    System.out.println("De nada, vuelva pronto");
                    System.out.println("ingrese 1 para salir");
                    adorno=s.next();
                break;
            }  
        } while (op1 == 1);
        
       
       
       
       
        
        
        
        
        
    }
    
}
