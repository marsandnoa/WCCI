// referencing html elements for update
const autoclickerCounter = (document.querySelector('.autoclickerCount'));
const autoclickerPricer = (document.querySelector('.autoclickerPricer'));

// referencing html buttons
const cookieCounter = (document.querySelector('.cookieCount'));
const buyButton= (document.querySelector('.autoclickerBuy'));

// referencing html dialogue boxes
const company= (document.querySelector('.dCompany'));
const developer= (document.querySelector('.dDeveloper'));

// initializing all the counters
let cookieCount=0;
let autoclickerCount=0;
let autoclickerPrice=100;

// setting interval for the autoclicker function to be called(once per s)
setInterval(autoclickerIncrement, 1000);

//updating html elements
updateAutoclicker();
updateCookieCounter();

// updateCookieCounter and updateAutoclicker simply update the html elements related to the amount of cookies and the autoclickers respectively
function updateCookieCounter() {
  cookieCounter.innerText=cookieCount;
  buyButton.disabled=!(cookieCount>=autoclickerPrice);
  if(!(cookieCount>=autoclickerPrice)){
    buyButton.innerHTML="Cookies Needed:"+String(autoclickerPrice-cookieCount);
  }else{
    buyButton.innerHTML="Cookies Needed:"+"0";
  }
}

function updateAutoclicker() {
  autoclickerCounter.innerText=autoclickerCount;
  autoclickerPricer.innerText=autoclickerPrice;
}

// addCookieCounter and addAutoclicker are both to control the amount of cookies and amount of autoclickers
// addCookieCounter has a param passed, because the cookie count isn't strictly increasing and isnt strictly incrementing by 1 while the autoclickers are
function addCookieCounter(p1) {
  cookieCount=cookieCount+p1;

  updateCookieCounter();
}

function addAutoclicker() {
  autoclickerCount++;
  cookieCount=cookieCount-autoclickerPrice;
  autoclickerPrice=autoclickerPrice+parseInt(.1*autoclickerPrice);

  updateAutoclicker();
  updateCookieCounter();
}

//fixed to call every 1s, adds the autoclicker amount
function autoclickerIncrement() {
  cookieCount=cookieCount+autoclickerCount;
  
  updateCookieCounter();
}

function reset() {
  cookieCount=0;
  autoclickerCount=0;
  autoclickerPrice=100;

  updateAutoclicker();
  updateCookieCounter();
}

// hides dialogue boxes
function hide(){
  company.open=false;
  developer.open=false;
}

// handles the header selectbox
function changeFunc() {
  var selectBox = document.getElementById("informationSelect");
  var selectedValue = selectBox.options[selectBox.selectedIndex].value;

  hide()

  if(selectedValue=='COMPANY'){
    company.open=true;
  } else {
    developer.open=true;
  }
}


