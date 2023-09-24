/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin - Main
25 September 2023
*/

package dongwangxu.seven;
import java.util.Arrays;
import java.util.Scanner;

import dongwangxu.seven.MeatTypeEnum.MeatType;
import dongwangxu.seven.Sausage;
import dongwangxu.seven.PackBox;

public class Main{
  
  // Lindsay
  static Scanner scan = new Scanner(System.in);
  private static PackBox fullPackBox = new PackBox();
  static int arrayCapacity = 12;


  public static void main(String[] args) {

    // Create sausages to put in sausageArray - Lindsay
    Sausage[] sausageArray = new Sausage[arrayCapacity];
    for (int saIndexDefault = 0; saIndexDefault < arrayCapacity; saIndexDefault += 3){
      sausageArray[saIndexDefault] = new Sausage();
      sausageArray[saIndexDefault + 1] = new Sausage("Cheery Chump Chick", MeatType.chicken, 1.00, 3.99, 5.0, 80, true);
      sausageArray[saIndexDefault + 2] = new Sausage("Perfect Piggy Pizzazz", MeatType.pork, 1.50, 4.49, 4.5, 75, true);
    }
    
    // Create a PackBox - Lindsay
    fullPackBox = new PackBox("plastic", 25.5, 3.5, 40.0, 12, false, sausageArray);
    System.out.println(fullPackBox.toString());
    System.out.println("Sausage Contents: " + Arrays.toString(sausageArray));

    // Display Menu - Lindsay
    showMainMenu();
    scan.close();
  }

  // Main Menu System - Lindsay
  public static void showMainMenu() {
    System.out.println("--- MAIN MENU ---");
    System.out.println("1. Add Sausage");
    System.out.println("2. Read All Sausages");
    System.out.println("3. Read One Sausage");
    System.out.println("4. Update Sausage");
    System.out.println("5. Delete Sausage");
    System.out.println("0. Exit");

    // Get user input - Lindsay
    System.out.print("Enter your Choice: ");
    int option = scan.nextInt();
    
    // Do a specific operation based on the user's input - Lindsay
    switch (option) {
      // If 1, create a sausage - Lindsay
      case 1:
        System.out.println("Selected Add");
        Sausage createdSausage = InputSausageFields();
        MainAddSausage(createdSausage);
        fullPackBox.ReadAllSausages();
        showMainMenu();
        break;
      // If 2, read all sausages - Lindsay
      case 2:
        System.out.println("Selected Read All");
        fullPackBox.ReadAllSausages();
        showMainMenu();
        break;
      // If 3, read a specific sausage - Lindsay
      case 3:
        System.out.println("Selected Read One");
        MainReadOneSausage();
        showMainMenu();
        break;
      // If 4, update a sausage - Lindsay
      case 4:
        System.out.println("Selected Update");
        Sausage updatedSausage = InputSausageFields();
        MainUpdateSausage(updatedSausage);
        fullPackBox.ReadAllSausages();
        showMainMenu();
        break;
      // If 5, delete a sausage - Lindsay
      case 5:
        System.out.println("Selected Delete");
        MainDeleteSausage();
        showMainMenu();
        break;
      // If 0, terminate program - Lindsay
      case 0:
        System.out.println("Terminating...");
        System.exit(0);
        break;
      // Else - Lindsay
      default:
        System.out.println("Invalid option!");
        showMainMenu();
    }
  }

  // Allows user to input sausage fields (used for create and update) - Lindsay
  public static Sausage InputSausageFields() {
    String sProductName;
    MeatType SMeatType = MeatType.beef;
    double sProductionCost;
    double sSellingPrice;
    double sSausageLength;
    int sFatPercentage;
    boolean sIsCooked = true;
    Sausage newSausage = new Sausage();
    
    // User inputs values for the sausage - Lindsay
    System.out.println("Please input the values for your sausage specs below:");

    System.out.print("Product Name: ");
    sProductName = scan.next();

    System.out.print("Meat Filling (1. beef, 2. pork, 3. chicken, 4. venison, 5. turkey, 6. lamb, 7. vegan, 8. mystery): ");
    int switchFillingVal = scan.nextInt();
    switch (switchFillingVal) {
      case 1:
        SMeatType = MeatType.beef;
        break;
      case 2:
        SMeatType = MeatType.pork;
        break;
      case 3:
        SMeatType = MeatType.chicken;
        break;
      case 4:
        SMeatType = MeatType.venison;
        break;
      case 5:
        SMeatType = MeatType.turkey;
        break;
      case 6:
        SMeatType = MeatType.lamb;
        break;
      case 7:
        SMeatType = MeatType.vegan;
        break;
      case 8:
        SMeatType = MeatType.mystery;
        break;
      default:
        SMeatType = MeatType.pork;
        System.out.println("Invalid entry, default set to pork.");
        break;
    }

    // Do whiles for catching out-of-bounds values - Lindsay
    do{
      System.out.print("Production Cost: ");
      sProductionCost = scan.nextDouble();
    }while(sProductionCost < 0);

    do{
      System.out.print("Selling Price: ");
      sSellingPrice = scan.nextDouble();
    }while(sSellingPrice < 0);

    do{
      System.out.print("Sausage Length: ");
      sSausageLength = scan.nextDouble();
    }while(sSausageLength < 0);

    do{
      System.out.print("Fat Percentage (up to 50): ");
      sFatPercentage = scan.nextInt();
    }while((sFatPercentage < 0) || (sFatPercentage > 50));

    System.out.print("Cooked (1. true, 2. false)? ");
    int switchCookedVal = scan.nextInt();
    switch (switchCookedVal) {
      case 1:
        sIsCooked = true;
        break;
      case 2:
        sIsCooked = false;
        break;
      default:
        sIsCooked = false;
        System.out.println("Invalid entry, default set to false.");
        break;
    }
    
    // Create a sausage based on input values - Lindsay
    newSausage = new Sausage(sProductName, SMeatType, sProductionCost, sSellingPrice, sSausageLength, sFatPercentage, sIsCooked);
    return newSausage;
  }

  // Add a sausage - Lindsay
  public static void MainAddSausage(Sausage newSausage) {
    fullPackBox.AddSausage(newSausage);
  }

  // NOTE FOR ALL METHODS BELOW: USER-INPUTTED SAUSAGE NUMBER IS NATURAL INDEX (STARTING FROM 1, NOT 0)

  // Read a specific sausage - Lindsay
  public static void MainReadOneSausage() {
    int selectedSausage;
    // boolean isNum = false;
    do{
      System.out.print("Which sausage would you like to view? ");
      selectedSausage = scan.nextInt();
      try {
        // selectedSausage = Integer.parseInt(scan.next());
        // isNum = true;
        fullPackBox.ReadOneSausage(selectedSausage);
      } catch (Exception e) {
        System.out.println("Selected sausage is out of bounds!");
      }
    } while((selectedSausage > arrayCapacity) || (selectedSausage < 1)); // || (isNum == false));
  }

  // Update a sausage - Lindsay
  public static void MainUpdateSausage(Sausage newSausage){
    int selectedSausage;
    do{
      System.out.print("Which sausage would you like to update? ");
      selectedSausage = scan.nextInt();
      try {
        fullPackBox.ChangeSausage(selectedSausage, newSausage);
        arrayCapacity ++;
      } catch (Exception e) {
        System.out.println("Selected sausage is out of bounds!");
      }
    } while((selectedSausage > arrayCapacity) || (selectedSausage < 1));
  }

  // Delete a sausage - Lindsay
  public static void MainDeleteSausage() {
    int selectedSausage;
    do{
      System.out.print("Which sausage would you like to delete? ");
      selectedSausage = scan.nextInt();
      try {
        fullPackBox.DeleteSausage(selectedSausage);
      } catch (Exception e) {
        System.out.println("Selected sausage is out of bounds!");
      }
    } while((selectedSausage > arrayCapacity) || (selectedSausage < 1));
  }
}
