import React from 'react'

export default function App() {
  return (
    <div>
        <h1>Hello React!!!</h1>
      <Food fav = "kimchi" />
      <Food fav = "ramen" />
      <Food fav = "samgiopsal" />
      <Food fav = "chukumi" />
    </div>
  )
}

//function Potato(){
  //return(
  //  <h3>I Like Potato </h3>
  //);

//}
function Food(props) {
  return(
    <h3>I Like {props.fav}</h3>

  );
}
