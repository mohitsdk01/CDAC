import React from 'react'

export default function ProductDetails(props) {
  console.log(props)
  return (
    <div className="container">
       <div className="row">
          <div className="col-sm-12 col-md-3">
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-gift" viewBox="0 0 16 16">
  <path d="M3 2.5a2.5 2.5 0 0 1 5 0 2.5 2.5 0 0 1 5 0v.006c0 .07 0 .27-.038.494H15a1 1 0 0 1 1 1v2a1 1 0 0 1-1 1v7.5a1.5 1.5 0 0 1-1.5 1.5h-11A1.5 1.5 0 0 1 1 14.5V7a1 1 0 0 1-1-1V4a1 1 0 0 1 1-1h2.038A3 3 0 0 1 3 2.506zm1.068.5H7v-.5a1.5 1.5 0 1 0-3 0c0 .085.002.274.045.43zM9 3h2.932l.023-.07c.043-.156.045-.345.045-.43a1.5 1.5 0 0 0-3 0zM1 4v2h6V4zm8 0v2h6V4zm5 3H9v8h4.5a.5.5 0 0 0 .5-.5zm-7 8V7H2v7.5a.5.5 0 0 0 .5.5z"/>
</svg>
          </div>
          <div className="col-sm-12 col-md-5">
            <span>{props.prod.pid}&nbsp;&nbsp;{props.prod.pname} </span>
          </div>
          <div className="col-sm-12 col-md-4">
          <span>{props.prod.qty}&nbsp;&nbsp;{props.prod.price} </span>
          </div>
       </div>
      
    </div>
  )
}