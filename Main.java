/*
Moses Dong, Nicholas Xu, and Lindsay Wang
Schenk
AP CSA - Period 7
Glizzy Goblin - Main
19 September 2023
*/

package dongwangxu.seven;
import dongwangxu.seven.MeatTypeEnum.MeatType;

public class Main {
  public static void main(String[] args) {
    
    // Default constructor - Lindsay
    Sausage defaultSausage = new Sausage();

    // Dump
    System.out.println(defaultSausage);

    // Change
    defaultSausage.setProductName("Perfect Piggy Pizzazz");
    defaultSausage.setMeatType(MeatType.pork);
    defaultSausage.setProductionCost(1.50);
    defaultSausage.setSellingPrice(4.49);
    defaultSausage.setPackageWeight(700);
    defaultSausage.setNumSausages(6);
    defaultSausage.setSausageLength(4.5);
    defaultSausage.setLeanMeatPercentage(25);
    defaultSausage.setFatPercentage(75);
    defaultSausage.setIsCooked(true);

    // Dump
    System.out.println(defaultSausage);
    
    // Partial constructor 1 - Nicholas
    Sausage mysterySausage = new Sausage("Merry Meat Mash", 1.8, 800, 4.99, 6);
    
    System.out.println(mysterySausage);
    
    mysterySausage.setProductName("Mini Meat Mash");
    mysterySausage.setMeatType(MeatType.mystery);
    mysterySausage.setProductionCost(1.8);
    mysterySausage.setPackageWeight(800);
    mysterySausage.setNumSausages(10);
    mysterySausage.setSellingPrice(4.99);
    mysterySausage.setSausageLength(6);
    mysterySausage.setLeanMeatPercentage(80);
    mysterySausage.setFatPercentage(20);
    mysterySausage.setIsCooked(true);

    System.out.println(mysterySausage);
    
    // Partial constructor 2 - Nicholas
    Sausage miniSausage = new Sausage("Slimming Sausages for Weight Loss", MeatType.turkey, 16, 3, 85, 15);

    System.out.println(miniSausage);

    miniSausage.setProductName("Slimming Sausages for Weight Loss");
    miniSausage.setMeatType(MeatType.turkey);
    miniSausage.setProductionCost(3.8);
    miniSausage.setPackageWeight(900);
    miniSausage.setNumSausages(18);
    miniSausage.setSellingPrice(8.49);
    miniSausage.setSausageLength(2.75);
    miniSausage.setLeanMeatPercentage(85);
    miniSausage.setFatPercentage(15);
    miniSausage.setIsCooked(true);

    System.out.println(miniSausage);
    
    // Partial Constructor 3  - Moses
    Sausage nutritionSausage = new Sausage("Sausage Yay", MeatType.vegan, 20, 20, 7, 70, 30, false);

    System.out.println(nutritionSausage);

    nutritionSausage.setProductName("The Most Nutritious Sausages");
    nutritionSausage.setMeatType(MeatType.beef);
    nutritionSausage.setProductionCost(6.00);
    nutritionSausage.setSellingPrice(10.49);
    nutritionSausage.setPackageWeight(1100);
    nutritionSausage.setNumSausages(8);
    nutritionSausage.setSausageLength(10);
    nutritionSausage.setLeanMeatPercentage(50);
    nutritionSausage.setFatPercentage(50);
    nutritionSausage.setIsCooked(true);

    System.out.println(nutritionSausage);

    // Partial Constructor 4  - Moses
    Sausage economySausage = new Sausage("Cheap Affordable Sausages", MeatType.venison, 2.90, 3.20, 190, 12);

    System.out.println(economySausage);
    economySausage.setProductName("Economical Brand Sausages");
    economySausage.setMeatType(MeatType.chicken);
    economySausage.setProductionCost(1.50);
    economySausage.setSellingPrice(2.29);
    economySausage.setPackageWeight(150);
    economySausage.setNumSausages(9);
    economySausage.setSausageLength(5);
    economySausage.setLeanMeatPercentage(50);
    economySausage.setFatPercentage(50);
    economySausage.setIsCooked(true);

    System.out.println(economySausage);
    
    // Full constructor - Lindsay
    Sausage fullSausage = new Sausage("Cheery Chump Chick", MeatType.chicken, 1.00, 3.99, 700, 6, 5.0, 20, 80, true);

    // Dump
    System.out.println(fullSausage);

    // Change
    fullSausage.setProductName("Terrific Twisted Turkey");
    fullSausage.setMeatType(MeatType.turkey);
    fullSausage.setProductionCost(1.75);
    fullSausage.setSellingPrice(4.99);
    fullSausage.setPackageWeight(850);
    fullSausage.setNumSausages(8);
    fullSausage.setSausageLength(4.25);
    fullSausage.setLeanMeatPercentage(40);
    fullSausage.setFatPercentage(60);
    fullSausage.setIsCooked(false);

    // Dump
    System.out.println(fullSausage);
  }
}
