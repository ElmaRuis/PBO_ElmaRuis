import java.util.ArrayList;
public class Order {
    private int idRestaurant;
    private ArrayList<Menu> menuMakanan;
    private ArrayList<Integer> qtyMenuMakanan;
    private ArrayList<Menu> menuMinuman;
    private ArrayList<Integer> qtyMenuMinuman;
    private float jarak;
    private long total;

    public Order(){
        //Default constructor
        menuMakanan = new ArrayList<>();
        qtyMenuMakanan = new ArrayList<>();
        menuMinuman = new ArrayList<>();
        qtyMenuMinuman = new ArrayList<>();
    }


