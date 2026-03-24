import {useState} from "react"
import Index from './web/index'

export default function Login()
{
    let[uname,setUser]=useState('Default')
    let[showComp,setVisible]=useState(false);

    function textReceiver(e)
    {
        console.log(e.target.value)
        setUser(e.target.value)

    }
    function validate(e)
    {
        if(uname=='iet')
        {
            setVisible(true);

        }
        else{
            alert("Invalid user")
        }
        e.preventDefault();
    }

    return <>
    {showComp ? (<Index user={uname}></Index>):(
        <form onSubmit={validate} action="">
            enter username <input type="text" name="uname" onChange={textReceiver} value={uname}/>
            <input type="password"
            <input type="submit" value={'login'}/>

        </form>

    )
}
    </>
}








