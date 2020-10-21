
const editInfo = document.getElementById("modify-info");
const email = document.getElementById("email");
const name = document.getElementById("name");
const file = document.getElementById("in-file");


editInfo.addEventListener('click', function modify(){
    let userCotainer = document.getElementById('user-container');
    userCotainer.innerHTML = "";
    userCotainer.innerHTML = `
    <form action="" method="POST">
        <label for="edit-name" style="color:white; margin-top: 20px;">Edita name</label>
        <input type="text" name="edit-name" id="edit-name" value="${name.innerHTML}">
        <label for="edit-name" style="color:white; margin-top: 20px;">Correo (no-editable)</label>
        <input type="text" name="edit-name" id="edit-name"value="${email.innerHTML}">
        <button id="finish" class="btn btn-danger">Done!</button>
    </form>
    `;
});

file.addEventListener('change', function image(){
   console.log(file.files.name);
});