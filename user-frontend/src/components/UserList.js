import React, { useEffect, useState } from 'react';
import { fetchUsers } from '../services/api';
import { Link } from 'react-router-dom';

const UserList = () => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        fetchUsers().then(data => setUsers(data));
    }, []);

    return (
        <div className="container">
            <h1>User List</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id}>
                        <Link to={`/users/${user.id}`}>{user.firstName} {user.lastName}</Link>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default UserList;
