/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.util.Scanner;

/**
 *
 * @author kangh4484
 */
public class FinalProject {

    public static void mcdonaldsmenu() {
        Scanner input = new Scanner(System.in);
        double price = 0;
        System.out.println("Here are the menu for McDonalds");
        System.out.println("");
        while (true) {
            System.out.println("1 - Big Mac Meal ($3.99)");
            System.out.println("2 - Double Cheeeseburgers Meal ($4.89)");
            System.out.println("3 - Double Quarter Pounder with Cheese Meal ($6.69)");
            System.out.println("4 - Artisan Grilled Chicken Meal ($6.39)");
            System.out.println("5 - Filet-O-Fish Meal ($6.79)");
            System.out.println("6 - Chicken McNuggets 20 Pc. ($5.00)");
            System.out.println("7 - Bacon Ranch Salad ($4.59)");
            System.out.println("8 - French Fries Large ($1.89)");
            System.out.println("9 - Soft Drink Large ($1.49)");
            System.out.println("");
            System.out.println("Please enter the number of the food or END to end");
            String food = input.nextLine();
            if (food.equals("END") || food.equals("end")) {
                break;
            } else {
                System.out.println("How many would you like to order?");
                int amount = input.nextInt();
                input.nextLine();
                price = price + mcdonaldsprice(food, amount);
                System.out.println("Type Continue to go back to menu or END to end");
                String ask = input.nextLine();
                if (ask.equals("Continue") || ask.equals("continue")) {
                    System.out.println("");
                } else if (ask.equals("END") || ask.equals("end")) {
                    price = price + (price * 0.13);
                    price = Math.round(price * 100d) / 100d;
                    System.out.println("total amount for your order is $" + price + " (+tax)");
                    break;
                }

            }
        }
    }

    public static double mcdonaldsprice(String food, int amount) {
        double price = 0;
        if (food.equals("1")) {
            price = 3.99;
        } else if (food.equals("2")) {
            price = 4.89;
        } else if (food.equals("3")) {
            price = 6.69;
        } else if (food.equals("4")) {
            price = 6.39;
        } else if (food.equals("5")) {
            price = 6.79;
        } else if (food.equals("6")) {
            price = 5;
        } else if (food.equals("7")) {
            price = 4.59;
        } else if (food.equals("8")) {
            price = 1.89;
        } else if (food.equals("9")) {
            price = 1.49;
        }
        price = price * amount;
        return price;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to fast food delivery");
            System.out.println("Please type number or name of the restaurant you want");
            System.out.println("1 - McDonalds");
            System.out.println("2 - KFC");
            System.out.println("3 - Wendy's");
            System.out.println("4 - A&W");
            String restaurant = input.nextLine();
            System.out.println("");
            if (restaurant.equals("1") || restaurant.equals("McDonalds") || restaurant.equals("mcdonalds")) {
                System.out.println("You selected McDonalds");
                System.out.println("Please type Continue to select meal or Back to return");
                String ask = input.nextLine();
                System.out.println("");
                if (ask.equals("Continue") || ask.equals("continue")) {
                    mcdonaldsmenu();
                    break;
                } else if (ask.equals("Back") || ask.equals("back")) {
                }

            } else if (restaurant.equals("2") || restaurant.equals("KFC") || restaurant.equals("kfc")) {
            } else if (restaurant.equals("3") || restaurant.equals("Wendy's") || restaurant.equals("Wendys") || restaurant.equals("wendy's") || restaurant.equals("wendys")) {
            } else if (restaurant.equals("4") || restaurant.equals("A&W") || restaurant.equals("a&w")) {
            }
        }
    }
}