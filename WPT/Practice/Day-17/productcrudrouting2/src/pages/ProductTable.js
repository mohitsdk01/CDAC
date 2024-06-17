import React,{useState,useEffect} from 'react'
import ProductService from '../service/ProductService';
import {Link} from 'react-router-dom';

export default function ProductTable() {
    const [prodarr,setprodarr]=useState([]);

    //initialize productarr
    useEffect(()=>{
        fetchadata();
        
    },[])
    //sending get request to our REST webservice written in nodejs
    const fetchadata=()=>{
        ProductService.getAllproducts()
        .then((result)=>{
            console.log(result);
            setprodarr(result.data);
        })
        .catch()
    }
    const deletedata=(pid)=>{
        ProductService.deleteProduct(pid)
        .then((result)=>{
            fetchadata(); 
        })
        .catch(()=>{})

    }
  return (
    <div>
    <Link to="/form">
    <button type="button" className="btn btn-primary">Add new product</button>
    </Link><br></br>
        <table className="table table-striped">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product name</th>
      <th scope="col">Quantity</th>
      <th scope="col">Price</th>
      <th scope="col">action</th>
    </tr>
  </thead>
  <tbody>
  {prodarr.map(prod=><tr>
      <th scope="row">{prod.pid}</th>
      <td>{prod.pname}</td>
      <td>{prod.qty}</td>
      <td>{prod.price}</td>
      <td>
      <button type="button" className="btn btn-success">view</button>&nbsp;&nbsp;&nbsp;
      <button type="button" className="btn btn-danger" onClick={()=>{deletedata(prod.pid)}}>Delete</button>&nbsp;&nbsp;&nbsp;
      {/* state will transfer data to Productedit component via location object */}
      <Link to={`/edit/${prod.pid}`} state={{product:prod}}>
      <button type="button" className="btn btn-warning" >Edit</button>
      </Link>
      </td>
    </tr>)}
    
    
  </tbody>
</table>
    </div>
  )
}
