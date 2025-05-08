import React,{useState} from 'react'
import './App.css'
import Info from './components/info';
import Posts from './pages/Posts';

function App() {
  const [visible, setVisible] = useState(false);
  return (
    <>
      <h1>회원정보</h1>
      <button onClick={()=>{
        setVisible(!visible);
      }} >{visible ? '숨기기': '보이기'}</button>
      {visible && <Info />}
    </> 
  )
}

export default App
