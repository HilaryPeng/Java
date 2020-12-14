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
var sql = "Select * from websites where country='CN'"

connection.query(sql, function(error, results, fields){
    if(error){
        throw error;
    };
    console.log(results)
})


// Add one piece of data to sql
// var addsql = 'Insert into websites(id, name, url, alexa, country) VALUES(6, "百度", "https//www.baidu.com", "8888", "CN")'
// connection.query(addsql, function(error,results, fields){
//     if(error){
//         throw error;
//     }
//     console.log(results);
// })

// Modify the new add data name and url to 'cn.bing.com';
var updateSql = 'Update websites set name = ?, url = ? where id = ?';
var modifySqlParams = ["微软","https://cn.bing.com",6];
connection.query(updateSql, modifySqlParams, function(error,results, fields){
    if(error){
        throw error;
    }
    console.log(results);
})



// Delete 
var delSql = 'Delete from wbsites where id = 7';
connection.query(delSql, function(error, resultes, fields) {
    if(error){
        throw error;
    }
    console.log(resultes);
})
connection.end();
