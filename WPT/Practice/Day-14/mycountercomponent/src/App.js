import logo from './logo.svg';
import './App.css';
import ClassCountercomponent from './components/ClassCountercomponent';
import FunctionalCounterComponent from './components/FunctionalCounterComponent';
function App() {
  return (
    <div>
       <h1>Hello</h1>
       <ClassCountercomponent></ClassCountercomponent>
       <hr></hr>
       <FunctionalCounterComponent></FunctionalCounterComponent>
    </div>
  );
}

export default App;
