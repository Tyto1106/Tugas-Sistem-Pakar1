import java.util.*;


/**
 * UI sistem pakar untuk memeriksa apakah g bernilai true dari fakta a, b, c, f  
 * Sistem ini memiliki 4 pertanyaan yang akan diberikan pada user
 * 4 pertanyaan merepresentasikan 4 fakta
 * fact: a, b, c, f
 * conclussion: g
 * @author AERO
 */
public class UI {
    
    private ArrayList<String> questions;
    private int answers[];
    
    public int firstQuestion(){
        
        int gejalaPertama;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dari gejala-gejala di bawah ini mana yang ada pada tanaman jagung anda? \n "
                + "1. Apakah tanaman jagung Anda mengalami perubahan warna daun menjadi klorotik (menguning)? \n "
                + "2. Apakah daun-daun tanaman jagung Anda terlihat layu? \n "
                + "3. Apakah tanaman jagung Anda memiliki bintik-bintik kecil berwarna cokelat atau kuning di permukaan daunnya? \n "
                + "4. Apakah tongkol jagung pada tanaman Anda mengalami pembengkakan? \n "
                + "5. Apakah Bapak/Ibu menemukan lubang kecil di daun? \n "
                + "6. Apakah ada lubang melintang di daun pada tahap vegetatif? \n "
                + "0. tidak satupun di atas");
        gejalaPertama = sc.nextInt();
        
        return gejalaPertama;
    }
    
    public void tes1(int a){
        System.out.println("gejala pertama adalah " + a);
    }
    
    
}
