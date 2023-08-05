import java.util.Scanner;
public class proyectoSudokuFin2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("NORMAS DEL SUDOKU\n");
    System.out.println(" Un sudoku consiste en un tablero de 81 huecos separado en 9 cuadrados de 3x3 ");
    System.out.println( " Partiendo de algunos números ya dispuestos en algunas de las casillas, hay que completar las casillas vacías con dígitos del 1 al 9 sin que se repitan por fila, columna o cuadrado.");
    System.out.println(" Los números que vienen preestablecidos no se pueden cambiar. Para cambiar un elemento introducido, elige la coordenada e introduce el valor 0 \n \n");
    
    //Sudoku dificultad muy sencilla. Extraído de internet
    int [][] sudoku1 = {{0,0,0,0,8,7,0,3,0}, {5,7,0,4,0,0,8,0,0}, {3,6,0,0,0,0,7,0,0}, {8,0,0,0,3,0,0,0,0}, {2,0,0,7,9,8,0,6,0}, {7,4,0,0,6,5,0,0,2}, {6,8,4,5,2,0,0,0,3}, {0,0,0,0,4,6,5,2,0}, {0,2,0,0,0,0,6,4,0}};
    int [][] sudoku1Negrita = {{0,0,0,0,8,7,0,3,0}, {5,7,0,4,0,0,8,0,0}, {3,6,0,0,0,0,7,0,0}, {8,0,0,0,3,0,0,0,0}, {2,0,0,7,9,8,0,6,0}, {7,4,0,0,6,5,0,0,2}, {6,8,4,5,2,0,0,0,3}, {0,0,0,0,4,6,5,2,0}, {0,2,0,0,0,0,6,4,0}};  
    int [][] sudoku1Solucion = {{4,9,1,6,8,7,2,3,5}, {5,7,2,4,1,3,8,9,6}, {3,6,8,9,5,2,7,1,4}, {8,1,6,2,3,4,9,5,7}, {2,5,3,7,9,8,4,6,1}, {7,4,9,1,6,5,3,8,2}, {6,8,4,5,2,9,1,7,3}, {1,3,7,8,4,6,5,2,9}, {9,2,5,3,7,1,6,8}};
    
    //Sudoku dificultad sencilla. Extraído de internet
    int [][] sudoku2 = {{0,0,4,7,2,0,0,0,0}, {0,2,8,1,0,0,7,0,6}, {7,0,0,8,9,3,2,1,0}, {0,4,0,5,0,1,0,0,0}, {0,1,0,0,7,9,0,0,8}, {0,0,6,0,4,0,0,9,1}, {0,9,7,0,0,0,0,8,5}, {2,0,0,6,0,0,9,0,0}, {0,0,0,0,8,0,0,0,0}};
    int [][] sudoku2Negrita = {{0,0,4,7,2,0,0,0,0}, {0,2,8,1,0,0,7,0,6}, {7,0,0,8,9,3,2,1,0}, {0,4,0,5,0,1,0,0,0}, {0,1,0,0,7,9,0,0,8}, {0,0,6,0,4,0,0,9,1}, {0,9,7,0,0,0,0,8,5}, {2,0,0,6,0,0,9,0,0}, {0,0,0,0,8,0,0,0,0}};
    int [][] sudoku2Solucion = {{1,3,4,7,2,6,8,5,9}, {9,2,8,1,5,4,7,3,6}, {7,6,5,8,9,3,2,1,4}, {8,4,9,5,6,1,3,7,2}, {5,1,2,3,7,9,4,6,8}, {3,7,6,2,4,8,5,9,1}, {6,9,7,4,3,2,1,8,5}, {2,8,3,6,1,5,9,4,7}, {4,5,1,9,8,7,6,2,3}};
    
    //Sudoku dificultad media. Extraído de internet
    int [][] sudoku3 = {{0,0,0,0,0,0,9,0,0}, {0,0,0,0,0,7,8,6,0}, {4,6,5,0,0,8,3,0,0}, {3,0,0,0,5,0,2,7,6}, {0,2,0,6,0,4,0,0,3}, {0,7,6,0,0,2,0,0,0}, {0,4,0,2,0,3,0,0,0}, {0,0,2,0,8,6,0,0,0}, {7,8,0,4,0,5,0,0,0}};
    int [][] sudoku3Negrita = {{0,0,0,0,0,0,9,0,0}, {0,0,0,0,0,7,8,6,0}, {4,6,5,0,0,8,3,0,0}, {3,0,0,0,5,0,2,7,6}, {0,2,0,6,0,4,0,0,3}, {0,7,6,0,0,2,0,0,0}, {0,4,0,2,0,3,0,0,0}, {0,0,2,0,8,6,0,0,0}, {7,8,0,4,0,5,0,0,0}};
    int [][] sudoku3Solucion = {{8,3,7,5,6,1,9,4,2}, {2,9,1,3,4,7,8,6,5}, {4,6,5,9,2,8,3,1,7}, {3,1,4,8,5,9,2,7,6}, {5,2,8,6,7,4,1,9,3}, {9,7,6,1,3,2,5,8,4}, {6,4,9,2,1,3,7,5,8}, {1,5,2,7,8,6,4,3,9}, {7,8,3,4,9,5,6,2,1}};
    
    //Sudoku dificultad difícil. Extraído de internet
    int [][] sudoku4 = {{0,0,0,0,0,3,0,1,0}, {4,0,0,0,0,0,0,0,2}, {0,6,0,1,2,9,3,0,0}, {0,4,0,6,0,0,8,0,9}, {0,0,0,9,0,0,0,5,0}, {0,0,8,0,1,0,0,0,7}, {0,0,0,4,0,1,0,0,3}, {3,1,0,0,7,0,5,0,8}, {9,7,0,0,3,5,0,0,0}};
    int [][] sudoku4Negrita = {{0,0,0,0,0,3,0,1,0}, {4,0,0,0,0,0,0,0,2}, {0,6,0,1,2,9,3,0,0}, {0,4,0,6,0,0,8,0,9}, {0,0,0,9,0,0,0,5,0}, {0,0,8,0,1,0,0,0,7}, {0,0,0,4,0,1,0,0,3}, {3,1,0,0,7,0,5,0,8}, {9,7,0,0,3,5,0,0,0}};
    int [][] sudoku4Solucion = {{2,8,9,7,4,3,6,1,5}, {4,3,1,5,6,8,9,7,2}, {7,6,5,1,2,9,3,8,4}, {1,4,7,6,5,2,8,3,9}, {6,2,3,9,8,7,4,5,1}, {5,9,8,3,1,4,2,6,7}, {8,5,6,4,9,1,7,2,3}, {3,1,4,2,7,6,5,9,8}, {9,7,2,8,3,5,1,4,6}}; 
    
    //Sudoku dificultad extrema. Extraído de internet
    int [][] sudoku5 = {{0,7,0,5,0,0,0,2,6}, {0,0,0,0,0,6,5,0,0}, {0,0,0,0,4,0,0,0,7}, {0,0,9,0,0,8,0,5,0}, {0,4,0,0,0,0,2,0,0}, {0,0,0,0,6,0,0,4,3}, {0,9,0,0,0,3,7,0,2}, {0,0,0,8,0,0,0,0,0}, {2,8,0,0,0,5,0,0,0}};
    int [][] sudoku5Negrita = {{0,7,0,5,0,0,0,2,6}, {0,0,0,0,0,6,5,0,0}, {0,0,0,0,4,0,0,0,7}, {0,0,9,0,0,8,0,5,0}, {0,4,0,0,0,0,2,0,0}, {0,0,0,0,6,0,0,4,3}, {0,9,0,0,0,3,7,0,2}, {0,0,0,8,0,0,0,0,0}, {2,8,0,0,0,5,0,0,0}};
    int [][] sudoku5Solucion = {{8,7,3,5,9,1,4,2,6}, {4,1,2,7,8,6,5,3,9}, {9,6,5,3,4,2,8,1,7}, {7,2,9,4,3,8,6,5,1}, {3,4,6,1,5,9,2,7,8}, {1,5,8,2,6,7,9,4,3}, {5,9,4,6,1,3,7,8,2}, {6,3,7,8,2,4,1,9,5}, {2,8,1,9,7,5,3,6,4}};
    
    // Dependiendo del modo de juego que se elija, asignaremos a tablero, tablero solución y tablero negrita a nuestra función jugar
    int [][] tablero = new int[9][9];
    int [][] tableroSol = new int[9][9];
    int [][] negritaa = new int [9][9];
    
    //Implementamos variables para volver a jugar
    //Reiniciar todo el programa
    int volver=0;
    //Reiniciar lo escrito por el usuario
    int volverMismoTablero=0;
    do{
    limpiar(tablero);
    volverMismoTablero=0;
    //Elección del modo de juego
    System.out.println("Seleccione el modo de juego: \n 1. Sudoku predefinido (solución única) \n 2. Sudoku aleatorio (puede no tener solución única)");
    //System.out.println("Seleccione el modo de juego: \n 1. Clásico, sin vidas \n 2. Con vidas \n 3. Sin solución única: tablero generado aleatoriamente");
    int modo1 = sc.nextInt();
    System.out.println("Seleccione la dificultad del juego: \n 1. Muy sencillo \n 2. Sencillo \n 3. Medio \n 4. Difícil \n 5. Extremo");
    int dificultad = sc.nextInt();
    
    //Según las elecciones, se mostrará un tablero u otro
    switch(modo1){
      // Caso 1: asignamos el sudoku según la dificultad elegida
      case 1: 
        if(dificultad == 1){
          tablero = sudoku1;
          tableroSol= sudoku1Solucion;
          negritaa = sudoku1Negrita;  
        }
        
        if(dificultad == 2){
          tablero = sudoku2;
          tableroSol= sudoku2Solucion;
          negritaa = sudoku2Negrita;
        }
        
        if(dificultad == 3){
          tablero = sudoku3;
          tableroSol= sudoku3Solucion;
          negritaa = sudoku3Negrita;
        }
        
        if(dificultad == 4){
          tablero = sudoku4;
          tableroSol= sudoku4Solucion;
          negritaa = sudoku4Negrita;
        }
        if(dificultad == 5){
          tablero = sudoku5;
          tableroSol= sudoku5Solucion;
          negritaa = sudoku5Negrita;
         
        } 
        System.out.println("¿Cómo desea jugar? \n 1. Clásico, sin vidas \n 2. Con vidas");
        int modo2=sc.nextInt();
        switch(modo2){
          case 1:
           // La función jugar devuelve un booleano, de manera que una vez completado el sudoku se mostrará por pantalla si has ganado o no
            do{
            //Si no es el primer intento ponemos el tablero con los valores que no se pueden cambiar
            if(volverMismoTablero==1){
              for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[i].length;j++){
                  tablero[i][j]=negritaa[i][j];
                }}}
            volverMismoTablero=0;
            if(jugar(tablero, tableroSol, negritaa))
              System.out.println("Enhorabuena, has completado el sudoku");
            else{
              System.out.println("Ooh, has perdido");
              System.out.println("¿Quiere volver a intentarlo? \n 1. Sí \n 2. No");
              volverMismoTablero=sc.nextInt();}
          }while(volverMismoTablero==1);
            break;
            
          case 2:
            // Con vidas, utilizaremos una función similar a la anterior, solo que con un parámetro <vidas> añadido 
            do{
            //Si no es el primer intento ponemos el tablero con los valores que no se pueden cambiar
            if(volverMismoTablero==1){
              for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero[i].length;j++){
                  tablero[i][j]=negritaa[i][j];
                }}}
            volverMismoTablero=0;
            System.out.println("Selecciona el número de vidas que quiere tener");
            int vidas = sc.nextInt();
            //Bucle para restringir las vidas a positivas
            while(vidas<=0){
              System.out.println("Las vidas no pueden ser 0 o un número negativo");
              vidas = sc.nextInt();}
            if (jugarVidas(tablero, tableroSol, negritaa, vidas))
              System.out.println("Enhorabuena, has completado el sudoku");
            else{
              System.out.println("Ooh, has perdido");
              System.out.println("¿Quiere volver a intentarlo? \n 1. Sí \n 2. No");
              volverMismoTablero=sc.nextInt();}
        }while(volverMismoTablero==1);
            break;
        }
        break;
        
      case 2:
        tableroSol = tableroAleatorio(tableroSol);
        darValores(tablero, tableroSol, dificultad);
        do{
          //Si no es el primer intento ponemos el tablero con los valores que no se pueden cambiar
          if(volverMismoTablero==1){
            for(int i=0;i<tablero.length;i++){
              for(int j=0;j<tablero[i].length;j++){
                tablero[i][j]=negritaa[i][j];
          }}}
          //Si es el primer intento asignamos los valores que no se puden cambiar
          else{
            for(int i=0;i<tablero.length;i++){
              for(int j=0;j<tablero[i].length;j++){
                negritaa[i][j]=tablero[i][j];
              }}}
        volverMismoTablero=0;
        if (jugarAleatorio(tablero, negritaa))
          System.out.println("Enhorabuena, has completado el sudoku");
        else{
          System.out.println("Ooh, has perdido");
          System.out.println("¿Quiere volver a intentarlo? \n 1. Sí \n 2. No");
          volverMismoTablero=sc.nextInt();}
      }while(volverMismoTablero==1);
        break;

      default: System.out.println("Error, introduce un modo adecuado"); 
    }
    System.out.println("¿Quiere volver a jugar? \n 1. Sí \n 2. No");
    volver=sc.nextInt();
    if(volver!=1)
      System.out.println("Gracias por jugar a nuestro sudoku");
    }while(volver==1);
  }
  
   // función para imprimir el sudoku
  public static String imprimir(int tabla[][]){
   // Indica el número de las columnas 
    String res = "\n            1     2     3      4     5     6      7     8     9\n\n\n";  
    for(int i=0;i<tabla.length;i++){
        if(i==3||i==6)
          res = res + "       =========================================================== \n";
        else if(i!=0)
          res = res+"\n";
        for(int j=0;j<tabla[i].length;j++){
          if(j==tabla[i].length-1)
            res=res+"|  "+tabla[i][j]+"  ||";
          else if(j==3||j==6)
            res=res+"||  "+tabla[i][j]+"  ";
          else if(j==0)
            // Indica el número de filas
            res=res+ (i+1) +"       ||  "+tabla[i][j]+"  ";
          else
            res=res+"|  "+tabla[i][j]+"  ";
        }
        res=res+"\n";    
    }
    // Al ser un vector de tipo entero, en los elementos vacíos introducimos el número 0. Posteriormente, al convertirlo en función sustituimos los 0's por espacios
    res = res.replace("0", " ");
    return res;
  }
  
  // Función que localiza e identifica los elementos fijos del sudoku para que estos no se puedan cambiar
  public static boolean negrita(int i, int j, int[][]sudokuNegrita){
    return sudokuNegrita[i][j]!=0;
  }
  
  // Devuelve true si todavía hay ceros en el sudoku
  public static boolean buscarCeros(int [][]sudoku){ 
    boolean res = false;
    for (int i=0; i<9 && !res; i++){
      for (int j =0; j<9 && !res; j++){
        res = sudoku[i][j] ==0;
      }
    }
    return res;
  }
    
  
  // La función principal que dirige el código(sin vidas)
  public static boolean jugar(int sudoku[][], int sudokuSolucion[][], int sudokuNegrita[][]){
    System.out.println("Comience a jugar");
    // Imprime el tablero
    System.out.println(imprimir(sudoku));
    int fila, columna, n;
    Scanner sc = new Scanner(System.in);
    // Permite al usuario cambiar los elementos hasta que ninguno sea 0. Una vez rellenado todos los elementos, transforma la matriz en String mediante la función imprimir y compara la solución (única) con el sudoku rellenado por el usuario
        while (buscarCeros(sudoku)){
          // Introducir las coordenadas del 1 al 9
          System.out.print("Introduce la fila: ");
          // Por definición las posiciones de un array se inicializan en cero, por ello para que los de las coordenadas vayan del 0-8 en vez del 1-9 disminuimos en una unidad
          fila = sc.nextInt()-1;
        while (fila>8 || fila<0){ // Bucle para restringir las filas a valores entre 1 - 9
          System.err.println("Solo puedes introducir de la fila 1 a la 9");
          System.out.print("Introduce la fila: ");
         fila = sc.nextInt()-1;
           }
  
        System.out.print("Introduce la columna:  ");
        columna= sc.nextInt()-1; 
        while (columna>8 || columna<0){// Bucle para restringir las columnas a valores entre 1 - 9
          System.err.println("Solo puedes introducir de la columna 1 a la 9");
          System.out.print("Introduce la columna:  ");
          columna = sc.nextInt()-1;
           }
          if(!negrita(fila, columna, sudokuNegrita)){// Los elementos que asigno como fijos en la función negrita no podrán cambiarse, pues son los valores predeterminados.
          System.out.print("Introduce el valor: ");
          n = sc.nextInt();
          while (n>9 || n<0){// Bucle para restringir las filas a los valores entre 0 - 9, siendo el 0 borrar el elemento de esa posición, siempre que no sea uno predeterminado
          System.err.println("Solo se pueden introducir numero del 1 al 9");
          System.out.print("Introduce el valor del 1 al 9, si desea cambiar un número introduce el 0: ");
          n = sc.nextInt();
           }
          sudoku[fila][columna] = n;// Asignación del número en el tablero
          System.out.println(imprimir(sudoku));}
          else
            System.err.println("No puedes cambiar valores predeterminados");

    }
    return imprimir(sudoku).equals(imprimir(sudokuSolucion));
  }
  
  
  //Es la misma función que la anterior exceptuando que esta está dirigida para el modo de juego con vidas.
  public static boolean jugarVidas(int sudoku[][], int sudokuSolucion[][], int sudokuNegrita[][], int vidas){
    System.out.println("Comience a jugar");
    boolean res = true;
    System.out.println(imprimir(sudoku));
    int fila, columna, n;
    Scanner sc = new Scanner(System.in);
    while (buscarCeros(sudoku) && res){
      System.out.print("Introduce la fila: ");
      fila = sc.nextInt()-1; 
        while (fila>8 || fila<0){
          System.err.println("Solo puedes introducir de la fila 1 a la 9");
          System.out.print("Introduce la fila: ");
         fila = sc.nextInt()-1;
           }
      System.out.print("Introduce la columna:  ");
      columna = sc.nextInt()-1; 
        while (columna>8 || columna<0){
          System.err.println("Solo puedes introducir de la columna 1 a la 9");
          System.out.print("Introduce la columna:  ");
      columna = sc.nextInt()-1;
           }
        
      if(!negrita(fila, columna, sudokuNegrita)){
        System.out.print("Introduce el valor");
        n = sc.nextInt(); 
        while (n>9 || n<0){
          System.err.println("Solo se pueden introducir números del 0 al 9");
          System.out.print("Introduce el valor del 1 al 9, si desea cambiar un número introduce el 0: ");
          n = sc.nextInt();
           }
        // Al ser solución única, siempre que el número introducido difiera con el número que ocupa su misma posición en la solución original disminuirán las vidas en 1.
        if (n !=sudokuSolucion[fila][columna])
          System.err.println("El número introducido no es correcto, te quedan " + --vidas + " vidas");
        else
          sudoku[fila][columna] = n;
        System.out.println(imprimir(sudoku));
      }
      else
        System.err.println("No puedes cambiar valores predeterminados");
      if (vidas==0) // Una vez que las vidas lleguen a 0 devuelve false aunque el tablero todavía no esté completo
        res = false;
    }
    return imprimir(sudoku).equals(imprimir(sudokuSolucion));
  }
  
  // Esta función es similar a la de jugar con solución única, solo que en vez de transformar la solución final a 
   // String y comparar si los dos Strings (la solución final que el usuario ha introducido y la solución correcta) son iguales,
   // hacemos un bucle que revise número a número que es compatible con los elementos de su fila, columna y cuadrado
   public static boolean jugarAleatorio(int sudoku[][], int [][]sudokuNegrita){
    System.out.println("Comience a jugar");
    int fila, columna, n;
    Scanner sc = new Scanner(System.in);
    System.out.println(imprimir(sudoku));
    for (int i=0; i<sudoku.length; i++){
      for (int j=0; j<sudoku[i].length; j++){
        while (sudoku[i][j]==0){
          System.out.print("Introduce la fila: ");
          fila = sc.nextInt()-1;
          while (fila>8 || fila<0){
            System.err.println("Solo puedes introducir de la fila 1 a la 9");
            System.out.print("Introduce la fila: ");
            fila = sc.nextInt()-1;
           }
          System.out.print("Introduce la columna:  ");
          columna = sc.nextInt()-1;
          while (columna>8 || columna<0){
            System.err.println("Solo puedes introducir de la columna 1 a la 9");
            System.out.print("Introduce la columna:  ");
            columna = sc.nextInt()-1;
           }
          
          if(!negrita(fila, columna, sudokuNegrita)){
          System.out.print("Introduce el valor: ");
          n = sc.nextInt();
          while (n>9 || n<0){
            System.err.println("Solo se pueden introducir números del 0 al 9");
            System.out.print("Introduce el valor del 1 al 9, si desea cambiar un número introduce el 0: ");
            n = sc.nextInt();
           }
          sudoku[fila][columna] = n;
          System.out.println(imprimir(sudoku));
          }
          else
            System.err.println("No puedes cambiar valores predeterminados");
        }
      }
    }
    return comprobar(sudoku);
  }
  
  // Función para asignar los 81 números del 1 hasta el 9. Para ello, recorro fila por fila y genero la posición aleatoriamente
  // Si esa posición, o ya está ocupada, o no se puede colocar el número, intenta colocarlo en la posición siguiente
  public static int[][] asignar(int sudoku[][]){
     int numero=1;
     int fila=0;
     int columna=0;
     boolean encontrado=false;
     int contador=0;
     while(numero<=9){
       fila=0;
       while(fila<9){
         encontrado=false;
         contador=0;
         while(!encontrado && contador<=9){
         if(contador==0)
           columna=((int) Math.floor(Math.random()*(9)));
         else if(columna==8)
             columna=0;
         else
             columna++;
           if(sudoku[fila][columna]==0){
             sudoku[fila][columna]=numero;
             if(esCompatibleFila(sudoku,fila,columna) && esCompatibleColumna(sudoku,fila,columna) && esCompatibleCuadrado(sudoku,fila,columna)){
               encontrado=true;}
             else{
               sudoku[fila][columna]=0;
               contador++;}}
           else
             contador++;}
       fila++;
       }
       numero++;
       contador=0;
     }
    return sudoku;
  }
  
  // Cogemos la función anterior, asignar con parámetro el sudoku que genera, comprobamos si está totalmente relleno, si no, vuelve a generarlo
  public static int[][] tableroAleatorio(int[][]sudoku){
    asignar(sudoku);
    while (buscarCeros(sudoku)){
      for (int i=0; i<9; i++){
        for (int j=0; j<9; j++){
          sudoku[i][j]=0;
        }
      }
      asignar(sudoku);
    }
    return sudoku;
  }
  
  // Selecciono la fila y convierto la fila en un vector
  public static boolean esCompatibleFila(int sudoku[][], int fila, int columna){
    boolean res=true;
    int filaVector[]={sudoku[fila][0],sudoku[fila][1],sudoku[fila][2],sudoku[fila][3],sudoku[fila][4],sudoku[fila][5],sudoku[fila][6],sudoku[fila][7],sudoku[fila][8]};
  // Comprueba que el número que queremos introducir es distinto de todos los números del vector
  // Para ello, comprueba con todos los números, salvo con él mismo, que transforma en 0
    filaVector[columna]=0;
    int i=0;
    while(i<9 && res){
      if(sudoku[fila][columna]==filaVector[i])
        res=false;
      i++;
    }
  return res;
  }

  // Selecciono la columna y convierto la columna en un vector
  public static boolean esCompatibleColumna(int sudoku[][], int fila,int columna){
    boolean res=true;
    int columnaVector[]={sudoku[0][columna],sudoku[1][columna],sudoku[2][columna],sudoku[3][columna],sudoku[4][columna],sudoku[5][columna],sudoku[6][columna],sudoku[7][columna],sudoku[8][columna]};
    // Comprueba que el número que queremos introducir es distinto de todos los números del vector
    // Para ello, comprueba con todos los números, salvo con él mismo, que transforma en 0
    columnaVector[fila]=0;
    int i=0;
    while(i<9 && res){
      if(sudoku[fila][columna]==columnaVector[i])
        res=false;
      i++;
    }
  return res;
  }
 
  
  // Buscamos si el número introducido es compatible dentro de su cuadrado. Las variables a y b representan las posiciones de los cuadrados
  // Nos quedamos con una matriz 3x3, que posteriormente, extendemos a una fila 1x9
  public static boolean esCompatibleCuadrado(int sudoku[][], int fila, int columna){
    boolean res=true;
    int a=0;
    int b=0;
    switch(fila){
      case 0: case 1: case 2:
        switch(columna){
          case 3: case 4: case 5: b=1; break;  
          case 6: case 7: case 8: b=2; break; 
          }
        break;
      case 3: case 4: case 5: a=1;
        switch(columna){
          case 3: case 4: case 5: b=1; break;   
          case 6: case 7: case 8: b=2; break;
        }
        break;
      case 6: case 7: case 8: a=2;
        switch(columna){
          case 3: case 4: case 5: b=1; break; 
          case 6: case 7: case 8: b=2; break; 
        }
        break;
    }
    
    // Ponemos los elementos del cuadrado en un vector unidimensional
    int cuadrado[]={sudoku[0+a*3][0+b*3],sudoku[0+a*3][1+b*3],sudoku[0+a*3][2+b*3],sudoku[1+a*3][0+b*3],sudoku[1+a*3][1+b*3],sudoku[1+a*3][2+b*3],sudoku[2+a*3][0+b*3],sudoku[2+a*3][1+b*3],sudoku[2+a*3][2+b*3]};
    
    // Comprueba que el número que queremos introducir es distinto de todos los números del vector
    // Para ello, comprueba con todos los números, salvo con él mismo, que transforma en 0
    // Mediante la siguiente operación, asignamos la posición fila y columna que tenía en la matriz inicial 9x9 al vector unidimensional
    cuadrado[(fila-3*a)*3+columna-3*b]=0;
    int i=0;

    while(i<9 && res){
      if(sudoku[fila][columna]==cuadrado[i])
        res=false;
      i++;
    }
   return res;
  }
   
   // El elemento que se quiere introducir es evaluado en fila, columna y cuadrado. Devuelve true si no se repite ni con fila, columna ni cuadrado
   public static boolean comprobar(int sudoku[][]){
     boolean res=true;
     int i=0;
     int j=0;
     while(i<9 && res){
       j=0;
       while(j<9 && res){
         if(esCompatibleFila(sudoku,i,j)==false || esCompatibleColumna(sudoku,i,j)==false || esCompatibleCuadrado(sudoku,i,j)==false)
           res=false;
         j++;
       }
       i++;
     }
     return res;
   }
   
   // Se selecciona del tablero de 81 números generado aleatoriamente n (depende de la dificultad introducida) elementos que se muestran para jugar
   public static void darValores(int sudoku[][], int sudokuSol[][], int dificultad){
    int n=0;
    switch(dificultad){
      case 1: n=70; break;
      case 2: n=60; break;
      case 3: n=45; break;
      case 4: n=30; break;
      case 5: n=17; break;
      default: System.out.println("Error, introduce un número de dificultad adecuado");
    }
    
    //Introduce en el tablero de juego n números cogidos al azar del tablero completo:
    int i=0;
    while(i<n){
      int fila, columna;
      fila=((int) Math.floor(Math.random()*(9)));
      columna=((int) Math.floor(Math.random()*(9)));
      if(sudoku[fila][columna]==0){
        sudoku[fila][columna]=sudokuSol[fila][columna];
        i++;
      }
    }
  }
   
   //Elimina todos los valores del array
   public static void limpiar(int array[][]){
     for(int fila=0;fila<array.length;fila++){
       for(int columna=0;columna<array.length;columna++){
         array[fila][columna]=0;
       }
     }  
   }
}