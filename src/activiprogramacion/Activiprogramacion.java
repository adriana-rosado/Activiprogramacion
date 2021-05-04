/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activiprogramacion;

/**
 *
 * @author Sonia
 */
import java.util.Scanner;
public class Activiprogramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("------ Bienvenido ------");
        System.out.println("=========================");
        System.out.println();
        
        System.out.print("1:- Codigo Morse \n2:- Star Wars \n3:- Quizz Sobre Java");
        System.out.println();
        System.out.println();
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        System.out.println();
        //metodo donde se encuentra el Switch
        escoger(numero);

    }
    //El case
    public static void escoger(int numeroEscogido){
        
        Scanner entrada = new Scanner(System.in);
        
        switch(numeroEscogido){
            case 1:
                
                System.out.println("=========================");
                System.out.println("------ CÓDIGO MORSE ------");
                System.out.println("=========================");
                System.out.println();
                
                System.out.println("Introduce una frase: ");
                String frase = entrada.nextLine().toUpperCase();

                char carFrase[] = frase.toCharArray();

                arrayList();
                //bucle para imprimir el codigo morse
                bucle(frase, carFrase);
                System.out.println(Pago(frase, carFrase));
                break;
                
            case 2:
                
                System.out.println("=======================");
                System.out.println("------ STAR WARS ------");
                System.out.println("=======================");
                System.out.println();
                
                System.out.println("Introduzca el sexo");
                System.out.println("male, female, n/a, hermaphrodite");
                String genero = entrada.nextLine();
                //matriz de los personajes
                Personajes();
                //bucle donde se imprimiran los personajes correspondientes
                recorrido(genero);
                break;
                
            case 3:
                
                System.out.println("===========================");
                System.out.println("---- QUIZZ SOBRE JAVA -----");
                System.out.println("===========================");
                System.out.println();
                
                //matriz de preguntas
                preguntasQuizz();
                //matriz de incisos
                incisosQuizz();
                //bucle donde se recorreran las preguntas y preguntaran las
                //respuestas, se incrementara el contador
                recorrido();
                System.out.println();
                System.out.println("Obtuviste un " + contador + "0 de Calificacion");
                break;
                
            default:
                System.out.println("Introduce un numero correcto");
        
        }
    }
    //¡¡CÓDIGO MORSE!!
    
    public static String[][] aCodigo;
    
    public static void arrayList(){
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        // Arreglo con representación del Alfabeto
        // En código Morse
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }
    public static String caracter(char car) {
  
        int numCa = (int) car;
        return aCodigo[numCa - 65][0] + " " + aCodigo[numCa - 65][1];
    }
    
    public static void bucle(String frase, char carFrase[]){
        //bucle para imprimir el codigo
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            //si el if no se cumple imprimira el caracter correspondiente
            } else {
                System.out.println(caracter(carFrase[i]));
            }
        }
    }
    public static String Pago(String frase, char carFrase[]){
        //inicialice con uno porque me cuenta los espacios, en la primera 
        //palabra no hay espacio. El inicializarlo con uno ya me estaria
        //contando una palabra
        int contador = 1;
        int precio = 0;
        //bucle para obtener el contador de los espacios
        //los espacios indican una palabra nueva
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador++;
            }
        }
        //cree un if mientras para el contador que es igual o menor a 5 sean 10 pesos
        if(contador <= 5){
            precio = 10;
        //mientras el contador sea mayor
        //el contador se resta( - 5) y al resultado se le multiplica (* 3) y se le sumara 10
        } else{
            precio = ((contador - 5) * 3) + 10;
        }
        return "Numero de palabras: " + contador + "\n" + "Son $" + precio + " pesos";
    }
    
    // ¡¡STAR WARS!!
    
    static String[][] aPersonajes; 
    static String sexo;
    
    public static void Personajes(){
        
        aPersonajes = new String[16][3];
            
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male"; 
    }
    
    public static void recorrido(String genero){
        sexo = genero;
        for (int i = 0; i < aPersonajes.length; i++) {
            //si el personaje es igual al sexo introducido
            //imprimira los datos
            if(aPersonajes[i][2].equals(sexo)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    //¡¡QUIZZ JAVA!!
    
    public static String[][] preguntas;
    public static String[][] incisos;
    public static int contador;

    public static void preguntasQuizz() {
        preguntas = new String[10][2];
        preguntas[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        preguntas[0][1] = "0";
        preguntas[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        preguntas[1][1] = "1";
        preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        preguntas[2][1] = "2";
        preguntas[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        preguntas[3][1] = "0";
        preguntas[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        preguntas[4][1] = "1";
        preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        preguntas[5][1] = "2";
        preguntas[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        preguntas[6][1] = "0";
        preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        preguntas[7][1] = "1";
        preguntas[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        preguntas[8][1] = "2";
        preguntas[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        preguntas[9][1] = "0";
    }

    public static void incisosQuizz() {
        incisos = new String[10][3];
        incisos[0][0] = "System.out.println( Hello World );";
        incisos[0][1] = "echo( Hello World );";
        incisos[0][2] = "print ( Hello World );";
        incisos[1][0] = "/* This is a comment";
        incisos[1][1] = "// This is a comment";
        incisos[1][2] = "# This is a comment";
        incisos[2][0] = "myString";
        incisos[2][1] = "string";
        incisos[2][2] = "String";
        incisos[3][0] = "int x = 5;";
        incisos[3][1] = "num x = 5";
        incisos[3][2] = "x = 5;";
        incisos[4][0] = "><";
        incisos[4][1] = "==";
        incisos[4][2] = "<>";
        incisos[5][0] = "{}";
        incisos[5][1] = "()";
        incisos[5][2] = "[]";
        incisos[6][0] = "class";
        incisos[6][1] = "MyClass";
        incisos[6][2] = "class()";
        incisos[7][0] = "class MyClass = new myObj();";
        incisos[7][1] = "MyClass myObj = new MyClass();";
        incisos[7][2] = "new myObj = MyClass();";
        incisos[8][0] = "%";
        incisos[8][1] = "X";
        incisos[8][2] = "*";
        incisos[9][0] = "if (x > y)";
        incisos[9][1] = "if x > y;";
        incisos[9][2] = "if x > y then;";
    }

    public static void recorrido(){
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        //entrara un bucle de la longitud de la matriz
        for (int i = 0; i < preguntas.length; i++) {
            //imprime las preguntas con 3 posibles respuestas
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(preguntas[i][0]);
            System.out.println("0.- " + incisos[i][0]);
            System.out.println("1.- " + incisos[i][1]);
            System.out.println("2.- " + incisos[i][2]);
            System.out.println();
            System.out.print("Escribe tu respuesta: ");
            respuesta = entrada.nextLine();
            //si la respuesta es correcta el contador aumenta
            if(preguntas[i][1].equals(respuesta)){
                contador++;
            }
        }
    }
    
    public static int contador(){
        return contador;
    }
    
    
}
