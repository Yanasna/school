import React from "react";


function Privacy(props){
  return (
    <>
          <h2>개인정보</h2>
      <p>이름 : {props.name}</p>
      <p>연락처 : {props.phone}</p>
      <p>메일 : {props.mail}</p>
    </>

  );
}



function App(){
  return (
    <div>
      <h1>이력서</h1>
      <Privacy 
        name = "김영중"
        phone = "010-2929-4432"
        mail = "m604030@naver.com"
      />
    </div>
  )
}

export default App;
