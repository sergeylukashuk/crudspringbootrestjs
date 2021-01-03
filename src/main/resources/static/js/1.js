$(document).ready(function () {

    $("#addNewUser").submit(function (event) {
        event.preventDefault()

        /* let listRoles = '';
         for (let element of $("#role")) {
             listRoles += " " ;
         }*/
        let user = {
            name: $("#name").val(),
            last_name: $("#lastname").val(),
            age: $("#age").val(),
            email: $("#email").val(),
            password: $("#password").val(),
            roles: null
            //[{"id":1,"role":"ROLE_ADMIN"},{"id":2,"role":"ROLE_USER"}]
        }


        fetch('/rest/admin/new',
            {
                method: 'POST',
                headers: {'Content-Type': 'application/json'},
                body: JSON.stringify(user)
            })
            .then(result => console.log(result))
        window.location.href = "/admin"
    })

})