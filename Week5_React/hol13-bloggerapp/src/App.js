import "./App.css";

import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

import { books, blogs, courses } from "./Data";

function App() {

    const bookdet = <BookDetails books={books} />;

    const content = <BlogDetails blogs={blogs} />;

    const coursedet = <CourseDetails courses={courses} />;

    return (

        <div>

            <div className="container">

                <div className="column">

                    <h1>Course Details</h1>

                    {coursedet}

                </div>

                <div className="column">

                    <h1>Book Details</h1>

                    {bookdet}

                </div>

                <div className="column">

                    <h1>Blog Details</h1>

                    {content}

                </div>

            </div>

        </div>

    );

}

export default App;