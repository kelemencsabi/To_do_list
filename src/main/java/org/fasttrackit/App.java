package org.fasttrackit;

import org.fasttrackit.persistence.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {
        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
        toDoItemRepository.createToDoItem("Learn java", LocalDateTime.now().plusMonths(6));
        toDoItemRepository.deleteToDoItem(2);
        toDoItemRepository.updateToDoItem(4,true);
        System.out.println(toDoItemRepository.getToDoItems());
    }
}
