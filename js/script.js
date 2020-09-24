const navSlided = ()=>{
    const burger = document.querySelector('.burger');
    const nav = document.querySelector('.nav-list');
    const navList = document.querySelectorAll('.nav-list li');

    burger.addEventListener('click', ()=>{
        nav.classList.toggle('nav-active');
    });

    navList.forEach((link, index)=>{
        link.style.animation = `navLinstFade 0.5s ease fordwards ${index/7+2}s`;
        console.log(index);
    });
}
    navSlided();