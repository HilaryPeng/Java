let testFunction = async () => {
    let b = 3+ 5;
    return b
}

console.log(testFunction().then(data=>{console.log(data)}))
const html =`<div>Async</div>
             <p>Async 会默认返回一个promise,如果有return且指定值，那么该Promise有一个Value为8;如果没有默认为undefined</p>`
export default html;