import './App.css';
import officeImg from './images/office.jpg';

function App() {

  const office = {
    Name: "DBS Business Center",
    Rent: 55000,
    Address: "Chennai"
  };

  const officeSpaces = [
    {
      Name: "DBS Business Center",
      Rent: 55000,
      Address: "Chennai"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "Regus",
      Rent: 45000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div className="App">

      <h1>Office Space Rental App</h1>

      <img
        src={officeImg}
        alt="Office Space"
        width="400"
        height="250"
      />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.Name}</p>

      <p>
        <b>Rent:</b>{" "}
        <span
          style={{
            color: office.Rent < 60000 ? "red" : "green"
          }}
        >
          Rs. {office.Rent}
        </span>
      </p>

      <p><b>Address:</b> {office.Address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeSpaces.map((item, index) => (
          <div key={index}>

            <p><b>Name:</b> {item.Name}</p>

            <p>
              <b>Rent:</b>{" "}
              <span
                style={{
                  color: item.Rent < 60000 ? "red" : "green"
                }}
              >
                Rs. {item.Rent}
              </span>
            </p>

            <p><b>Address:</b> {item.Address}</p>

            <hr />

          </div>
        ))
      }

    </div>
  );
}

export default App;