// 105 ditto7890
o=require('os'),c=a=>(a/2**20).toFixed(2),t=c(o.totalmem()),console.log(`${t-c(o.freemem())}MB / ${t}MB`)