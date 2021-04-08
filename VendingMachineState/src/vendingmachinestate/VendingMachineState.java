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
public interface VendingMachineState
{

 public void selectProductAndInsertMoney(int amount,String productName);

 public void dispenseProduct();

}
