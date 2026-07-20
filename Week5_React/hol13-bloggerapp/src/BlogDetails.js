function BlogDetails(props) {

    return (

        <div>

            {props.blogs.map((blog) => (

                <div key={blog.id}>

                    <h2>{blog.title}</h2>

                    <b>{blog.author}</b>

                    <p>{blog.content}</p>

                </div>

            ))}

        </div>

    );

}

export default BlogDetails;