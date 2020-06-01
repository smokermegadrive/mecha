/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechadecorator;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Smoker
 */
public class PunchAttack implements IAttack {
    int attk = 10;
    
    @Override
    public void attack(Mecha enemigo) {
        System.out.println("Vardios Punch");
        enemigo.defender(this.atk());
        if (enemigo.hp < 45) {
           attk = this.attk * 2;
        }
    }
   
    @Override
    public int atk() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        
        if (randomNum <= 25) {
            System.out.println("Critical Hit");
            return attk * 2;
        }
        return attk;
    }
    @Override
    public String toString() {
        return "Vardios Slash";
    }
}
