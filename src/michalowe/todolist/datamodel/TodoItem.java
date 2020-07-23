package michalowe.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {

    private String shortDescrption;
    private String details;
    private LocalDate deadLine;

    public TodoItem(String shortDescrption, String details, LocalDate deadLine) {
        this.shortDescrption = shortDescrption;
        this.details = details;
        this.deadLine = deadLine;
    }

    public String getShortDescrption() {
        return shortDescrption;
    }

    public void setShortDescrption(String shortDescrption) {
        this.shortDescrption = shortDescrption;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

//    @Override
//    public String toString() {
//        return shortDescrption;
//    }
}
