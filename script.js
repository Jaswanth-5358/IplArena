const wrapper=document.querySelector(".wrapper");
const LoginLink=document.querySelector(".login-link");
const RegisterLink=document.querySelector(".registerLink");
const btnpop=document.querySelector('.btnlogin-popup');
const iconClose=document.querySelector('.icon-close');

RegisterLink.addEventListener('click', ()=>{
    wrapper.classList.add('active');

});

LoginLink.addEventListener('click', ()=>{
    wrapper.classList.remove('active');
});

btnpop.addEventListener('click', ()=>{
    wrapper.classList.add('active-btn');
});

iconClose.addEventListener('click', ()=>{
    wrapper.classList.remove('active-btn');
});