import React, { Component } from "react";

class EventExamples extends Component {

    constructor(props) {
        super(props);

        this.state = {
            count: 0
        };
    }

    increment = () => {
        this.setState({
            count: this.state.count + 1
        });
    }

    decrement = () => {
        this.setState({
            count: this.state.count - 1
        });
    }

    sayHello = () => {
        alert("Hello! Member1");
    }

    sayWelcome = (message) => {
        alert(message);
    }

    handleClick = () => {
        alert("I was clicked");
    }

    handleIncrement = () => {
        this.increment();
        this.sayHello();
    }

    render() {
        return (
            <div>

                <h3>{this.state.count}</h3>

                <button onClick={this.handleIncrement}>
                    Increment
                </button>

                <br /><br />

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br /><br />

                <button
                    onClick={() => this.sayWelcome("Welcome")}
                >
                    Say welcome
                </button>

                <br /><br />

                <button onClick={this.handleClick}>
                    Click on me
                </button>

            </div>
        );
    }
}

export default EventExamples;