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
public class HasMoneyState implements VendingMachineState
{

 @Override
 public void selectProductAndInsertMoney( int amount, String productName )
 {
 System.out.println("Товар уже выбран в торговом автомате, поэтому подождите, пока он завершит текущий процесс выдачи ... ");

 }

 @Override
 public void dispenseProduct()
 {
 System.out.println("Торговый автомат выдал товар ...");

 }

}
