/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.BattleArmor;
import megamek.common.Compute;
import megamek.common.IGame;
import megamek.common.Infantry;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class BurstPulseLaserWeaponHandler.
 */
public class BurstPulseLaserWeaponHandler extends PulseLaserWeaponHandler {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7754921500244464882L;

    /**
     * Instantiates a new burst pulse laser weapon handler.
     *
     * @param toHit the to hit
     * @param waa the waa
     * @param g the g
     * @param s the s
     */
    public BurstPulseLaserWeaponHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame g, Server s) {
        super(toHit, waa, g, s);
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.WeaponHandler#calcDamagePerHit()
     */
    protected int calcDamagePerHit() {
        if (target instanceof Infantry && !(target instanceof BattleArmor)) {
            int toReturn = Compute.d6(2);
            if (bGlancing)
                toReturn = (int) Math.floor(toReturn / 2.0);
            if (bDirect)
                toReturn += toHit.getMoS()/3;
            return toReturn;
        } else
            return super.calcDamagePerHit();
    }

}