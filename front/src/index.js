import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import {KeycloackContextProvider} from "./KeycloakContext";
import {BrowserRouter} from "react-router-dom";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <KeycloackContextProvider>
        <BrowserRouter basename="/foody">
            <App/>
        </BrowserRouter>
    </KeycloackContextProvider>
);

