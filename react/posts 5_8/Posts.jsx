// ./src/pages/Posts.jsx

import React,{useState} from 'react';
import axios from 'axios';

function Posts() {
    const [title, setTitle] = useState('');
    const [body, setBody] = useState('');
    const onSubmit = () => {
        axios.post('http://localhost:3001/posts', {
            title : title,
            body : body

        });
        setTitle('');
        setBody('');
    };
    return (
        <div className = "container">
            <div className =  "row mb-3">
                <label className ="form-label">Title</label>
                <input className="form-control"
                        value = {title}
                        onChange = {(e=>{setTitle(e.target.value)})}
                />
                <br />
                <label className="form-control">Body</label>
                <textarea className="form-control"
                        value = {body} 
                        onChange = {(e=>{setBody(e.target.value)})}
                        rows="20"
                />
                <br />
                <button className="btn btn-primary" 
                onClick = {onSubmit}>Post</button>
            </div>
        </div>
    );
}

export default Posts;  