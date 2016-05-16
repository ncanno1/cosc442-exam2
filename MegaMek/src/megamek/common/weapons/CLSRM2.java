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
 * The Class CLSRM2.
 *
 * @author Sebastian Brocks
 */
public class CLSRM2 extends SRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8216939998088201265L;

    /**
     * Instantiates a new CLSR m2.
     */
    public CLSRM2() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "SRM 2";
        this.setInternalName("CLSRM2");
        this.addLookupName("Clan SRM-2");
        this.addLookupName("Clan SRM 2");
        this.heat = 2;
        this.rackSize = 2;
        this.shortRange = 3;
        this.mediumRange = 6;
        this.longRange = 9;
        this.extremeRange = 12;
        this.tonnage = 0.5f;
        this.criticals = 1;
        this.bv = 21;
        this.flags |= F_NO_FIRES;
        this.cost = 10000;
        this.shortAV = 2;
        this.maxRange = RANGE_SHORT;
    }
}
