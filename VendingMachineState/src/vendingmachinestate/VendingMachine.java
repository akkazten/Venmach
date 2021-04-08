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
// This is like Context
public class VendingMachine implements VendingMachineState
{

 private VendingMachineState vendingMachineState;

 public VendingMachine()
 {
 vendingMachineState = new NoMoneyState();
 }

 public VendingMachineState getVendingMachineState()
 {
 return vendingMachineState;
 }

 public void setVendingMachineState( VendingMachineState vendingMachineState )
 {
 this.vendingMachineState = vendingMachineState;
 }

 @Override
 public void selectProductAndInsertMoney( int amount, String productName )
 {
 vendingMachineState.selectProductAndInsertMoney(amount, productName);
 VendingMachineState hasMoneyState = new HasMoneyState();
 /*
  * Money has been inserted so vending Machine changed the
  * internal state to 'hasMoneyState'
  */
 
 if( vendingMachineState instanceof NoMoneyState )
 {
 setVendingMachineState(hasMoneyState);
 System.out.println("Внутреннее состояние торгового автомата было перенесено на : "
                 + vendingMachineState.getClass().getName());
 }

 }

 @Override
 public void dispenseProduct()
 {
 VendingMachineState noMoenyState = new NoMoneyState();
 vendingMachineState.dispenseProduct();

 /*
  * Product has been dispensed so vending Machine changed the
  * internal state to 'NoMoneyState'
  */
 if( vendingMachineState instanceof HasMoneyState )
 {
 setVendingMachineState(noMoenyState);
 System.out.println("Внутреннее состояние торгового автомата было перенесено на : "
                 + vendingMachineState.getClass().getName());
 }

 }

}

