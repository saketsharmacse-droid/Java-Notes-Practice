package Conditionals.PracticeSet;

import java.util.Scanner;

//identify the type of website: .ord, .in, .com
public class program6 {
    static void main() {
        System.out.println("Enter the website: ");
        Scanner sc = new Scanner(System.in);

        String website = sc.nextLine();

      if(website.endsWith(".com")){
          System.out.println("Commercial Website");
      }
      else if(website.endsWith(".org")){
          System.out.println("Organisational Website");
      }
      else if(website.endsWith(".in")){
          System.out.println("Indian Website");
      }
    }
}
