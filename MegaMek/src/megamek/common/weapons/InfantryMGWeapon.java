/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.IGame;
import megamek.common.TechConstants;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class InfantryMGWeapon.
 *
 * @author Sebastian Brocks
 */
public class InfantryMGWeapon extends InfantryWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3434311797513896108L;

    /**
     * Instantiates a new infantry mg weapon.
     */
    public InfantryMGWeapon() {
        super();
        this.techLevel = TechConstants.T_INTRO_BOXSET;
        this.name = "Infantry MG";
        this.setInternalName(this.name);
        this.addLookupName("InfantryMG");
        this.ammoType = AmmoType.T_MG;
        this.shortRange = 1;
        this.mediumRange = 2;
        this.longRange = 3;
        this.extremeRange = 4;
        // machine gun (support), TM p. 300 
        this.cost = 1750;
        // machine gun (support) TM p. 319
        this.bv = 3.93;
        this.flags |= F_DIRECT_FIRE | F_NO_FIRES | F_BALLISTIC;
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     *      megamek.common.actions.WeaponAttackAction, megamek.common.IGame)
     */
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame game, Server server) {
        return new InfantryMGHandler(toHit, waa, game, server);
    }
}
