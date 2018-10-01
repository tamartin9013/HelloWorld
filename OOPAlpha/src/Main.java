/*
 * 10/1/2018
 * Author: T. Martin
 * Description: Output the information gathered in Class Product
 */
public class Main {

  public static void main(String args[]) {

    Widget w1 = new Widget("Widget 1");             //Product name 1 = Widget 1
    System.out.println(w1.toString());              //Print the results from toString method
                                                    //  from Product.java
    Widget w2 = new Widget("Widget 2");             //Product name 2 = Widget 2
    System.out.println(w2.toString());              //Print the results from toString method
                                                    //  from Product.java

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.typeCode);   //Print the enum data
    }

  }

}
/*Widget extends Product so when you use the String name in widget, 
* it is the same as using it in class product.
* Because Product is abstract, in order to make an object you have 
* to create a new class.
*/
class Widget extends Product {

  public Widget(String name) {                      //
    super(name);
  }

}