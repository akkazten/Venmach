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
public class Client
{

 public static void main( String[] args )
 {

 /*
  * Initially Vending Machine will be 'noMoneyState'
  */
 VendingMachine vendingMachine = new VendingMachine();

 System.out.println("Current VendingMachine State : "

 

                 + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

 vendingMachine.dispenseProduct();
 vendingMachine.selectProductAndInsertMoney(100, "Pepsi");

 /*
  * Money has been inserted so vending Machine changed the
  * internal state to 'hasMoneyState'
  */

 System.out.println("\nТекущее состояние торгового автомата : "
                 + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

 vendingMachine.selectProductAndInsertMoney(100, "Fanta");
 vendingMachine.dispenseProduct();

 /*
  * Product has been dispensed so vending Machine changed the
  * internal state to 'NoMoneyState'
  */
 
 System.out.println("\nТекущее состояние торгового автомата : "
                 + vendingMachine.getVendingMachineState().getClass().getName());

 }

}

