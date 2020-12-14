//Connection to mysql 
var mysql = require('mysql');
var connection = mysql.createConnection({
    host: "localhost",
    user: 'root',
    password: 'Peng0806',
    port:'3306',
    database: 'mysql'
})
connection.connect();


connection.query('Select 1 + 1 as solution', function(error, results, fields){
    if(error){
        throw error;
    };
    console.log('The solution is:' + results[0].solution);
    console.log(results)
})