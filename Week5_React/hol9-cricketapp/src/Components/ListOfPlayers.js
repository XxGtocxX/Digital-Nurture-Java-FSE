import React from "react";

export function ListOfPlayers(props) {
    return (
        <div>
            <ul>
                {props.players.map((item, index) => (
                    <li key={index}>
                        Mr. {item.name} <span>{item.score}</span>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListOfPlayers;