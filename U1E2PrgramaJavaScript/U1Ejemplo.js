// mi array extraido
var cadena = new Array();
// Objeto para recoger datos de un URL 
var Txt = new XMLHttpRequest();
var ruta = 'texto.txt';
Txt.open("GET", ruta, false);
//Realizar la petición
Txt.send(null);
var txt = Txt.responseText;
var vali = 0, back = "";

//Ojo al escribir la oracion en el txt considerar los espacio 
function comparciones(cadena) {
    let valida = ["Instituto", "tecnologico", "de", "Mexico"];
    var espacio = " ", vector = cadena.split(espacio);


    for (let index = 0; index < vector.length; index++) {
        console.log(vector[index]);

    }


    //menos indices
    if (valida.length != vector.length) {
        vali = 1;
    }



    for (let i = 0; i < valida.length; i++) {
        for (let j = 0; j < vector.length; j++) {

            if (valida[i] == vector[j]) {


                //La variable back almacen el retorno
                back += vector[j] + "  ";

                //Elimina posibles casos
                vector[j] = "0";
            }// if

        }

    }//for





}
comparciones(txt);



if (vali == 1) {
    document.write("<br>Cantidad de indices invalidad");
} else {

    document.write("<br>Oracion acomodada: <br>" + back);
}


