import java.util.ArrayList;

public class Week2Challenge {
    public static void main(String[] args){

        //variables
        int counter = 1;
        int ingCounter = 0;

        //do while loop that continues until the counter variable equals 25
        do {
            //Burrito array
            ArrayList<String> burrito = new ArrayList<>();

            //Rice Array
            ArrayList<String> rice = new ArrayList<>();
            rice.add("white rice");
            rice.add("brown rice");
            rice.add("no rice");
            /*
            Rice random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(rice.get((int) (Math.random()* rice.size())));

            //Meat array
            ArrayList<String> meat = new ArrayList<>();
            meat.add("chicken");
            meat.add("steak");
            meat.add("carnidas");
            meat.add("chorizo");
            meat.add("sofritas");
            meat.add("no meat");
            /*
            Meat random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(meat.get((int) (Math.random()* meat.size())));

            //Beans array
            ArrayList<String> beans = new ArrayList<>();
            beans.add("pinto beans");
            beans.add("black beans");
            beans.add("no beans");
            /*
            Beans random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(beans.get((int) (Math.random()* beans.size())));

            //Salsa Array
            ArrayList<String> salsa = new ArrayList<>();
            salsa.add("mild salsa");
            salsa.add("medium salsa");
            salsa.add("hot salsa");
            salsa.add("no salsa");
            salsa.add("all salsa options");
            /*
            Salsa random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(salsa.get((int) (Math.random()* salsa.size())));

            //Veggies Array
            ArrayList<String> veggies = new ArrayList<>();
            veggies.add("lettuce");
            veggies.add("fajita veggies");
            veggies.add("diced tomato");
            veggies.add("no veggies");
            veggies.add("all veggie options");
            /*
            Veggie random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(veggies.get((int) (Math.random()* veggies.size())));

            //Cheese Array
            ArrayList<String> cheese = new ArrayList<>();
            cheese.add("cheese");
            cheese.add("no cheese");
            /*
            Cheese random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(cheese.get((int) (Math.random()* cheese.size())));

            //Guac Array
            ArrayList<String> guac = new ArrayList<>();
            guac.add("guac");
            guac.add("no guac");
            /*
            Guac random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(guac.get((int) (Math.random()* guac.size())));

            //Queso Array
            ArrayList<String> queso = new ArrayList<>();
            queso.add("queso");
            queso.add("no queso");
            /*
            Queso random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(queso.get((int) (Math.random()* queso.size())));

            //Sour Cream Array
            ArrayList<String> sourCream = new ArrayList<>();
            sourCream.add("sour cream");
            sourCream.add("no sour cream");
            /*
            Sour Cream random number generator. Whatever index is chosen is added to the
            Burrito array
            */
            burrito.add(sourCream.get((int) (Math.random()* sourCream.size())));

            //Loop runs through the Burrito array. Displaying the contents
            System.out.print("Burrito " + counter + ": ");
            for(int i = 0; i < burrito.size(); i++){

                /*If the content of the current index contains "all"
                  or does NOT contain "no"
                  then the ingCounter will be increased by a certain amount
                  to reflect the total added ingredients
                 */
                if(burrito.get(i).contains("all")){
                    ingCounter += 3;
                }else if(!burrito.get(i).contains("no")){
                    ingCounter++;
                }

                //If statement for whether or not to include commas between indexes
                if(i < (burrito.size()-1)){
                    System.out.print(burrito.get(i) + ", ");

                }else{
                    System.out.print(burrito.get(i));
                }
            }
            /*Call cost method. Displays the price of the burrito.
              This adjusts based on the ingCounter determined
              in the previous for loop
             */
            cost(counter, ingCounter);
            System.out.println();
            //Burrito array contents is cleared before next loop
            burrito.clear();
            //Reset ingCounter to zero before next loop
            ingCounter = 0;
            //Increment counter to keep track of total loops
            counter++;
        }while(counter <= 25);

    }
    //cost Method
    public static void cost(int count, int ingred){
        int counter = count;
        int ingCounter = ingred;
        System.out.println("\nBurrito " + counter + " costs: $" + (3 +(.50*ingCounter)));
    }
}
