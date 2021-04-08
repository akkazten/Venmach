/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachinestate;

/**
 *
 * @author Lenovo
 */
public class NoMoneyState implements VendingMachineState
{

 @Override
 public void selectProductAndInsertMoney( int amount, String productName )
 {
 System.out.println(amount + "Rs был вставлен и " + productName + " был выбран...");

 }

 @Override
 public void dispenseProduct()
 {
 System.out.println("Торговый автомат не может выдать товар, потому что деньги не вставлены и товар не выбран...");

 }

}

