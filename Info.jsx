import React, {useState} from "react";

export default function Info(){
    const [name, setName] = useState('');
    const [nick, setNick] = useState('');
    
    const onChangeName = (e) => {
        setName(e.target.value);
    }; 
    const onChangeNick = (e) => {
        setNick(e.target.value);
    }; 

    return(
        <div>
            <div>
                <input value = {name}
                    onChange={onChangeName}
                />
                <input value = {nick}
                    onChange={onChangeNick}/>

            </div>
            <div>
                <div>
                    <b>이름 : </b> {name}
                </div>
                <div>   
                    <b>닉네임 : </b> {nick}
                </div>
            </div>
        </div>
    );
}
