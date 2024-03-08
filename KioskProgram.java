import java.util.*;
public class KioskProgram {
    ArrayList<String> foodLists = new ArrayList<>();
    ArrayList<String> drinkLists = new ArrayList<>();
    String newFood; 
    String newDrink;
    String foodToDelete;
    String drinkToDelete;
    String orderedFood;
    String orderedDrink; 
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        KioskProgram kiosk = new KioskProgram();

        int choice;
        
        do {    
            kiosk.menu();
            System.out.print("Enter your choice: ");
            choice = kiosk.input.nextInt();
            kiosk.input.nextLine();

            switch (choice) {
                case 1:
                    kiosk.viewAll();
                    break;
                case 2:
                    kiosk.addNewFoods(kiosk.input,3);
                    break;
                case 3:
                    kiosk.addNewDrinks(kiosk.input, 3);
                    break;
                case 4:
                    kiosk.deleteFood(kiosk.input);
                    break;
                case 5:
                    kiosk.deleteDrink(kiosk.input);
                    break;
                case 6:
                    kiosk.orderFoods();
                    break;
                case 7:
                    kiosk.orderDrinks();
                    break;
                case 8:
                    System.out.println("END OF PROGRAM!");
                    break;
                default:
                    System.out.println("Invalid Input");
            } 
        } while (choice != 8);

        kiosk.input.close();
    }

    // 1. menu
    void menu() {
        System.out.println("\nMENU");
        System.out.println("1. View all");
        System.out.println("2. Add new foods");
        System.out.println("3. Add new drinks");
        System.out.println("4. Delete food");
        System.out.println("5. Delete drink");
        System.out.println("6. Order food");
        System.out.println("7. Order drink");
        System.out.println("8. END PROGRAM");
    }

    // 2. view all
    void viewAll() {
        System.out.println("Food List: ");
        for (String food: foodLists) {
            System.out.println(food);
        }
        
        System.out.println("Drink List: ");
        for (String drink: drinkLists) {
        System.out.println(drink);
        }
    }

    //  3. add foods
    void addNewFoods(Scanner input, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("food #" + (i + 1) + ": ");
            newFood = input.nextLine();
            foodLists.add(newFood);
        }
    }

    // 3. add drinks
    void addNewDrinks(Scanner input, int times) {
            for (int i = 0; i < times; i++) {
            System.out.print("drink #" + (i + 1) + ": ");
            newDrink = input.nextLine();
            drinkLists.add(newDrink);
        }
    }

    // 4. delete food
    void deleteFood(Scanner input) {
        System.out.print("Food you want to delete: ");
        foodToDelete = input.nextLine();
        if (foodLists.remove(foodToDelete)) {
                System.out.println(foodToDelete + " deleted from the food list.");
        } else {
            System.out.println("Food not found in the list.");
        }
    }

    // 5. delete drink
    void deleteDrink(Scanner input) {
        System.out.print("Drink you want to delete: ");
        drinkToDelete = input.nextLine();
        if (drinkLists.remove(drinkToDelete)) {
                System.out.println(drinkToDelete + " deleted from the drink list.");
        } else {
            System.out.println("Drink not found in the list.");
        }
    }
    
    // 6. Order food
    void orderFoods() {
        System.out.print("Enter the food you want to order: ");
        orderedFood = input.nextLine();

        if (foodLists.contains(orderedFood)) {
            System.out.println(orderedFood + " ordered");
        } else {
            System.out.println("Food not found in the list.");
        }
    }
    
    // 7. Order drink
    void orderDrinks() {
        System.out.print("Enter the drink you want to order: ");
        orderedDrink = input.nextLine();

        if (drinkLists.contains(orderedDrink)) {
            System.out.println(orderedDrink + " ordered");
        } else {
            System.out.println("Drink not found in the list.");
        }
    }   
}