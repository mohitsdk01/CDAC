import React,{useState,useEffect} from 'react'
import {useNavigate,useLocation,useParams} from 'react-router-dom'
import ProductService from '../service/ProductService';
export default function ProductEdit() {
    const navigate=useNavigate();
    //to retrive data that is send via url from ProductTable
    const location=useLocation();
    const params=useParams();
    console.log("location",location);
    console.log("params : ",params)
    const [formdetails,setformdetails]=useState({pid:"",pname:"",qty:"",price:""})
    useEffect(()=>{
        //this will show the product data in the form for modification
       setformdetails({...location.state.product}) 
    },[])
    const updateproduct=(event)=>{
        event.preventDefault(); //stops the default refresh action of submit button
        if(formdetails.pid==="" || formdetails.pname==="" || formdetails.qty===""|| formdetails.price===""){
            alert("Pls fill all the fields")
            return;
        }
        //create a product object
        var p={pid:parseInt(formdetails.pid),pname:formdetails.pname,qty:parseInt(formdetails.qty),price:parseInt(formdetails.price)}
        //update product in array
        ProductService.updateproduct(p)
        .then((result)=>{
            console.log(result)
            //to clear the form
            setformdetails({pid:"",pname:"",qty:"",price:""})
           //to navigate to table url through program
            navigate("/table");
        })
        .catch(()=>{})
        

    }
    useEffect(()=>{
        console.log(formdetails)
    },[formdetails])
    //function which will work on any text box for onChange event
    const handlechange=(event)=>{
        //name is value of the textbox on which change event occur
        //values is the value typed in the text box

       var name=event.target.name;
       var value=event.target.value;
        
        //var {name,value}=event.target;
        console.log("in handlechange",name,value) 
        setformdetails({...formdetails,[name]:value})

    }
   
  return (
    <div>
        <form>
  <div className="form-group">
    <label htmlFor="pid">Product pid</label>
    <input type="text" className="form-control" id="pid" name="pid"
        value={formdetails.pid}
        onChange={handlechange}
        readOnly
    />
  </div>
  <div className="form-group">
    <label htmlFor="pname">Product name</label>
    <input type="text" className="form-control" id="pname" name="pname"
    value={formdetails.pname}
    onChange={handlechange}
    />
  </div>
  <div className="form-group">
    <label htmlFor="qty">Product Quqntity</label>
    <input type="text" className="form-control" id="qty" name="qty"
        value={formdetails.qty}
        onChange={handlechange}
    />
  </div>
  <div className="form-group">
    <label htmlFor="price">Product Price</label>
    <input type="text" className="form-control" id="price" name="price"
    value={formdetails.price}
    onChange={handlechange}
    />
  </div>
  
  <button type="submit" className="btn btn-primary" onClick={updateproduct}>update product</button>
</form>
    </div>
  )
}
