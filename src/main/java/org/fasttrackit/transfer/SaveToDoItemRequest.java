package org.fasttrackit.transfer;

import java.time.LocalDateTime;

public class SaveToDoItemRequest {
    private String description;
    private LocalDateTime deadline;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SaveToDoItemRequest{" +
                "description='" + description + '\'' +
                ", deadline=" + deadline +
                '}';
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
