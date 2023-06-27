import React from 'react'
const Books= [
    {
        id:1,
      title: 'Life of Pi',
      author: 'Yann martel',
    genre:'action'
    },
    {
        id:2,
      title: 'The call of the wild',
      author: 'Jack London',
      genre:'adventure'
      },
      {
        id:3,
        title: 'To kill a mocking bird',
        author: 'Harper Lee',
        genre:'Classic'
        },
        {
            id:4,
          title: 'Watchmen',
          author: 'Jack Moore',
          genre:'Comic'
          },
          {
            id:5,
            title: 'The night fire',
            author: 'Michael Connelly',
            genre:'Detective'
            }
  ]

/*function BookList() {
  return (
    <div>BookList</div>
  )
}

export default BookList */

function BookList() {

    /* Mapping the courses into a new array of JSX nodes as arrayDataItems */
  
    const arrayDataItems = Books.map(Books => 
      <ul key={Books.id}>
       <li> <p>Title :   {Books.title}</p></li>
        <li><p>Author :  {Books.author}</p></li>
        <li><p>Genre :   {Books.genre}</p></li>
      </ul>
    )
  
    return (
      <div className="container">
        <div>
          <h1>Books</h1>
        </div>
  
        {/* returning arrayDataItems wrapped in <ul> */}
        <ul>{arrayDataItems}</ul>
      </div>
    );
  }
  
  export default BookList;