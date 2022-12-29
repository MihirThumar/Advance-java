let main = document.querySelector('.main');
let plus_btn = document.querySelector('.plus_btn');

plus_btn.addEventListener('click',(e)=>{
    main.style = 'display:flex';
});

const func = (e)=>{
    if(e.target.className=='main'){
        main.style = 'display:none';
    }
}