import logo from './logo.svg';
import './App.css';
import SayHello from './dataacess';
import Addition from './add';
import Data from './input'
import Palindrome from './palindrom'

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
            Hello
      <h1><SayHello name={"rahul"}> hii</SayHello></h1>
      <SayHello> hii</SayHello>
    <h2><Addition num1={2} num2={5}></Addition></h2>
    <Data> </Data>
    <Palindrome n={1234} ></Palindrome>

    </div>
  );
}

export default App;
