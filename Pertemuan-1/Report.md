Pertanyaan
1. Jelaskan perbedaan antara object dengan class!
2. Jelaskan alasan gear dan brand dapat menjadi atribut dari object Bike!
3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
dengan pemrograman prosedural!
4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti
“public String nama, alamat;”?
5. Pada class RoadBike, jelaskan alasan atribut brand, speed, dan gear tidak lagi ditulis di dalam
class tersebut!

Jawaban
1.	Perbedaan antara object dengan class adalah class merupakan cetak biru atau template yang mendefinisikan atribut dan method, sedangkan object adalah hasil instansiasi nyata dari class tersebut yang memiliki nilai konkret untuk setiap atributnya.
2.	Gear dan brand dapat menjadi atribut dari object Bike karena keduanya merupakan state atau ciri-ciri yang melekat pada sepeda di dunia nyata, sehingga ketika sepeda dimodelkan sebagai object, brand dan gear menjadi atribut yang mendeskripsikan karakteristik dari object tersebut.
3.	Salah satu kelebihan utama pemrograman berorientasi objek dibandingkan pemrograman prosedural adalah program lebih modular dan fleksibel karena dipecah menjadi object-object yang independen, sehingga perubahan pada satu bagian tidak akan mengganggu keseluruhan program.
4.	Pendefinisian dua buah atribut dalam satu baris kode seperti "public String nama, alamat;" diperbolehkan secara sintaks dalam bahasa Java karena Java mengizinkan deklarasi beberapa variabel dengan tipe data yang sama dalam satu baris, namun cara ini kurang disarankan karena dapat mengurangi keterbacaan kode.
5.	Pada class RoadBike, atribut brand, speed, dan gear tidak ditulis lagi di dalam class tersebut karena class RoadBike mewarisi class Bike melalui kata kunci extends, sehingga secara otomatis semua atribut dan method yang dimiliki oleh class Bike tersedia di class RoadBike tanpa perlu didefinisikan ulang, sesuai dengan konsep inheritance yang bertujuan menghindari duplikasi kode.
