import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { fetchUserById } from '../services/api';

const UserDetails = () => {
    const { id } = useParams();
    const [user, setUser] = useState(null);

    useEffect(() => {
        fetchUserById(id).then(data => setUser(data));
    }, [id]);

    if (!user) return <p>Loading...</p>;

    return (
        <div className="container">
            <h1>{user.firstName} {user.lastName}</h1>
            <p>Email: {user.email}</p>
            <p>Role: {user.role}</p>
            <p>Age: {user.age}</p>
            <img src={user.image} alt="User" />
        </div>
    );
};

export default UserDetails;
