import axios from 'axios';
const baseUrl="http://localhost:3001"
class ProductService{
   constructor(){
     this.prodarr=[
        {pid:12,pname:"chair",qty:34,price:3450},
        {pid:13,pname:"table",qty:50,price:5000},
        {pid:14,pname:"shelf",qty:60,price:2000},
        {pid:15,pname:"sofa",qty:10,price:50000}]
   }
   getAllproducts(){
     //return this.prodarr;
     return axios.get(baseUrl+"/products") 
   }
   getById(pid){
    return axios.get(baseUrl+"/products/product/"+pid)
   }
   addproduct(p){
    //this.prodarr.push(p)
    const header={"contents-type":"appliocation/json"}
    //axios.post(baseUrl+"/products/"+p.pid,p,{headers:header})
      return axios.post(baseUrl+"/products/"+p.pid,p)
   }
   updateproduct(p){
    //var pos=this.prodarr.findIndex(ob=>ob.pid===p.pid)
    //this.prodarr.splice(pos,1,{...p}) 
    return axios.put(baseUrl+"/products/"+p.pid,p)
   }

   deleteProduct(pid){
    return axios.delete(baseUrl+"/products/"+pid)
   }
}

export default new ProductService();