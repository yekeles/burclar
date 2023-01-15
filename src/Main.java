import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.print("Hangi ayda doğdunuz : ");
        month = input.nextInt();

        System.out.print("Hangi gün doğdunuz : ");
        day = input.nextInt();

        // Ocak Ayı
        if (month == 1) {
            if ((day >= 1) && (day <= 31)) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.println("Oğlak Burcusunuz ...");
                } else if ((day >= 22) && (day <= 31)) {
                    System.out.println("Kova Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }

        // Şubat Ayı
        if (month == 2) {
            if ((day >= 1) && (day <= 29)) {
                if ((day >= 1) && (day <= 19)) {
                    System.out.println("OKova Burcusunuz ...");
                } else if ((day >= 20) && (day <= 29)) {
                    System.out.println("Balık Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }

        //Mart Ayı
        if (month == 3) {
            if ((day >= 1) && (day <= 31)) {
                if ((day >= 1) && (day <= 20)) {
                    System.out.println("Balık Burcusunuz ...");
                } else if ((day >= 21) && (day <= 31)) {
                    System.out.println("Koç Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }


        // Nisan Ayı
        if (month == 4) {
            if ((day >= 1) && (day <= 30)) {
                if ((day >= 1) && (day <= 20)) {
                    System.out.println("Koç Burcusunuz ...");
                } else if ((day >= 21) && (day <= 30)) {
                    System.out.println("Boğa Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }


        // Mayıs Ayı
        if (month == 5) {
            if ((day >= 1) && (day <= 31)) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.println("Boğa Burcusunuz ...");
                } else if ((day >= 22) && (day <= 31)) {
                    System.out.println("ikizler Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }


        // Haziran Ayı
        if (month == 6) {
            if ((day >= 1) && (day <= 30)) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("İkizler Burcusunuz ...");
                } else if ((day >= 23) && (day <= 30)) {
                    System.out.println("Yengeç Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }


        // Temmuz Ayı
        if (month == 7) {
            if ((day >= 1) && (day <= 31)) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Yengeç Burcusunuz ...");
                } else if ((day >= 23) && (day <= 31)) {
                    System.out.println("Aslan Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }


        // Ağustos Ayı
        if (month == 8) {
            if ((day >= 1) && (day <= 31)) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Aslan Burcusunuz ...");
                } else if ((day >= 23) && (day <= 31)) {
                    System.out.println("Başak Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }

        // Eylül Ayı
        if (month == 9) if ((day >= 1) && (day <= 30)) {
            if ((day >= 1) && (day <= 22)) {
                System.out.println("Başak Burcusunuz ...");
            } else if ((day >= 23) && (day <= 30)) {
                System.out.println("Terazi Burcusunuz...");
            }
        } else {
            System.out.println("Geçersiz bir gün girdiniz...");
        }


        // Ekim Ayı
        if (month == 10) {
            if ((day >= 1) && (day <= 31)) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.println("Terazi Burcusunuz ...");
                } else if ((day >= 23) && (day <= 31)) {
                    System.out.println("Akrep Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }

        // Kasım Ayı
        if (month == 11) {
            if ((day >= 1) && (day <= 30)) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.println("Akrep Burcusunuz ...");
                } else if ((day >= 22) && (day <= 30)) {
                    System.out.println("Yay Burcusunuz...");
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");
                }
            }
        }


            // Aralık Ayı
            if (month == 12) {
                if ((day >= 1) && (day <= 31)) {
                    if ((day >= 1) && (day <= 21)) {
                        System.out.println("Yay Burcusunuz ...");
                    } else if ((day >= 22) && (day <= 31)) {
                        System.out.println("Oğlak Burcusunuz...");
                    }
                } else {
                    System.out.println("Geçersiz bir gün girdiniz...");

                }

            }
        System.out.println("Program Bitti !...");
        }
    }
