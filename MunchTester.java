import java.io.File;
import java.util.Scanner; 
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class MunchTester {
   private static String OS = System.getProperty("os.name").toLowerCase();
   private static String message = 
    "           _   _        _                  _              _             _       _     _          _            \n"  + 
 "          /\\_\\/\\_\\ _   /\\_\\               /\\ \\     _    /\\ \\           / /\\    / /\\  /\\ \\       /\\ \\     _    \n"  + 
 "         / / / / //\\_\\/ / /         _    /  \\ \\   /\\_\\ /  \\ \\         / / /   / / /  \\ \\ \\     /  \\ \\   /\\_\\  \n"  + 
 "        /\\ \\/ \\ \\/ / /\\ \\ \\__      /\\_\\ / /\\ \\ \\_/ / // /\\ \\ \\       / /_/   / / /   /\\ \\_\\   / /\\ \\ \\_/ / /  \n"  + 
 "       /  \\____\\__/ /  \\ \\___\\    / / // / /\\ \\___/ // / /\\ \\ \\     / /\\ \\__/ / /   / /\\/_/  / / /\\ \\___/ /   \n"  + 
 "      / /\\/________/    \\__  /   / / // / /  \\/____// / /  \\ \\_\\   / /\\ \\___\\/ /   / / /    / / /  \\/____/    \n"  + 
 "     / / /\\/_// / /     / / /   / / // / /    / / // / /    \\/_/  / / /\\/___/ /   / / /    / / /    / / /     \n"  + 
 "    / / /    / / /     / / /   / / // / /    / / // / /          / / /   / / /   / / /    / / /    / / /      \n"  + 
 "   / / /    / / /     / / /___/ / // / /    / / // / /________  / / /   / / /___/ / /__  / / /    / / /       \n"  + 
 "   \\/_/    / / /     / / /____\\/ // / /    / / // / /_________\\/ / /   / / //\\__\\/_/___\\/ / /    / / /        \n"  + 
 "           \\/_/      \\/_________/ \\/_/     \\/_/ \\/____________/\\/_/    \\/_/ \\/_________/\\/_/     \\/_/" ; 
   public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in); 
      // System.out.println("This will kill your computer, press 'control/command+c' to kill the process");
      //change number 10 to however much you want or use input method
		// munchMe(10);
      
      //input method
      System.out.print("Munchin' powa: ");
      int munchinpowa = in.nextInt();
      munchMe(munchinpowa);
	}

	public static void munchMe(int n) throws IOException {
		int base = 0;
      if (isWindows()) {
            while(base < n) {
			FileUtils.writeStringToFile(new File("./Muncher" + base + ".txt"), message);
			base++;
			// if(createdFile.createNewFile()) {
// 				// System.out.println("Munched");
// 			} else {				
//             // System.out.println("Munched incorrectly");
//             break;
// 			}

        } }else if (isMac()) {
            while(base < n) {
			FileUtils.writeStringToFile(new File("./Muncher" + base + ".txt"), message);
			base++;
			// if(createdFile.createNewFile()) {
// 				// System.out.println("Munched");
// 			} else {				
//             // System.out.println("Munched incorrectly");
//             break;
// 			}
// 
        }} else if (isUnix()) {
            while(base < n) {
			
         FileUtils.writeStringToFile(new File("./Muncher" + base + ".txt"), message);
			base++;

			// if(createdFile.createNewFile()) {
//          System.out.println("yo1");
				// System.out.println("Munched");
			// } else {				
            // System.out.println("Munched incorrectly");
            // break;
// 			}

        } } else if (isSolaris()) {
            while(base < n) {
            FileUtils.writeStringToFile(new File("./Muncher" + base + ".txt"), message); 
			// File createdFile = new File("./Muncher" + base + ".txt");
			base++;
         
			// if(createdFile.createNewFile()) {
				// System.out.println("Munched");
			// } else {				
//             System.out.println("Munched incorrectly");
//             System.out.println("Your OS is not supported!!");
//             break;
// 			}

        }        } else {
            System.out.println("Your OS is not supported!!");
        }
		
		}

	//  public void 
    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }

    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }
	

}

