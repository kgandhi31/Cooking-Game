package FinalProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FinalProject {

    public static int[] time = {90, 80, 70, 60, 60, 60, 55, 55, 50, 50, 45, 45, 40, 40, 35, 30, 25, 20, 15, 10};

    public static ArrayList<String> scores = new ArrayList();

    // <editor-fold>
    public static ArrayList<String> bingredients1 = new ArrayList();//bread
    public static ArrayList<String> hingredients1 = new ArrayList();//bread
    public static ArrayList<String> singredients1 = new ArrayList();//bread

    public static ArrayList<String> bingredients2 = new ArrayList();
    public static ArrayList<String> hingredients2 = new ArrayList();
    public static ArrayList<String> singredients2 = new ArrayList();

    public static ArrayList<String> bingredients3 = new ArrayList();//meat
    public static ArrayList<String> hingredients3 = new ArrayList();//meat
    public static ArrayList<String> singredients3 = new ArrayList();//meat

    public static ArrayList<String> bingredients4 = new ArrayList();
    public static ArrayList<String> hingredients4 = new ArrayList();
    public static ArrayList<String> singredients4 = new ArrayList();

    public static ArrayList<String> sideOrder = new ArrayList();
    public static ArrayList<String> drinkOrder = new ArrayList();

    public static ArrayList<Customer> custList = new ArrayList();
    public static ArrayList<MealOrder> fullOrder = new ArrayList();
    public static ArrayList<Main> mainDish = new ArrayList();

    static int randomizeOrder = 0;

// </editor-fold>//ingredient arrays
    public static void main(String[] args) {
        loadFile("scores.txt", scores);

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
//        <editor-fold>//laodsavedingredients            
                File loadFile = new File("savedIngredients/allingredientslist.txt");
                try {
                    FileReader fr = new FileReader(loadFile);
                    BufferedReader br = new BufferedReader(fr);
                    String allLines;

                    while ((allLines = br.readLine()) != null) {
                        File loadAnIng;
                        String line;
                        if (allLines.equals("bingredients1.txt")) {
                            loadAnIng = new File("savedIngredients/bingredients1.txt");
                            FileReader fb1 = new FileReader(loadAnIng);
                            BufferedReader bb1 = new BufferedReader(fb1);
                            while ((line = bb1.readLine()) != null) {
                                bingredients1.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("hingredients1.txt")) {
                            loadAnIng = new File("savedIngredients/hingredients1.txt");
                            FileReader fh1 = new FileReader(loadAnIng);
                            BufferedReader bh1 = new BufferedReader(fh1);
                            while ((line = bh1.readLine()) != null) {
                                hingredients1.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("singredients1.txt")) {
                            loadAnIng = new File("savedIngredients/singredients1.txt");
                            FileReader fs1 = new FileReader(loadAnIng);
                            BufferedReader bs1 = new BufferedReader(fs1);
                            while ((line = bs1.readLine()) != null) {
                                singredients1.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("bingredients2.txt")) {
                            loadAnIng = new File("savedIngredients/bingredients2.txt");
                            FileReader fb2 = new FileReader(loadAnIng);
                            BufferedReader bb2 = new BufferedReader(fb2);
                            while ((line = bb2.readLine()) != null) {
                                bingredients2.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("hingredients2.txt")) {
                            loadAnIng = new File("savedIngredients/hingredients2.txt");
                            FileReader fh2 = new FileReader(loadAnIng);
                            BufferedReader bh2 = new BufferedReader(fh2);
                            while ((line = bh2.readLine()) != null) {
                                hingredients2.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("singredients2.txt")) {
                            loadAnIng = new File("savedIngredients/singredients2.txt");
                            FileReader fs2 = new FileReader(loadAnIng);
                            BufferedReader bs2 = new BufferedReader(fs2);
                            while ((line = bs2.readLine()) != null) {
                                singredients2.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("bingredients3.txt")) {
                            loadAnIng = new File("savedIngredients/bingredients3.txt");
                            FileReader fb3 = new FileReader(loadAnIng);
                            BufferedReader bb3 = new BufferedReader(fb3);
                            while ((line = bb3.readLine()) != null) {
                                bingredients3.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("hingredients3.txt")) {
                            loadAnIng = new File("savedIngredients/hingredients3.txt");
                            FileReader fh3 = new FileReader(loadAnIng);
                            BufferedReader bh3 = new BufferedReader(fh3);
                            while ((line = bh3.readLine()) != null) {
                                hingredients3.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("singredients3.txt")) {
                            loadAnIng = new File("savedIngredients/singredients3.txt");
                            FileReader fs3 = new FileReader(loadAnIng);
                            BufferedReader bs3 = new BufferedReader(fs3);
                            while ((line = bs3.readLine()) != null) {
                                singredients3.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("bingredients4.txt")) {
                            loadAnIng = new File("savedIngredients/bingredients4.txt");
                            FileReader fb4 = new FileReader(loadAnIng);
                            BufferedReader bb4 = new BufferedReader(fb4);
                            while ((line = bb4.readLine()) != null) {
                                bingredients4.add(line);

                            }
                            randomizeOrder++;
                        } else if (allLines.equals("hingredients4.txt")) {
                            loadAnIng = new File("savedIngredients/hingredients4.txt");
                            FileReader fh4 = new FileReader(loadAnIng);
                            BufferedReader bh4 = new BufferedReader(fh4);
                            while ((line = bh4.readLine()) != null) {
                                hingredients4.add(line);
                            }
                            randomizeOrder++;
                        } else if (allLines.equals("singredients4.txt")) {
                            loadAnIng = new File("savedIngredients/singredients4.txt");
                            FileReader fs4 = new FileReader(loadAnIng);
                            BufferedReader bs4 = new BufferedReader(fs4);
                            while ((line = bs4.readLine()) != null) {
                                singredients4.add(line);
                            }
                            randomizeOrder++;
                        } else if (allLines.equals("sideOrder.txt")) {
                            loadAnIng = new File("savedIngredients/sideOrder.txt");
                            FileReader fside = new FileReader(loadAnIng);
                            BufferedReader bside = new BufferedReader(fside);
                            while ((line = bside.readLine()) != null) {
                                sideOrder.add(line);
                            }
                            randomizeOrder++;
                        } else if (allLines.equals("drinkOrder.txt")) {
                            loadAnIng = new File("savedIngredients/drinkOrder.txt");
                            FileReader fdrink = new FileReader(loadAnIng);
                            BufferedReader bdrink = new BufferedReader(fdrink);
                            while ((line = bdrink.readLine()) != null) {
                                drinkOrder.add(line);
                            }
                            randomizeOrder++;

                        }

                    }//end whiel

                } catch (IOException e) {
                    System.out.println(e);
                }
//        </editor-fold>//
                new MainMenu().setVisible(true);

                if (randomizeOrder == 14) {
                    for (int i = 0; i < 20; i++) {
                        int rand = randomWithRange(3);
                        if (rand == 0) {
                            mainDish.add(new Burger("Burger",
                                    bingredients1.get(randomWithRange(bingredients1.size())),
                                    bingredients2.get(randomWithRange(bingredients2.size())),
                                    bingredients3.get(randomWithRange(bingredients3.size())),
                                    bingredients4.get(randomWithRange(bingredients4.size()))));
                        } else if (rand == 1) {
                            mainDish.add(new Hotdog("Hotdog",
                                    hingredients1.get(randomWithRange(hingredients1.size())),
                                    hingredients2.get(randomWithRange(hingredients2.size())),
                                    hingredients3.get(randomWithRange(hingredients3.size())),
                                    hingredients4.get(randomWithRange(hingredients4.size()))));
                        } else {
                            mainDish.add(new Sandwich("Sandwich",
                                    singredients1.get(randomWithRange(singredients1.size())),
                                    singredients2.get(randomWithRange(singredients2.size())),
                                    singredients3.get(randomWithRange(singredients3.size())),
                                    singredients4.get(randomWithRange(singredients4.size()))));
                        }
                        fullOrder.add(new MealOrder((mainDish.get(i)),
                                sideOrder.get(randomWithRange(sideOrder.size())),
                                drinkOrder.get(randomWithRange(drinkOrder.size()))));
                    }

                    for (int i = 0;
                            i < 20; i++) {
                        custList.add(new Customer(fullOrder.get(i)));

                        System.out.println(".............................CUST order");
                        System.out.println(custList.get(i).mealOrder.meal.name);
                        System.out.println(custList.get(i).mealOrder.meal.ingredient1);
                        System.out.println(custList.get(i).mealOrder.meal.ingredient2);
                        System.out.println(custList.get(i).mealOrder.meal.ingredient3);
                        System.out.println(custList.get(i).mealOrder.meal.ingredient4);
                        System.out.println(custList.get(i).mealOrder.side);
                        System.out.println(custList.get(i).mealOrder.drink);
//                    fullOrder.get(i).mainDish.get(i).name);
                    }
                }
            }

        });
//        <editor-fold>//
////////////////////////////////////////////////////////////////sideOrder&Drink
//        sideOrder.add(
//                "Fries");
//        sideOrder.add(
//                "Onion Rings");
//        sideOrder.add(
//                "Salad");
//        sideOrder.add(
//                "None");
//
//        drinkOrder.add(
//                "Water");
//        drinkOrder.add(
//                "Coke");
//        drinkOrder.add(
//                "Sprite");
//        drinkOrder.add(
//                "Root Beer");
//        drinkOrder.add(
//                "Orange Juice");
//        drinkOrder.add(
//                "None");
////////////////////////////////////////////////////////////////ingredients1
//        bingredients1.add(
//                "White Bun");
//        bingredients1.add(
//                "Whole Wheat Bun");
//        bingredients1.add(
//                "Sesame Seeds Bun");
//        bingredients1.add(
//                "Sweet Bun");
//        hingredients1.add(
//                "White Bun");
//        hingredients1.add(
//                "Whole Grain Bun");
//        singredients1.add(
//                "Whole Wheat Bread");
//        singredients1.add(
//                "White Bread");
//        singredients1.add(
//                "Toasted Bread");
//        singredients1.add(
//                "Crustless Bread");
////////////////////////////////////////////////////////////////ingredients2
//        bingredients2.add(
//                "Ketchup");
//        bingredients2.add(
//                "Mustard");
//        bingredients2.add(
//                "Cheese");
//        bingredients2.add(
//                "Pickles");
//        bingredients2.add(
//                "Tomatoes");
//        bingredients2.add(
//                "Lettuce");
//        bingredients2.add(
//                "None");
//
//        hingredients2.add(
//                "Ketchup");
//        hingredients2.add(
//                "Mustard");
//        hingredients2.add(
//                "Relish");
//        hingredients2.add(
//                "Onions");
//        hingredients2.add(
//                "None");
//
//        singredients2.add(
//                "Ketchup");
//        singredients2.add(
//                "Mayonnaise");
//        singredients2.add(
//                "Cheese");
//        singredients2.add(
//                "Pickles");
//        singredients2.add(
//                "Tomatoes");
//        singredients2.add(
//                "Lettuce");
//        singredients2.add(
//                "None");
////////////////////////////////////////////////////////////////ingredients3
//        bingredients3.add(
//                "Beef Patty");
//        bingredients3.add(
//                "Veggie Patty");
//        bingredients3.add(
//                "No Patty");
//
//        hingredients3.add(
//                "Grilled Sausage");
//        hingredients3.add(
//                "Artificial Sausage");
//        hingredients3.add(
//                "Organic Sausage");
//        hingredients3.add(
//                "None");
//
//        singredients3.add(
//                "Turkey");
//        singredients3.add(
//                "Salami");
//        singredients3.add(
//                "Chicken");
//        singredients3.add(
//                "Beef");
//        singredients3.add(
//                "None");
////////////////////////////////////////////////////////////////ingredients4
//        bingredients4.add(
//                "Ketchup");
//        bingredients4.add(
//                "Mustard");
//        bingredients4.add(
//                "Cheese");
//        bingredients4.add(
//                "Pickles");
//        bingredients4.add(
//                "Tomatoes");
//        bingredients4.add(
//                "Lettuce");
//        bingredients4.add(
//                "None");
//
//        hingredients4.add(
//                "Ketchup");
//        hingredients4.add(
//                "Mustard");
//        hingredients4.add(
//                "Relish");
//        hingredients4.add(
//                "Onions");
//        hingredients4.add(
//                "None");
//
//        singredients4.add(
//                "Ketchup");
//        singredients4.add(
//                "Mayonnaise");
//        singredients4.add(
//                "Cheese");
//        singredients4.add(
//                "Pickles");
//        singredients4.add(
//                "Tomatoes");
//        singredients4.add(
//                "Lettuce");
//        singredients4.add(
//                "None");
// </editor-fold>//ingredient constructors

    }//end main

    public static int randomWithRange(int max) {
        int min = 0;
        int range = (max - min);
        return (int) ((Math.random() * range) + min);
    }

    public static void loadFile(String filename, ArrayList tempList) {
        String temp = "";

        try {

            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {

                temp = file.readLine();
                String tempArray[] = temp.split(",");

                //the next line is customized for whatever class you are creating.
                tempList.add(new String(tempArray[0]));

            }//End while

        } catch (IOException e) {

            System.out.println(e);

        }//End catch

    }//End loadFile

    //You will need to change the type of the arraylist here   ↓
    public static void saveFile(String filename, ArrayList<String> tempList) {

        try {

            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {

                //the next lines are customized for whatever data you are getting.
                String toSave = "";
                toSave = tempList.get(i);

                file.println(toSave);

            }//End for loop

            file.close();

        } catch (IOException ex) {

            System.out.println(ex.toString());

        }//End catch

    }//End saveFile

//    public static void convertScores(ArrayList<String> scoreList) {
//
//        for (int i = 0; i < scoreList.size(); i++) {
//
//            String[] scoreOnly = scoreList.get(i).split(" ");
//
//            names.add(scoreOnly[1]);
//
//        }   
//        
//        
//
//    }
    
    public static void sortByScore(ArrayList<String> names) {

        boolean flag = true;

        while (flag) {

            flag = false;

            for (int i = 0; i < names.size() - 1; i++) {

                String[] firstScore = names.get(i).split(" ");
                String[] secondScore = names.get(i + 1).split(" ");

                int score1 = Integer.parseInt(firstScore[1]);
                int score2 = Integer.parseInt(secondScore[1]);

                if (score1 < score2) {

                    String temp = names.get(i);
                    names.set(i, names.get(i + 1));
                    names.set(i + 1, temp);
                    flag = true;

                }

            }

        }//end while

        System.out.println("Done sort");
    }

    public static void sortByName(ArrayList<String> names) {

        boolean flag = true;

        while (flag) {

            flag = false;

            for (int i = 0; i < names.size() - 1; i++) {

                if (names.get(i).compareTo(names.get(i + 1)) > 0) {

                    String temp = names.get(i);
                    names.set(i, names.get(i + 1));
                    names.set(i + 1, temp);
                    flag = true;

                }

            }

        }//end while

    }

    public static int binarySearch(ArrayList<String> scoreList, String searchTerm) {

        int start = 0;
        int end = scoreList.size() - 1;

        ArrayList<String> currentNames = new ArrayList();

        for (int i = 0; i < scoreList.size(); i++) {

            String[] currentScore = scoreList.get(i).split(" ");

            currentNames.add(currentScore[0]);

            System.out.println(currentNames.get(i));

        }

        while (start <= end) {

            int mid = (start + end) / 2;

            if (searchTerm.toLowerCase().equals(currentNames.get(mid).toLowerCase())) {

                return mid;

            } else if (searchTerm.toLowerCase().compareTo(currentNames.get(mid).toLowerCase()) < 0) {

                end = mid - 1;

            } else if (searchTerm.toLowerCase().compareTo(currentNames.get(mid).toLowerCase()) > 0) {

                start = mid + 1;
            }

        }

        return -1;

    }//binary search String arraylist 
}//end class

