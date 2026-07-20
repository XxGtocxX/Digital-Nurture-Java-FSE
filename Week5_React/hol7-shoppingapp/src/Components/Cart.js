import React from "react";

export class Cart extends React.Component {

    render() {

        return (
            <table border="1" align="center" cellPadding="5">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>

                <tbody>
                    {this.props.item.map((data, index) => (
                        <tr key={index}>
                            <td>{data.itemname}</td>
                            <td>{data.price}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        );
    }
}

export default Cart;