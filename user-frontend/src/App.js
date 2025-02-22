import React from 'react';
import { Link } from 'react-router-dom';

const App = () => {
    return (
        <div className="container">
            <h1>Welcome to the User Management App</h1>
            <Link to="/users">View Users</Link>
        </div>
    );
};

export default App;
