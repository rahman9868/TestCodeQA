/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chairul;

/**
 *
 * @author crhnt
 */
public class Question_1 {
   
  public static void main(String[] args)
  {
	int input =10;
    for (int i= input; i > 0; i--){
      for (int x = 1; x <= input; x++){
      	System.out.print(x);
      }
      for (int y = input - 1; y >= 1; y--){
      	System.out.print(y);
      }
      System.out.println();
      input--;
    }
  
}

}
