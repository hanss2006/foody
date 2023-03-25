import './App.css';
import {KeycloackContext} from "./KeycloakContext";
import React, {useContext} from "react";
import {Route, Routes} from "react-router-dom";
import Registry from "./components/registry";

function App() {
    const {keycloackValue, authenticated} = useContext(KeycloackContext);
    return (
        (keycloackValue && authenticated) ?
            <React.Fragment>
                <Routes>
                    {
                        <React.Fragment>
                            <Route exact path="/" element={<Registry/>}/>
                        </React.Fragment>
                    }
                    <Route path="*" element={<Error/>}/>
                </Routes>
            </React.Fragment>
            : <></>
    );
}

export default App;
