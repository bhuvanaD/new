 
// charAt(0)

var str = "HELLO WORLD";
    var res = str.charAt(0)

// here u can give any number the index the character for exmple if u want L means five charAt(3)
it will return H

// substr
2. var str = "Hello world!";
    var res = str.substr(1, 4);
it will print  ello

3)
 var str = "How are you doing today?";
    var res = str.split(" ");

0/p      How,are,you,doing,today?



4)  var str = "Hello world!"; 
    var res = str.slice(1, 5);

ello  star, before end point


5) var str = visit Microsoft; 
    var res = str.replace("Microsoft", "W3Schools");

o/p  Visit W3Schools!

//case sensitive
 var res = str.replace(/blue/g, "red");  globally replace wherever the work blue

// case insensitive
 var res = str.replace(/Blue/gi, "red");


// with function
  var str = document.getElementById("demo").innerHTML; 
    var res = str.replace(/blue|house|car/gi, function myFunction(x){return x.toUpperCase();});


// repeat functgion
var str = "Hello world!";
str.repeat(2); 

oupute  Hello world!Hello world! 


//trim it wil remove all space and print only the strin
//  The trim() method does not change the original string.
var str = "       Hello World!        ";
alert(str.trim()); 

output  :Hello World!

// browser does not support trim so we have to use the funtion to remove the white space
function myTrim(x) {
    return x.replace(/^\s+|\s+$/gm,'');
}

function myFunction() {

// here we using the myTrim method and passing str through that methd

    var str = myTrim("        Hello World!        ");
    alert(str);
}


var str = "Hello World!";
var res = str.valueOf();

o/p  Hello World!


// charCodeAt(0)

   var str = "HELLO WORLD";
    var n = str.charCodeAt(0);

//it wil return the unicode of the indexed characted for example unicod eof H is 72


//comparision
var str1 = "ab";
var str2 = "cd";
var n = str1.localeCompare(str2);


    Returns -1 if str1 is sorted before str2
    Returns 0 if the two strings are equal
    Returns 1 if str1 is sorted after str2

//lastIndexof
 var str = "Hello planet earth, you are a great planet.";
    var n = str.lastIndexOf("planet");
it wil take the last index value even the letter is getting repeated 


// indexOf
  var str = "Hello world, welcome to the universe.";
    var n = str.indexOf("welcome");

//it wil return index value for w it will return  13


//This method returns -1 if the value to search for never occurs.

//Note: The indexOf() method is case sensitive.



 var str = "Hello world, welcome to the universe.";
    var n = str.indexOf("e", 5);
it is start to search after 5 th position
it will print 14 


var str = "Hello world!";
var res = str.slice(3);    Hello world!
var res = str.slice(0);     lo world! 
var res = str.slice(3, 8);    lo wo
var res = str.slice(0, 1);    H    //Extract only the first character:

var res = str.slice(-1);        !   //Extract only the last character:



//concat
var str1 = "Hello ";
var str2 = "world!";
var res = str1.concat(str2); 

Hello world! 
