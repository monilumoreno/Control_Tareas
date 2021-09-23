// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.querySelectorAll('.needs-validation')


    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
        .forEach(function(form) {
            form.addEventListener('submit', function(event) {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                    var datosErroneos = document.getElementById('popover')
                    var popover = new bootstrap.Popover(datosErroneos, { container: "body", placement: "top" })
                    popover.show()
                    setTimeout(() => {
                        popover.hide()

                    }, 5000);

                }

                form.classList.add('was-validated')
            }, false)
        })
})()