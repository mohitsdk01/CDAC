import React,{Component} from 'react';

class ClassCountercomponent extends React.Component{
    constructor(props){
        super(props)
        this.state={
            count:0
        }
        console.log("in Counter component constructor")
        //it will pass classcomponent object explicitly 
        //and overwrite the old definitaion with new definition
       // this.increamentcnt=this.increamentcnt.bind(this);
    }
    /*increamentcnt(){
        //in this function this object will point to button
    }*/
    //increase counter by 1
    increamentcnt=()=>{
        //always use this.setState function to change the state
        //it is a asynchronous function, always the changes to the state
        //are visible in callback function
      this.setState({count:this.state.count+1},function(){
         console.log(this.state.count)
      })
      
    }
//decrement the counter by 1
decrementcnt=()=>{
    this.setState({count:this.state.count>0?this.state.count-1:0},function(){
        console.log(this.state.count)
     })
}
//to reset the count to 0
resetcnt=()=>{
    this.setState({count:0})
}

    render(){
        console.log("in class component render function")
        return (
            <div>
            <h1>In class counter component</h1>
            {
                this.state.count>=0?<h4>You clicked {this.state.count} times</h4>:""
            }
               
              <button type="button" name="btn" id="btn" value="inc" onClick={this.increamentcnt}>Increment counter</button>
              <button type="button" name="btn" id="btn" value="dec" onClick={this.decrementcnt}>decrement counter</button>
              <button type="button" name="btn" id="btn" value="reset" onClick={this.resetcnt}>Reset counter</button>
            </div>
        )
    }
        
    

}

export default ClassCountercomponent;