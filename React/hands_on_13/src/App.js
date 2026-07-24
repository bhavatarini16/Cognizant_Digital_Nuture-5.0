import BookDetails, { books } from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-around",
        marginTop: "50px",
      }}
    >
      <CourseDetails />

      <div style={{ borderLeft: "4px solid green", paddingLeft: "20px" }}>
        <BookDetails books={books} />
      </div>

      <div style={{ borderLeft: "4px solid green", paddingLeft: "20px" }}>
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;