//Only add data to the websites table;Only in the Step1 set value;
// id ,name, url ,alexa, country
var initDataId = 2;
var initDataName = "baidu";
var initDataUrl = "http:gjlkjgl";
var initDataAlext = 100;
var initCountry = "China";
var mysql = require('mysql');
var connection = mysql.createConnection({
    host: "localhost",
    user: 'root',
    password: 'Peng0806',
    port:'3306',
    database: 'mysql'
})

var addsql = "Insert into websites(id, name, url, alexa, country) VALUES(?,?,?,?,?)"
var addData = [initDataId, initDataName, initDataUrl, initDataAlext, initCountry];
connection.query(addsql, addData, function(error,results, fields){
    if(error){
        throw error;
    }
    console.log(results);
})

connection.end();

