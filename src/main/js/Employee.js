const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');


class Employee extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.employee.id}</td>
                <td>{this.props.employee.firstName}</td>
                <td>{this.props.employee.lastName}</td>
                <td>{this.props.employee.description}</td>
            </tr>
        )
    }
}

export default Employee;