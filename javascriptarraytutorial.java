// filter filter the values

var ages = [32, 33, 16, 40];

function checkAdult(age) {
    return age >= 18;
}

function myFunction() {
    document.getElementById("demo").innerHTML = ages.filter(checkAdult);
}

it will print  32,33,40 (only >18)
--------------------------------------------------------------

//find it will find the exact value

function checkAdult(age) {
    return age >= 18;
}

function myFunction() {
    document.getElementById("demo").innerHTML = ages.find(checkAdult);
}

The find() method returns the value of the first element in an array that pass a test (provided as a function).

--------------------------------------------------------------
// findIndex
ages.findIndex(checkAdult);



    If it finds an array element where the function returns a true value, findIndex() returns the index of that array element (and does not check the remaining values)
    Otherwise it returns -1

Note: findIndex() does not execute the function for array elements without values.

--------------------------------------------------------------
//forEach

<button onclick="numbers.forEach(myFunction)">Try it</button>

var numbers = [4, 9, 16, 25];

function myFunction(item, index) {
    demoP.innerHTML = demoP.innerHTML + "index[" + index + "]: " + item + "<br>"; 

}
o/p

index[0]: 4
index[1]: 9
index[2]: 16
index[3]: 25


// another example

var numbers = [65, 44, 12, 4];

function myFunction(item,index,arr) {
    arr[index] = item * document.getElementById("multiplyWith").value;
    demo.innerHTML = numbers;
}
// multply the array with 10

650,440,120,40



--------------------------------------------------------------

// isArray method return true
var fruits = ["Banana", "Orange", "Apple", "Mango"];
    var x = document.getElementById("demo");
    x.innerHTML = Array.isArray(fruits);
--------------------------------------------------------------

// concat of array


var hege = ["Cecilie", "Lone"];
var stale = ["Emil", "Tobias", "Linus"];
var children = hege.concat(stale); 


Cecilie,Lone,Emil,Tobias,Linus

--------------------------------------------------------------

//pop

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.pop(); 

o/p
Banana,Orange,Apple

Remove the last element of an array:



--------------------------------------------------------------

//push

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Kiwi");
o/p
Banana,Orange,Apple,Mango,Kiwi

--------------------------------------------------------------

//slice

Select elements from an array:


var fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
var citrus = fruits.slice(1, 3); 


Orange,Lemon


--------------------------------------------------------------


Sort an array:

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.sort();

The result of fruits will be:
Apple,Banana,Mango,Orange

--------------------------------------------------------------
//splice


Add items to the array:
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 0, "Lemon", "Kiwi");

The result of fruits will be:

Banana,Orange,Lemon,Kiwi,Apple,Mango

--------------------------------------------------------------
//ushift



Add new items to the beginning of an array:

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.unshift("Lemon","Pineapple");

The result of fruits will be:

Lemon,Pineapple,Banana,Orange,Apple,Mango
