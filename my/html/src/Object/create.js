const obj = {
  name: 'apeng',
  add: function(a,b){
      return a+b
  } 
}
const createObj = Object.create(obj);
createObj.name = 'wangxixi';
createObj.add = function (a,b){
    return a*b;
}
console.log(createObj);
const html = `<div>Object.create()</div>`
export default html