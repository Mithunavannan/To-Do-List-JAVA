import java.util.*;

public class todo {
   
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) { 
            displayMenu();

            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addTask();
                        break;
                    case 2:
                        viewTask();
                        break;
                    case 3:
                        deleteTask();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        Exittask();
                        break;    
                    default:
                        System.out.println("Invalid choice. Enter a valid number");;
                }
            } else{
                System.out.println("Invalid Input");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    public  static void displayMenu() {
        System.out.println("\n----ToDo List------");
        System.out.println("1. Add Task");
        System.out.println("2. View Task");
        System.out.println("3. Delete Task");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");

    }

    public static void addTask() {
        System.out.println("Enter task desciption");
        String task = scanner.nextLine().trim();
        if(!tasks.isEmpty()){
            tasks.add(task);
            System.out.println("Task Added: " +task);
        } else{
            System.out.println("Can't leave empty");
        }

    }
    public static void viewTask() {
        System.out.println("Current Task List:");
        if(!tasks.isEmpty()){
            System.out.println("No tasks found:");
        } else{
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("The live tasks are: " +tasks.get(i));
            }
        }

    }

    public static void deleteTask() {
        viewTask();
        if (tasks.isEmpty()) return;

        System.out.println("Enter task line to Delete");
        if (scanner.hasNextInt()){
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber > 0 && taskNumber <= tasks.size()){
                String removedTask = tasks.remove(taskNumber - 1);
                System.out.println("Removed task:" +removedTask);
            } else{
                System.out.println("Inavlid number to remove tasks. !!!!CHECK AGAIN!!!");
                scanner.nextLine();
            }
        }
    }
    public static void Exittask() {
        System.exit(0);
    }


    }

