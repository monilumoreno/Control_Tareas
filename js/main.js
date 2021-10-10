function seleccionGrado {
    const lista = document.getElementById("cursos")
    const myList = [id = "cursos"]

    const fragment = document.createDocumentFragment();

    myList.forEach((item) => {
        const li = document.createElement("li")
        li.textContent = item
        fragment.appendChild(li)

    });

}