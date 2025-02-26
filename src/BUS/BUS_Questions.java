package BUS;

import DAO.DAO_Questions;
import DTO.DTO_Questions;
import java.util.ArrayList;

public class BUS_Questions {
    public DAO.DAO_Questions questionsDAO = new DAO_Questions();

    public static BUS_Questions getInstance() {
        return new BUS_Questions();
    }

    public int insert(DTO.DTO_Questions cur) {
        return questionsDAO.insert(cur);
    }

    public int update(DTO.DTO_Questions cur) {
        return questionsDAO.update(cur);
    }

    public int delete(int cur) {
        return questionsDAO.delete(cur);
    }

    public java.util.ArrayList<DTO.DTO_Questions> getAllData() {
        return questionsDAO.getAllData();
    }

    public int getLargestID() {
        return questionsDAO.getLargestID();
    }

    public DTO.DTO_Questions selectById(String id) {
        return questionsDAO.selectById(id);
    }

    /**
     * Search for questions based on their content
     * @param keyword The search keyword
     * @return List of questions matching the search criteria
     */
    public ArrayList<DTO_Questions> searchQuestions(String keyword) {
        DAO_Questions dao = new DAO_Questions();
        return dao.searchQuestions(keyword);
    }

}
