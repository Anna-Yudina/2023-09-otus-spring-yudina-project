import axios from 'axios';

export class InstructorRestService {
    getAllInstructors() {
        return axios.get("/api/instructors");
    }

    getInstructorById(id) {
        return axios.get("/api/instructors/" + id);
    }

    createInstructors(instructor) {
        return axios.post("/api/instructors", instructor);
    }

    deleteInstructor(id) {
        return axios.delete("/api/instructors/" + id);
    }

    editInstructor(instructor) {
        return axios.put("/api/instructors/" + instructor.id, instructor);
    }

}