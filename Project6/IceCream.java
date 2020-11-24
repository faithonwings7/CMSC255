import java.util.ArrayList;

public class IceCream {

    private Size size;
    private Flavor flavor;
    private Sauce sauce;
    private Topping topping;
    private ToppingSun toppingSun;

    /**
     * Construct iceCreamSelection object (default constructor)
     */
    IceCream(){
    }

    /**
     * Construct iceCreamSelection object (passing in size param)
     */
    IceCream(Size size){
        this.size = Size.SINGLE;
        this.flavor = Flavor.VANILLA;
        this.sauce = Sauce.NONE;
        this.topping = Topping.NONE;
        this.toppingSun = ToppingSun.NONE;
    }

    /**
     *Create accessors and mutators for all variables
     */
    public Size getSize(){
        return size;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Flavor getFlavor(){
        return flavor;
    }

    public void setFlavor(Flavor flavor){
        this.flavor = flavor;
    }

    public Sauce getSauce(){
        return sauce;
    }

    public void setSauce(Sauce sauce){
        this.sauce = sauce;
    }

    public Topping getTopping(){
        return topping;
    }

    public void setTopping(Topping topping){
        this.topping = topping;
    }

    public ToppingSun getToppingSun(){
        return toppingSun;
    }

    public void setToppingSun(ToppingSun toppingSun){
        this.toppingSun = toppingSun;
    }

    public String toString(){
        String result = this.size + "\n" + this.flavor + "\n" + this.sauce + "\n" + this.topping + "\n" + this.toppingSun;
        return result;
    }



}


