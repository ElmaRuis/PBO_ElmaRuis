import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int pil, id, index, kuantitas, countRestaurant = 0;
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        char loop;

        do{
            System.out.println("===Menu Utama===");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print(">> ");
            pil = Integer.parseInt(input.nextLine());

            System.out.println();
            switch(pil){
                case 1:{
                    System.out.print("Username : ");
                    username = input.nextLine();

                    System.out.print("Password : ");
                    password = input.nextLine();

                    if(username.equals("admin") && password.equals("admin")){
                        do{
                            System.out.println("\n===Menu Admin===");
                            System.out.println("1. Lihat Restaurant");
                            System.out.println("2. Tambah Restaurant");
                            System.out.println("3. Hapus Restaurant");
                            System.out.println("4. Kembali ke login");
                            System.out.print(">> ");
                            pil = Integer.parseInt(input.nextLine());

                            System.out.print("\n");
                            switch(pil){
                                case 1:{
                                    if(restaurants.size() > 0){
                                        System.out.print("Data Restaurant :");
                                        for(Restaurant restaurant : restaurants){
                                            System.out.println("\nID      : " + restaurant.getId());
                                            System.out.println("Nama    : " + restaurant.getNama());
                                            System.out.println("Alamat  : " + restaurant.getAlamat());
                                            if(restaurant.getMakanan().size() > 0){
                                                System.out.println("Menu Makanan :");
                                                for(int i=0; i < restaurant.getMakanan().size(); i++){
                                                    System.out.println((i+1) + ". " + restaurant.getMakanan().get(i).getNama() + " ( " + restaurant.getMakanan().get(i).getHarga() + " )");
                                                }
                                            }else{
                                                System.out.println("[!] Tidak Ada Menu Makanan");
                                            }

                                            if(restaurant.getMinuman().size() > 0){
                                                System.out.println("Menu Minuman :");
                                                for(int i=0; i < restaurant.getMinuman().size(); i++){
                                                    System.out.println((i+1) + ". " + restaurant.getMinuman().get(i).getNama() + " ( " + restaurant.getMinuman().get(i).getHarga() + " )");
                                                }
                                            }else{
                                                System.out.println("[!] Tidak Ada Menu Minuman");
                                            }
                                        }
                                    }else{
                                        System.out.println("Data Restaurant Masih Kosong!");
                                    }

                                    break;
                                }

                                case 2:{
                                    countRestaurant += 1;

                                    Restaurant restoran = new Restaurant();

                                    System.out.print("Masukkan Nama Restaurant : ");
                                    restoran.setNama(input.nextLine());

                                    System.out.print("\nMasukkan Alamat Restaurant : ");
                                    restoran.setAlamat(input.nextLine());

                                    while(true) {
                                        System.out.print("\nApakah Ingin Menambahkan Menu Makanan [Y/N] : ");
                                        loop = input.nextLine().toUpperCase().charAt(0);

                                        if(loop == 'Y'){
                                            Menu makanan = new Menu();

                                            System.out.print("\nMasukkan Nama Makanan : ");
                                            makanan.setNama(input.nextLine());

                                            System.out.print("\nMasukkan Harga Makanan : ");
                                            makanan.setHarga(Long.valueOf(input.nextLine()));

                                            restoran.addMakanan(makanan);
                                        }else if(loop == 'N'){
                                            break;
                                        }
                                    }

                                    while(true){
                                        System.out.print("\nApakah Ingin Menambahkan Menu Minuman [Y/N] : ");
                                        loop = input.nextLine().toUpperCase().charAt(0);

                                        if(loop == 'Y'){
                                            Menu minuman = new Menu();

                                            System.out.print("\nMasukkan Nama Minuman : ");
                                            minuman.setNama(input.nextLine());

                                            System.out.print("\nMasukkan Harga Minuman : ");
                                            minuman.setHarga(Long.valueOf(input.nextLine()));

                                            restoran.addMinuman(minuman);
                                        }else if(loop == 'N'){
                                            break;
                                        }
                                    }

                                    restoran.setId(countRestaurant);

                                    restaurants.add(restoran);
                                    System.out.println("\nData Restaurant Berhasil ditambahkan!");

                                    break;
                                }
