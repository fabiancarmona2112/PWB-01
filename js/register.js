
const getSubmit = document.getElementsByName("register-box");
const submitBtn = document.getElementById('submitInfo');

function mailVal (email){

    let flag = false;

    if(/^\w+([\.-]?\w+)*@(?:|hotmail|outlook|yahoo|live|gmail)\.(?:|com|es)+$/.test(email.value)){
        flag = true;
    }

    else{
        alert('Email incorrecto');
        email.style.backgroundColor = `red`;
        email.value = null;
       // getSubmit['Email'].style.backgroundColor = `red`;
    }
};

function completeNameVal (name, lastName){
    if(/^[A-Za-z\s]+$/.test(name.value) & /^[A-Za-z\s]+$/.test(lastName.value)){
        return;
    }
    else{
        name.style.backgroundColor = `red`;
        name.style.color = `white`;
        lastName.style.backgroundColor = `red`;
        lastName.style.color = `white`;
    }
};

function userNameVal(userName){
    if(userName.value.length <= 3){
        alert('to short');
    }
};

submitBtn.addEventListener('click',function submit(event){
    event.preventDefault();
    const email = document.getElementById("Email");
    const name = document.getElementById("Name");
    const lastName = document.getElementById("last-name");
    const userName = document.getElementById("user-name");
    mailVal(email);
    completeNameVal(name, lastName);
    userNameVal(userName);

});
