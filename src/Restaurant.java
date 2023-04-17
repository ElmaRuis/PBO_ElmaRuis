import java.util.ArrayList;

public class Restaurant{
    private int id;
    private String nama;
    private String alamat;
    private ArrayList<Menu> makanan;
    private ArrayList<Menu> minuman;

    public Restaurant(){
        //default constructor
        this.makanan = new ArrayList<>();
        this.minuman = new ArrayList<>();
    }