
import Card from "./Card";

function ListCards(){

     const cards = Array.from({ length: 3}, (_, index) => <Card key={index} />);





    return(<><div className="list-cards">{cards}</div></>)








}


export default ListCards