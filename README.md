# PBO_ElmaRuis
Program Pembelian Makanan Berbasis Online

Pada program ini ada beberapa class yang digunakan, yaitu class main, menu, order, dan restaurant. Di setiap kelasnya ada beberapa method yang digunakan untuk menampilkan perintah yang diinginkan. Misalnya pada tiap-tiap class ada method get dan juga set. Seperti method getTotal dan juga method setTotal pada class order. Method yang dibuat kemudian dipanggil sesuai dengan fungsinya pada class main. Method getTotal digunakan pada case ke-3 (login sebagai user) yaitu case untuk menampilkan detail order. Dengan adanya method getTotal, kita bisa menampilkan total biaya yang harus dibayarkan oleh user atas pesanan yang telah dibuat sebelumnya.
Untuk cara kerja program, pertama akan ada inputan yang diharapkan sebagai penunjuk kategori yang akan digunakan atau diakses. Inputan yang diharapkan yaitu username ‘admin’ dengan password ‘admin’ untuk login sebagai admin. Sedangkan untuk login sebagai user, inputan yang diharapkan yaitu inputan berupa username ‘user’ dengan password ‘user’. 
Apabila berhasil login sebagai admin, maka akan ada beberapa menu yang bisa diakses. Yaitu menu untuk melihat restoran, menambah restoran, dan menghapus restoran. Untuk menambah restoran, kita harus menginputkan angka 2 (mengarah pada menu tambah restoran). Sedangkan untuk melihat restoran, kita harus menginputkan angka 1, dan angka 3 digunakan untuk menghapus restoran.
Selanjutnya, apabila berhasil login sebagai user, maka akan ada beberapa menu yang dapat diakses, yaitu menu untuk melihat restoran, menambah pesanan, dan melihat detail pesanan. Pesanan hanya dapat dilakukan apabila restoran telah ditambahkan sebelumnya. Jika restoran belum ditambahkan pada menu admin, maka akan ada kalimat peringatan tidak adanya restoran yang ditampilkan sebagai output. Ketika pesanan berhasil dilakukan, barulah detail pesanan bisa diakses dengan menginputkan angka 3 (mengarah pada menu detail pesanan). Pada detail pesanan ini akan ditampilkan beberapa output yaitu makanan dan minuman yang dipesan beserta jumlahnya, serta total harga yang merupakan hasil dari total harga minuman yang dipesan dijumlahkan dengan total harga makanan yang dipesan.
