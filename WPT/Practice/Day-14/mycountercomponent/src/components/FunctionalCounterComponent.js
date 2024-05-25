import { useState } from "react"

const FunctionalCounterComponent=()=>{
    //var count=0;
    //to reflect the changes in count use it as a state
    //useState function returns 2 values 1. variable, 2. setter method reference
    const [count,setcount]=useState(0)

    const increament=()=>{
        // count=count+1
        setcount(count+1)
        console.log("in icreament function",count)
    }

    const decrement=()=>{   
        // count = count - 1;
        setcount(count- 1)
        console.log("in decrement function", count);
    }

    const reset=()=>{
        // count = 0;
        setcount({count:0})
        console.log("in reset count", count);
    }

    return(
        <div>
        <h1>In Functional  counter component</h1>
           <h3>You clicked {count} times</h3>
            <button type="button" name="btn" id="btn" value="inc" onClick={increament}>Increment counter</button>
              <button type="button" name="btn" id="btn" value="dec" onClick={decrement}>decrement counter</button>
              <button type="button" name="btn" id="btn" value="reset" onClick={reset}>Reset counter</button>
        </div>
    )
}

export default FunctionalCounterComponent;