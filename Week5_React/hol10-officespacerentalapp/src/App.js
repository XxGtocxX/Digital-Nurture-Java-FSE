import './App.css';
import office from './office.jpg';

function App() {

  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: office
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad",
      Image: office
    }
  ];

  return (
    <div className="container">

      <h1>{heading}, at Affordable Range</h1>

      {
        officeList.map((item, index) => {

          let colors = [];

          if (item.Rent <= 60000) {
            colors.push("textRed");
          }
          else {
            colors.push("textGreen");
          }

          return (
            <div key={index}>

              <img
                src={item.Image}
                width="25%"
                height="25%"
                alt="Office Space"
              />

              <h1>Name: {item.Name}</h1>

              <h3 className={colors[0]}>
                Rent: Rs. {item.Rent}
              </h3>

              <h3>
                Address: {item.Address}
              </h3>

              <br />

            </div>
          );
        })
      }

    </div>
  );
}

export default App;