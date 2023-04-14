import java.util.Scanner;

public class ProgramZakat {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int jumlahWarga, jumlahBeras, jumlahUang, totalUangZakat, totalBerasZakat, totalUangSedekah;

    System.out.println("Berapa banyak warga yang membayar zakat fitri? : ");
    jumlahWarga = scan.nextInt();
    
    System.out.println("Berapa banyak warga yang membayar zakat fitri dengan beras? : ");
    jumlahBeras = scan.nextInt();
    
    totalBerasZakat = jumlahBeras * 2.5;  // 2.5 = berat beras
    totalUangZakat = (jumlahWarga - jumlahBeras) * 35000;  // 35000 = harga zakat
    
    System.out.println("Berapa banyak uang sedekah yang terkumpul? : ");
    totalUangSedekah = scan.nextInt();
    
    System.out.println("Jumlah beras zakat yang terkumpul : " + totalBerasZakat + " Kg");
    System.out.println("Jumlah uang zakat yang terkumpul : Rp. " + totalUangZakat);
    System.out.println("Jumlah uang sedekah yang terkumpul : Rp. " + totalUangSedekah);
  }
}