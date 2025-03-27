import React from 'react'

export default function App() {
  return (
    <div>
        <h1>Food</h1>
        { foodILike.map( (dish) => { 
             return <Food name = {dish.name} 
                          key = {dish.id}
                          picture = {dish.image}
             />
             
        }) } 
    </div>
  )
}
      
function Food({name, picture}) {
  return(
    <>
    <h3>I Like {name}</h3>
    <img src = {picture} width = "50%" alt = {name}/>
    </>
  );
}

function Potato(){
  return(
    <h3>I Like Potato </h3>
  );
}

// const foodILike = [];
const foodILike = [
  {
    id: 1,
    name: 'Kimchi',
    image: 'http://aeriskitchen.com/wp-content/uploads/2008/09/kimchi_bokkeumbap_02-.jpg'
 ,  rating: 5,
  },
  {
    id: 2,
    name: 'Samgyeopsal',
    image:
      'https://3.bp.blogspot.com/-hKwIBxIVcQw/WfsewX3fhJI/AAAAAAAAALk/yHxnxFXcfx4ZKSfHS_RQNKjw3bAC03AnACLcBGAs/s400/DSC07624.jpg' 
 , rating: 4.9,
  },
  {
    id: 3,
    name: 'Bibimbap',
    image:
      'https://health.chosun.com/site/data/img_dir/2021/01/27/2021012702508_0.jpg'
 , rating: 4,
  },
  {
    id: 4,
    name: 'Doncasu',
    image: 'https://s3-media3.fl.yelpcdn.com/bphoto/7F9eTTQ_yxaWIRytAu5feA/ls.jpg'
 , rating: 4.8,
  },
  {
    id: 5,
    name: 'Kimbap',
    image: 'http://cdn2.koreanbapsang.com/wp-content/uploads/2012/05/DSC_1238r-e1454170512295.jpg'
 , rating: 4.5,
  },
];
