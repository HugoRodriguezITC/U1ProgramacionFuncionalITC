package u1practica1;

import java.io.File;
import java.util.Scanner;

class Operaciones {

    public String Leer() {
        int x = 0;
        //Cambiar la ruta en la variable
        String line = "", ruta = "C:\\Users\\Personal\\Documents\\7mo_Semestre\\texto.txt", arre[];
        try {
            Scanner read = new Scanner(new File(ruta));
            while (read.hasNextLine()) {
                line = read.nextLine();

                x++;
            }
            read.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return line;
    }

    public String conparación(String aux) {
        //Converción de cadena de parametro a  aun array
        String cadena[] = aux.split(" "), back = "";
        String valida[] = {"Esta", "es", "la", "materia", "logica"};
        int vali = 0;

        try {
            if (valida.length != cadena.length) {
                back = "No tienen el mismo numero de indeces";
            } else {
                //Filtra a los que si coinciden 
                for (int i = 0; i < valida.length; i++) {
                    for (int j = 0; j < cadena.length; j++) {
                        if (valida[i].equals(cadena[j])) {

                            vali++;
                            //La variable back almacen el retorno
                            back += cadena[j] + "  ";

                            //Elimina posibles casos
                            cadena[j] = "0";
                        }// if

                    }//for 2
                }// for 1

            }

        } catch (Exception error) {
            // System.out.println("Error:" + error.getMessage());
        }

        if (vali != valida.length) {
            System.out.println( vali + " palabra (s) fue escrita correctamente" );
        }

        return back;
    }

}
