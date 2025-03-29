// ./src/App.jsx
import './App.css'

function App() {
  const name = "김영중";
  const number = 10;
  return (
    <>
      <h1>Hello React</h1>
      <h2>이름은 {name} 입니다.</h2>
      <h2>{number}</h2>
      <h2>{number + 11}</h2>
      <h2>{number%2 === 0 ? '짝수' : '홀수'}</h2>
    </>
  )
}

export default App
