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
            System.out.println("6 - Chicken McNuggets 20 Pc ($5.00)");
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
        } else if (!food.equals(1) || !food.equals(2) || !food.equals(3) || !food.equals(4) || !food.equals(5) || !food.equals(6) || !food.equals(7) || !food.equals(8) || !food.equals(9)) {
            System.out.println("Wrong number!!!");
            price = 0;
        }
        price = price * amount;
        return price;
    }

    public static void kfcmenu() {
        Scanner input = new Scanner(System.in);
        double price = 0;
        System.out.println("Here are the menu for KFC");
        System.out.println("");
        while (true) {
            System.out.println("1 - 2Pc. Chicken - Combo ($5.99)");
            System.out.println("2 - Doublicious Sandwich - Combo ($5.99)");
            System.out.println("3 - Popcorn Nuggets - Combo ($5.49)");
            System.out.println("4 - 1 Pc. Basket (Chicken Breast, Coleslaw & Biscuit) ($5.49)");
            System.out.println("5 - 2 Pc. Basket (Drumstick & Thigh, Coleslaw & Biscuit) ($5.49)");
            System.out.println("6 - 8 Pc. Meal (8 Pc. Chicken, Large Mashed Potatoes & Gravy, Large Coleslaw & 4 Biscuits) ($21.99)");
            System.out.println("7 - Family Meal - 8 Pc. Chicken, 2 Large Mashed Potatoes, Large Gravy, Large Coleslaw & 4 Biscuits ($20.00)");
            System.out.println("8 - Mashed Potatoes Large ($3.79)");
            System.out.println("9 - Potato Wedges Large ($3.79)");
            System.out.println("10 - Soft Drink Large ($1.99)");
            System.out.println("");
            System.out.println("Please enter the number of the food or END to end");
            String food = input.nextLine();
            if (food.equals("END") || food.equals("end")) {
                break;
            } else {
                System.out.println("How many would you like to order?");
                int amount = input.nextInt();
                input.nextLine();
                price = price + kfcprice(food, amount);
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

    public static double kfcprice(String food, int amount) {
        double price = 0;
        if (food.equals("1")) {
            price = 5.99;
        } else if (food.equals("2")) {
            price = 5.99;
        } else if (food.equals("3")) {
            price = 5.49;
        } else if (food.equals("4")) {
            price = 5.49;
        } else if (food.equals("5")) {
            price = 5.49;
        } else if (food.equals("6")) {
            price = 21.99;
        } else if (food.equals("7")) {
            price = 20;
        } else if (food.equals("8")) {
            price = 3.79;
        } else if (food.equals("9")) {
            price = 3.79;
        } else if (food.equals("10")) {
            price = 1.99;
        } else if (!food.equals(1) || !food.equals(2) || !food.equals(3) || !food.equals(4) || !food.equals(5) || !food.equals(6) || !food.equals(7) || !food.equals(8) || !food.equals(9) || !food.equals(10)) {
            System.out.println("Wrong number!!!");
            price = 0;
        }
        price = price * amount;
        return price;
    }

    public static void wendysmenu() {
        Scanner input = new Scanner(System.in);
        double price = 0;
        System.out.println("Here are the menu for Wendy's");
        System.out.println("");
        while (true) {
            System.out.println("1 - Dave's Hot 'n Juicy 1/4 lb. Single with Cheese - Combo ($6.19)");
            System.out.println("2 - Dave's Hot 'n Juicy 1/2 lb.. Double with Cheese - Combo ($7.19)");
            System.out.println("3 - Dave's Hot 'n Juicy 3/4 lb. Triple with Cheese - Combo ($8.09)");
            System.out.println("4 - Baconator - Combo ($8.09)");
            System.out.println("5 - Spicy Chicken - Combo ($6.69)");
            System.out.println("6 - Asiago Ranch Chicken Club - Combo ($7.49)");
            System.out.println("7 - BBQ Ranch Chicken - Full ($6.69)");
            System.out.println("8 - Spicy Chicken Caesar ($6.69)");
            System.out.println("9 - Bacon & Cheese Baked Potato ($2.89)");
            System.out.println("10 - Soft Drink or Freshly Brewed Iced Tea Large ($2.19)");
            System.out.println("11 - Classic Frosty (Chocolate or Vanilla) Large ($2.29)");
            System.out.println("");
            System.out.println("Please enter the number of the food or END to end");
            String food = input.nextLine();
            if (food.equals("END") || food.equals("end")) {
                break;
            } else {
                System.out.println("How many would you like to order?");
                int amount = input.nextInt();
                input.nextLine();
                price = price + wendysprice(food, amount);
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

    public static double wendysprice(String food, int amount) {
        double price = 0;
        if (food.equals("1")) {
            price = 6.19;
        } else if (food.equals("2")) {
            price = 7.19;
        } else if (food.equals("3")) {
            price = 8.09;
        } else if (food.equals("4")) {
            price = 8.09;
        } else if (food.equals("5")) {
            price = 6.69;
        } else if (food.equals("6")) {
            price = 7.49;
        } else if (food.equals("7")) {
            price = 6.69;
        } else if (food.equals("8")) {
            price = 6.69;
        } else if (food.equals("9")) {
            price = 2.89;
        } else if (food.equals("10")) {
            price = 2.19;
        } else if (food.equals("11")) {
            price = 2.29;
        } else if (!food.equals(1) || !food.equals(2) || !food.equals(3) || !food.equals(4) || !food.equals(5) || !food.equals(6) || !food.equals(7) || !food.equals(8) || !food.equals(9) || !food.equals(10) || !food.equals(11)) {
            System.out.println("Wrong number!!!");
            price = 0;
        }
        price = price * amount;
        return price;
    }

    public static void anwmenu() {
        Scanner input = new Scanner(System.in);
        double price = 0;
        System.out.println("Here are the menu for Wendy's");
        System.out.println("");
        while (true) {
            System.out.println("1 - Papa Burger ($6.99)");
            System.out.println("2 - Original Bacon Double Cheeseburger ($6.99)");
            System.out.println("3 - Grilled or Crispy Chicken ($6.99)");
            System.out.println("4 - Original Bacon Cheeseburger ($6.39)");
            System.out.println("5 - Cheeseburger ($5.39)");
            System.out.println("6 - Draft A&W Root Beer Large ($2.19)");
            System.out.println("7 - Fries Individual ($1.89)");
            System.out.println("8 - Cheese Curds Premiun ($5.08)");
            System.out.println("9 - Soft Drink Large ($2.19)");
            System.out.println("");
            System.out.println("Please enter the number of the food or END to end");
            String food = input.nextLine();
            if (food.equals("END") || food.equals("end")) {
                break;
            } else {
                System.out.println("How many would you like to order?");
                int amount = input.nextInt();
                input.nextLine();
                price = price + anwprice(food, amount);
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
    public static double anwprice(String food, int amount) {
        double price = 0;
        if (food.equals("1")) {
            price = 6.99;
        } else if (food.equals("2")) {
            price = 6.99;
        } else if (food.equals("3")) {
            price = 6.99;
        } else if (food.equals("4")) {
            price = 6.39;
        } else if (food.equals("5")) {
            price = 5.39;
        } else if (food.equals("6")) {
            price = 2.19;
        } else if (food.equals("7")) {
            price = 1.89;
        } else if (food.equals("8")) {
            price = 5.08;
        } else if (food.equals("9")) {
            price = 2.19;
        }  else if (!food.equals(1) || !food.equals(2) || !food.equals(3) || !food.equals(4) || !food.equals(5) || !food.equals(6) || !food.equals(7) || !food.equals(8) || !food.equals(9)) {
            System.out.println("Wrong number!!!");
            price = 0;
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
                System.out.println("You selected KFC");
                System.out.println("Please type Continue to select meal or Back to return");
                String ask = input.nextLine();
                System.out.println("");
                if (ask.equals("Continue") || ask.equals("continue")) {
                    kfcmenu();
                    break;
                } else if (ask.equals("Back") || ask.equals("back")) {
                }

            } else if (restaurant.equals("3") || restaurant.equals("Wendy's") || restaurant.equals("Wendys") || restaurant.equals("wendy's") || restaurant.equals("wendys")) {
                System.out.println("You selected Wendy's");
                System.out.println("Please type Continue to select meal or Back to return");
                String ask = input.nextLine();
                System.out.println("");
                if (ask.equals("Continue") || ask.equals("continue")) {
                    wendysmenu();
                    break;
                } else if (ask.equals("Back") || ask.equals("back")) {
                }

            } else if (restaurant.equals("4") || restaurant.equals("A&W") || restaurant.equals("a&w")) {
                System.out.println("You selected A&W");
                System.out.println("Please type Continue to select meal or Back to return");
                String ask = input.nextLine();
                System.out.println("");
                if (ask.equals("Continue") || ask.equals("continue")) {
                    anwmenu();
                    break;
                } else if (ask.equals("Back") || ask.equals("back")) {
                }
            }
        }
    }
}
