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

import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class ISStreakSRM2.
 *
 * @author Sebastian Brocks
 */
public class ISStreakSRM2 extends StreakSRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2636425754066916235L;

    /**
     * Instantiates a new checks if is streak sr m2.
     */
    public ISStreakSRM2() {
        super();
        this.techLevel = TechConstants.T_IS_TW_NON_BOX;
        this.name = "Streak SRM 2";
        this.setInternalName("ISStreakSRM2");
        this.addLookupName("IS Streak SRM-2");
        this.addLookupName("IS Streak SRM 2");
        this.heat = 2;
        this.rackSize = 2;
        this.shortRange = 3;
        this.mediumRange = 6;
        this.longRange = 9;
        this.extremeRange = 12;
        this.tonnage = 1.5f;
        this.criticals = 1;
        this.flags |= F_NO_FIRES;
        this.bv = 30;
        this.cost = 15000;
        this.shortAV = 4;
        this.maxRange = RANGE_SHORT;
    }
}
