import java.util.ArrayList;

public class Week2Challenge {
    public static void main(String[] args){

        int counter = 1;

        do {
            ArrayList<String> burrito = new ArrayList<>();

            ArrayList<String> rice = new ArrayList<>();
            rice.add("white rice");
            rice.add("brown rice");
            rice.add("no rice");
            burrito.add(rice.get((int) (Math.random()* rice.size())));

            ArrayList<String> meat = new ArrayList<>();
            meat.add("chicken");
            meat.add("steak");
            meat.add("carnidas");
            meat.add("chorizo");
            meat.add("sofritas");
            meat.add("no meat");
            burrito.add(meat.get((int) (Math.random()* meat.size())));

            ArrayList<String> beans = new ArrayList<>();
            beans.add("pinto beans");
            beans.add("black beans");
            beans.add("no beans");
            burrito.add(beans.get((int) (Math.random()* beans.size())));

            ArrayList<String> salsa = new ArrayList<>();
            salsa.add("mild salsa");
            salsa.add("medium salsa");
            salsa.add("hot salsa");
            salsa.add("no salsa");
            salsa.add("all salsa options");
            burrito.add(salsa.get((int) (Math.random()* salsa.size())));

            ArrayList<String> veggies = new ArrayList<>();
            veggies.add("lettuce");
            veggies.add("fajita veggies");
            veggies.add("no veggies");
            veggies.add("all veggie options");
            burrito.add(veggies.get((int) (Math.random()* veggies.size())));

            ArrayList<String> cheese = new ArrayList<>();
            cheese.add("cheese");
            cheese.add("no cheese");
            burrito.add(cheese.get((int) (Math.random()* cheese.size())));

            ArrayList<String> guac = new ArrayList<>();
            guac.add("guac");
            guac.add("no guac");
            burrito.add(guac.get((int) (Math.random()* guac.size())));

            ArrayList<String> queso = new ArrayList<>();
            queso.add("queso");
            queso.add("no queso");
            burrito.add(queso.get((int) (Math.random()* queso.size())));

            ArrayList<String> sourCream = new ArrayList<>();
            sourCream.add("sour cream");
            sourCream.add("no sour cream");
            burrito.add(sourCream.get((int) (Math.random()* sourCream.size())));


            System.out.print("Burrito " + counter + ": ");
            for(int i = 0; i < burrito.size(); i++){
                if(i < 8){
                    System.out.print(burrito.get(i) + ",");

                }else{
                    System.out.print(burrito.get(i));
                }
            }
            System.out.println();
            burrito.clear();
            counter++;
        }while(counter <= 25);

    }
}
