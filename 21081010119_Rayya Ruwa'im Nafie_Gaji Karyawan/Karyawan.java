import java.util.Scanner;
public class Karyawan {
    String nama;
    String alamat;
    String pengalaman;
    String skill;
    String departemen; 

    public Karyawan(String nama, String alamat, String pengalaman, String skill, String departemen) {
        
        this.nama = nama;
        this.alamat = alamat;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.departemen = departemen;
    }   
    public int hitungGaji() {
        int salary = 0;

        switch (departemen) {
            case "IT":
                salary = 8000000;
                break;
            case "HRD":
                salary = 5000000;
                break;
            case "Finance":
                salary = 4000000;
                break;
            default:
                System.out.println("Departemen yang anda masukkan tidak valid.");
                System.exit(0);
        }
        switch (pengalaman) {
            case "Pemula":
                salary += 500000;
                break;
            case "Menengah":
                salary += 1000000;
                break;
            case "Expert":
                salary += 2000000;
                break;
            default:
                System.out.println("Pengalaman yang anda masukkan tidak valid.");
                System.exit(0);
        }
        switch (skill) {
            case "WEB":
                salary += 1000000;
                break;
            case "Mobile":
                salary += 2000000;
                break;
            case "Desktop":
                salary += 2500000;
                break;
            default:
                System.out.println("Skill yang anda masukkan tidak valid.");
                System.exit(0);
        }

        return salary;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Penghitungan Gaji Karyawan");

        System.out.println("Nama :");
        String nama = input.nextLine();

        System.out.println("Alamat :");
        String alamat = input.nextLine();

        System.out.println("Pengalaman (Pemula/Menengah/Expert):  :");
        String pengalaman = input.nextLine();

        System.out.println("Departemen (IT/HRD/Finance):  ");
        String departemen = input.nextLine();

        System.out.println("Skill (WEB/Mobile/Desktop):  ");
        String skill = input.nextLine();
        
        System.out.println("Menghitung gaji....");
        Karyawan user = new Karyawan(nama, alamat, pengalaman, skill, departemen);
        int salary = user.hitungGaji();

        System.out.println("Gaji Dari "+ nama + " Adalah " + salary);
    }
    }



    

   