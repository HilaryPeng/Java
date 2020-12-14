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
// Query all country = cn
var sql = "Select * from websites"

connection.query(sql, function(error, results, fields){
    if(error){
        throw error;
    };
    console.log(results)
})

