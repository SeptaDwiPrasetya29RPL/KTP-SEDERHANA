package ktpsederhana;
import java.util.Scanner;
public class KTPsederhana {

    
    public static void main(String[] args) {
     
        String prov, kab, nik, nama, ttl, kelamin, alamat, agama, pekerjaan;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("PROVINSI ");
        prov = scan.nextLine();
        System.out.print("KABUPATEN ");
        prov = scan.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("NIK = ");
        nik = scan.nextLine();
        System.out.print("NAMA = ");
        nama = scan.nextLine();
        System.out.print("TEMPAT/TANGGAL LAHIR = ");
        ttl = scan.nextLine();
        System.out.print("JENIS KELAMIN = ");
        kelamin = scan.nextLine();
        System.out.print("ALAMAT = ");
        alamat = scan.nextLine();
        System.out.print("AGAMA = ");
        kelamin = scan.nextLine();
        System.out.print("PEKERJAAN = ");
        pekerjaan = scan.nextLine();
        System.out.println("-------------------------------------");
            
    }
    
    
    
}
