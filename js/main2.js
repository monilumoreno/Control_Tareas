function grados() {
    grado = document.getElementById('grado');

    var prueba = grado.value;
    limpiar(); //funcion invocada para limpiar dropdown de materias
    switch (prueba) {
        case "6-1":

            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];
            break;
        case "6-2":

            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];

            break;
        case "7-1":
            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];

            break;
        case "7-2":
            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];

            break;
        case "8-1":
            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];

            break;
        case "8-2":
            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];

            break;
        case "9-1":
            var materias = ["Biología",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Tecnología",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales"
            ];

            break;
        case "10-1":
            var materias = ["Química",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Ciencias Políticas",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales",
                "Filosofía",
                "Física"
            ];

            break;
        case "11-1":
            var materias = ["Química",
                "Agropecuaria",
                "Español",
                "Informatica",
                "Ciencias Políticas",
                "Artística",
                "Educación Física",
                "Ética",
                "Matemáticas",
                "Inglés",
                "Sociales",
                "Filosofía",
                "Física",
                "emprendimiento"
            ];

            break;
    };

    for (option = 0; option < materias.length; option++) { //contador del array de materias
        let option1 = document.createElement("option"); //creamos elemento option de html
        option1.setAttribute("value", materias[option]); //añadimos el valor del elemento option
        let option1Texto = document.createTextNode(materias[option]); //añadimos el valor del elemnto option visible al usuario
        option1.appendChild(option1Texto); //añadimos el option a la lista 

        materia.appendChild(option1); //añadimos el option al dropdown
        document.body.appendChild(materia); //añadimos el dropdown al body del html 

    };

    function limpiar() { //funcion para limpiar el dropdown de materias
        materia = document.getElementById('materia');
        for (let i = materia.options.length; i >= 0; i--) {
            materia.remove(i);
        }
    };

}

//funcion para validar el boton consultar
function datos() {
    alert("Base de datos controlTareas")
}

//funcion para validar losbotones de check
function validarCheck() {
    document.getElementById(flexRadioDefault1).innerHTML = "Entrando a revision de tareas"
    alert("boton1")
}